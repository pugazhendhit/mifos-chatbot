/**
 * Copyright 2018 Dingfan Zhao
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */
/*
 * Apache Fineract API Documentation
 * Apache Fineract is a secure, multi-tenanted microfinance platform. <br />              The goal of the Apache Fineract API is to empower developers to build apps on top of the Apache Fineract Platform. The reference app [  https://demo.openmf.org  ] (username: mifos, password: password) works on the same demo tenant as the interactive links in this documentation.              <br/>The API                 is organized around REST [ https://en.wikipedia.org/wiki/Representational_state_transfer ]               <br/> Find out more about Apache Fineract on [ https://demo.openmf.org/api-docs/apiLive.htm#top ]              <br/> You can Try The API From Your Browser itself at [ https://demo.openmf.org/api-docs/apiLive.htm#interact ]              <br/> The Generic Options are available at [ https://demo.openmf.org/api-docs/apiLive.htm#genopts ]              <br/> Find out more about Updating Dates and Numbers at [ https://demo.openmf.org/api-docs/apiLive.htm#dates_and_numbers ]              <br/> For the Authentication and the Basic of HTTP and HTTPS refer [ https://demo.openmf.org/api-docs/apiLive.htm#authentication_overview ]              <br/> Check about ERROR codes at [ https://demo.openmf.org/api-docs/apiLive.htm#errors ]               <br/> <br/> Please refer to the old documentation for any documentation queries [ https://demo.openmf.org/api-docs/apiLive.htm ]              <br/>             ______________________________________________________________________________________________________________________________          
 *
 * OpenAPI spec version: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package org.mifos.chatbot.client.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.mifos.chatbot.client.model.GetRecurringCurrency;
import org.mifos.chatbot.client.model.GetRecurringTransactionType;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import org.threeten.bp.LocalDate;

/**
 * GetRecurringDepositAccountsRecurringDepositAccountIdTransactionsTemplateResponse
 */

public class GetRecurringDepositAccountsRecurringDepositAccountIdTransactionsTemplateResponse {
  @SerializedName("id")
  private Integer id = null;

  @SerializedName("transactionType")
  private GetRecurringTransactionType transactionType = null;

  @SerializedName("accountId")
  private Integer accountId = null;

  @SerializedName("accountNo")
  private String accountNo = null;

  @SerializedName("date")
  private LocalDate date = null;

  @SerializedName("currency")
  private GetRecurringCurrency currency = null;

  @SerializedName("amount")
  private BigDecimal amount = null;

  @SerializedName("reversed")
  private Boolean reversed = null;

  @SerializedName("paymentTypeOptions")
  private List<Integer> paymentTypeOptions = null;

  public GetRecurringDepositAccountsRecurringDepositAccountIdTransactionsTemplateResponse id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(example = "1", value = "")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public GetRecurringDepositAccountsRecurringDepositAccountIdTransactionsTemplateResponse transactionType(GetRecurringTransactionType transactionType) {
    this.transactionType = transactionType;
    return this;
  }

   /**
   * Get transactionType
   * @return transactionType
  **/
  @ApiModelProperty(value = "")
  public GetRecurringTransactionType getTransactionType() {
    return transactionType;
  }

  public void setTransactionType(GetRecurringTransactionType transactionType) {
    this.transactionType = transactionType;
  }

  public GetRecurringDepositAccountsRecurringDepositAccountIdTransactionsTemplateResponse accountId(Integer accountId) {
    this.accountId = accountId;
    return this;
  }

   /**
   * Get accountId
   * @return accountId
  **/
  @ApiModelProperty(example = "1", value = "")
  public Integer getAccountId() {
    return accountId;
  }

  public void setAccountId(Integer accountId) {
    this.accountId = accountId;
  }

  public GetRecurringDepositAccountsRecurringDepositAccountIdTransactionsTemplateResponse accountNo(String accountNo) {
    this.accountNo = accountNo;
    return this;
  }

   /**
   * Get accountNo
   * @return accountNo
  **/
  @ApiModelProperty(example = "000000001", value = "")
  public String getAccountNo() {
    return accountNo;
  }

  public void setAccountNo(String accountNo) {
    this.accountNo = accountNo;
  }

  public GetRecurringDepositAccountsRecurringDepositAccountIdTransactionsTemplateResponse date(LocalDate date) {
    this.date = date;
    return this;
  }

   /**
   * Get date
   * @return date
  **/
  @ApiModelProperty(example = "[2014, 6, 25]", value = "")
  public LocalDate getDate() {
    return date;
  }

  public void setDate(LocalDate date) {
    this.date = date;
  }

  public GetRecurringDepositAccountsRecurringDepositAccountIdTransactionsTemplateResponse currency(GetRecurringCurrency currency) {
    this.currency = currency;
    return this;
  }

   /**
   * Get currency
   * @return currency
  **/
  @ApiModelProperty(value = "")
  public GetRecurringCurrency getCurrency() {
    return currency;
  }

  public void setCurrency(GetRecurringCurrency currency) {
    this.currency = currency;
  }

  public GetRecurringDepositAccountsRecurringDepositAccountIdTransactionsTemplateResponse amount(BigDecimal amount) {
    this.amount = amount;
    return this;
  }

   /**
   * Get amount
   * @return amount
  **/
  @ApiModelProperty(example = "100000.0", value = "")
  public BigDecimal getAmount() {
    return amount;
  }

  public void setAmount(BigDecimal amount) {
    this.amount = amount;
  }

  public GetRecurringDepositAccountsRecurringDepositAccountIdTransactionsTemplateResponse reversed(Boolean reversed) {
    this.reversed = reversed;
    return this;
  }

   /**
   * Get reversed
   * @return reversed
  **/
  @ApiModelProperty(example = "false", value = "")
  public Boolean isReversed() {
    return reversed;
  }

  public void setReversed(Boolean reversed) {
    this.reversed = reversed;
  }

  public GetRecurringDepositAccountsRecurringDepositAccountIdTransactionsTemplateResponse paymentTypeOptions(List<Integer> paymentTypeOptions) {
    this.paymentTypeOptions = paymentTypeOptions;
    return this;
  }

  public GetRecurringDepositAccountsRecurringDepositAccountIdTransactionsTemplateResponse addPaymentTypeOptionsItem(Integer paymentTypeOptionsItem) {
    if (this.paymentTypeOptions == null) {
      this.paymentTypeOptions = new ArrayList<Integer>();
    }
    this.paymentTypeOptions.add(paymentTypeOptionsItem);
    return this;
  }

   /**
   * Get paymentTypeOptions
   * @return paymentTypeOptions
  **/
  @ApiModelProperty(example = "\"[]\"", value = "")
  public List<Integer> getPaymentTypeOptions() {
    return paymentTypeOptions;
  }

  public void setPaymentTypeOptions(List<Integer> paymentTypeOptions) {
    this.paymentTypeOptions = paymentTypeOptions;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetRecurringDepositAccountsRecurringDepositAccountIdTransactionsTemplateResponse getRecurringDepositAccountsRecurringDepositAccountIdTransactionsTemplateResponse = (GetRecurringDepositAccountsRecurringDepositAccountIdTransactionsTemplateResponse) o;
    return Objects.equals(this.id, getRecurringDepositAccountsRecurringDepositAccountIdTransactionsTemplateResponse.id) &&
        Objects.equals(this.transactionType, getRecurringDepositAccountsRecurringDepositAccountIdTransactionsTemplateResponse.transactionType) &&
        Objects.equals(this.accountId, getRecurringDepositAccountsRecurringDepositAccountIdTransactionsTemplateResponse.accountId) &&
        Objects.equals(this.accountNo, getRecurringDepositAccountsRecurringDepositAccountIdTransactionsTemplateResponse.accountNo) &&
        Objects.equals(this.date, getRecurringDepositAccountsRecurringDepositAccountIdTransactionsTemplateResponse.date) &&
        Objects.equals(this.currency, getRecurringDepositAccountsRecurringDepositAccountIdTransactionsTemplateResponse.currency) &&
        Objects.equals(this.amount, getRecurringDepositAccountsRecurringDepositAccountIdTransactionsTemplateResponse.amount) &&
        Objects.equals(this.reversed, getRecurringDepositAccountsRecurringDepositAccountIdTransactionsTemplateResponse.reversed) &&
        Objects.equals(this.paymentTypeOptions, getRecurringDepositAccountsRecurringDepositAccountIdTransactionsTemplateResponse.paymentTypeOptions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, transactionType, accountId, accountNo, date, currency, amount, reversed, paymentTypeOptions);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetRecurringDepositAccountsRecurringDepositAccountIdTransactionsTemplateResponse {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    transactionType: ").append(toIndentedString(transactionType)).append("\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    accountNo: ").append(toIndentedString(accountNo)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    reversed: ").append(toIndentedString(reversed)).append("\n");
    sb.append("    paymentTypeOptions: ").append(toIndentedString(paymentTypeOptions)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

