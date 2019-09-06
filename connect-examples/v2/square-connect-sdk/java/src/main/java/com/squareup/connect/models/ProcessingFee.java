/*
 * Square Connect API
 * Client library for accessing the Square Connect APIs
 *
 * OpenAPI spec version: 2.0
 * Contact: developers@squareup.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.squareup.connect.models;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.squareup.connect.models.Money;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Represents Square processing fee.
 */
@ApiModel(description = "Represents Square processing fee.")

public class ProcessingFee {
  @JsonProperty("effective_at")
  private String effectiveAt = null;

  @JsonProperty("type")
  private String type = null;

  @JsonProperty("amount_money")
  private Money amountMoney = null;

  public ProcessingFee effectiveAt(String effectiveAt) {
    this.effectiveAt = effectiveAt;
    return this;
  }

   /**
   * Timestamp of when the fee takes effect, in RFC 3339 format.
   * @return effectiveAt
  **/
  @ApiModelProperty(value = "Timestamp of when the fee takes effect, in RFC 3339 format.")
  public String getEffectiveAt() {
    return effectiveAt;
  }

  public void setEffectiveAt(String effectiveAt) {
    this.effectiveAt = effectiveAt;
  }

  public ProcessingFee type(String type) {
    this.type = type;
    return this;
  }

   /**
   * The type of fee assessed or adjusted. Can be one of: `INITIAL`, `ADJUSTMENT`.
   * @return type
  **/
  @ApiModelProperty(value = "The type of fee assessed or adjusted. Can be one of: `INITIAL`, `ADJUSTMENT`.")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public ProcessingFee amountMoney(Money amountMoney) {
    this.amountMoney = amountMoney;
    return this;
  }

   /**
   * The fee amount assessed or adjusted by Square. May be negative.  Positive values represent funds being assessed, while negative values represent funds being returned.
   * @return amountMoney
  **/
  @ApiModelProperty(value = "The fee amount assessed or adjusted by Square. May be negative.  Positive values represent funds being assessed, while negative values represent funds being returned.")
  public Money getAmountMoney() {
    return amountMoney;
  }

  public void setAmountMoney(Money amountMoney) {
    this.amountMoney = amountMoney;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProcessingFee processingFee = (ProcessingFee) o;
    return Objects.equals(this.effectiveAt, processingFee.effectiveAt) &&
        Objects.equals(this.type, processingFee.type) &&
        Objects.equals(this.amountMoney, processingFee.amountMoney);
  }

  @Override
  public int hashCode() {
    return Objects.hash(effectiveAt, type, amountMoney);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProcessingFee {\n");

    sb.append("    effectiveAt: ").append(toIndentedString(effectiveAt)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    amountMoney: ").append(toIndentedString(amountMoney)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
