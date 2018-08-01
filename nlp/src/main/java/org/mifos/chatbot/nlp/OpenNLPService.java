package org.mifos.chatbot.nlp;

import opennlp.tools.namefind.NameFinderME;
import opennlp.tools.namefind.TokenNameFinderModel;
import opennlp.tools.sentdetect.SentenceDetectorME;
import opennlp.tools.sentdetect.SentenceModel;
import opennlp.tools.tokenize.Tokenizer;
import opennlp.tools.tokenize.TokenizerME;
import opennlp.tools.tokenize.TokenizerModel;
import opennlp.tools.util.Span;
import org.mifos.chatbot.core.NLPService;
import org.mifos.chatbot.core.model.Intent;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
public class OpenNLPService implements NLPService {

    Logger logger = LoggerFactory.getLogger(OpenNLPService.class);

    /**
     * This method is to recognise user's input to find out what is their intention
     *
     * Instead of finding a specific API to handle the result, the recognize function is used to narrow down the scope to several functions,
     * then apply further processing
     *
     * @param text This is the message of user input, it may contain several sentences about their commands
     * @return user's intention, basically what they really want to do
     *
     * @author Zhao Dingfan
     */
    @Override
    public Intent[] recognize(String text) {
        // TODO: provide confidence level for recognition result
        try {
            String[] sentences = detectSentence(text);

            List<String> tokens = new ArrayList<>();
            for(String sentence : sentences) {
                tokens.addAll(Arrays.asList(tokenize(sentence)));
            }

            String[] tokenString = new String[tokens.size()];
            tokenString = tokens.toArray(tokenString);
            Span[] resultSpans = findName(tokenString);

            Intent[] resultIntents = new Intent[resultSpans.length];
            for(int i = 0; i < resultIntents.length ; i++) {
                StringBuilder sb = new StringBuilder();
                sb.append(tokenString[resultSpans[i].getStart()]);
                for(int j = resultSpans[i].getStart()+1 ; j < resultSpans[i].getEnd() ; j++) {
                    sb.append(" ");
                    sb.append(tokenString[j]);
                }
                resultIntents[i] = new Intent(sb.toString());
            }

            return resultIntents;
        } catch (IOException e) {
            logger.error("Cannot read model information : ", e);
        }

        return null;
    }

    private String[] detectSentence(String paragraph) throws IOException {
        InputStream is = this.getClass().getClassLoader().getResourceAsStream("models/en-sent.bin");
        SentenceModel model = new SentenceModel(is);
        SentenceDetectorME sdetector = new SentenceDetectorME(model);

        String sentences[] = sdetector.sentDetect(paragraph);
        for(String sentence : sentences) {
            System.out.println(sentence);
        }
        is.close();

        return sentences;
    }

    private String[] tokenize(String sentence) throws IOException {
        InputStream is = this.getClass().getClassLoader().getResourceAsStream("models/en-token.bin");
        TokenizerModel model = new TokenizerModel(is);
        Tokenizer tokenizer = new TokenizerME(model);

        String tokens[] = tokenizer.tokenize(sentence);
        is.close();

        return tokens;
    }

    private Span[] findName(String[] tokens) throws IOException {
        InputStream is = this.getClass().getClassLoader().getResourceAsStream("models/en-ner-second-try.bin");
        TokenNameFinderModel model = new TokenNameFinderModel(is);
        NameFinderME nameFinder = new NameFinderME(model);

        Span nameSpans[] = nameFinder.find(tokens);

        System.out.println(nameSpans.length + " spans found. ");
        System.out.println(System.getProperty("user.dir"));

        is.close();
        return nameSpans;
    }
}
