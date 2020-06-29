/**
 * Blockchain.com Exchange REST API
 * ## Introduction Welcome to Blockchain.com's Exchange API and developer documentation. These documents detail and give examples of various functionality offered by the API such as receiving real time market data, requesting balance information and performing trades. ## To Get Started Create or log into your existing Blockchain.com Exchange account Select API from the drop down menu Fill out form and click “Create New API Key Now” Once generated you can view your keys under API Settings 
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.blockchain.exchange.rest.model;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class Balance {
  
  @SerializedName("currency")
  private String currency = null;
  @SerializedName("balance")
  private Double balance = null;
  @SerializedName("available")
  private Double available = null;
  @SerializedName("balance_local")
  private Double balanceLocal = null;
  @SerializedName("available_local")
  private Double availableLocal = null;
  @SerializedName("rate")
  private Double rate = null;

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public String getCurrency() {
    return currency;
  }
  public void setCurrency(String currency) {
    this.currency = currency;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public Double getBalance() {
    return balance;
  }
  public void setBalance(Double balance) {
    this.balance = balance;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public Double getAvailable() {
    return available;
  }
  public void setAvailable(Double available) {
    this.available = available;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public Double getBalanceLocal() {
    return balanceLocal;
  }
  public void setBalanceLocal(Double balanceLocal) {
    this.balanceLocal = balanceLocal;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public Double getAvailableLocal() {
    return availableLocal;
  }
  public void setAvailableLocal(Double availableLocal) {
    this.availableLocal = availableLocal;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public Double getRate() {
    return rate;
  }
  public void setRate(Double rate) {
    this.rate = rate;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Balance balance = (Balance) o;
    return (this.currency == null ? balance.currency == null : this.currency.equals(balance.currency)) &&
        (this.balance == null ? balance.balance == null : this.balance.equals(balance.balance)) &&
        (this.available == null ? balance.available == null : this.available.equals(balance.available)) &&
        (this.balanceLocal == null ? balance.balanceLocal == null : this.balanceLocal.equals(balance.balanceLocal)) &&
        (this.availableLocal == null ? balance.availableLocal == null : this.availableLocal.equals(balance.availableLocal)) &&
        (this.rate == null ? balance.rate == null : this.rate.equals(balance.rate));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.currency == null ? 0: this.currency.hashCode());
    result = 31 * result + (this.balance == null ? 0: this.balance.hashCode());
    result = 31 * result + (this.available == null ? 0: this.available.hashCode());
    result = 31 * result + (this.balanceLocal == null ? 0: this.balanceLocal.hashCode());
    result = 31 * result + (this.availableLocal == null ? 0: this.availableLocal.hashCode());
    result = 31 * result + (this.rate == null ? 0: this.rate.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Balance {\n");
    
    sb.append("  currency: ").append(currency).append("\n");
    sb.append("  balance: ").append(balance).append("\n");
    sb.append("  available: ").append(available).append("\n");
    sb.append("  balanceLocal: ").append(balanceLocal).append("\n");
    sb.append("  availableLocal: ").append(availableLocal).append("\n");
    sb.append("  rate: ").append(rate).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}