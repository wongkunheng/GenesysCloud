package com.mypurecloud.sdk.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import java.util.Objects;
import java.io.IOException;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * DialerAttemptLimitsConfigChangeRecallEntry
 */

public class DialerAttemptLimitsConfigChangeRecallEntry  implements Serializable {
  
  private Integer nbrAttempts = null;
  private Integer minutesBetweenAttempts = null;
  private Object additionalProperties = null;

  
  /**
   **/
  public DialerAttemptLimitsConfigChangeRecallEntry nbrAttempts(Integer nbrAttempts) {
    this.nbrAttempts = nbrAttempts;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("nbrAttempts")
  public Integer getNbrAttempts() {
    return nbrAttempts;
  }
  public void setNbrAttempts(Integer nbrAttempts) {
    this.nbrAttempts = nbrAttempts;
  }

  
  /**
   **/
  public DialerAttemptLimitsConfigChangeRecallEntry minutesBetweenAttempts(Integer minutesBetweenAttempts) {
    this.minutesBetweenAttempts = minutesBetweenAttempts;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("minutesBetweenAttempts")
  public Integer getMinutesBetweenAttempts() {
    return minutesBetweenAttempts;
  }
  public void setMinutesBetweenAttempts(Integer minutesBetweenAttempts) {
    this.minutesBetweenAttempts = minutesBetweenAttempts;
  }

  
  /**
   **/
  public DialerAttemptLimitsConfigChangeRecallEntry additionalProperties(Object additionalProperties) {
    this.additionalProperties = additionalProperties;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("additionalProperties")
  public Object getAdditionalProperties() {
    return additionalProperties;
  }
  public void setAdditionalProperties(Object additionalProperties) {
    this.additionalProperties = additionalProperties;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DialerAttemptLimitsConfigChangeRecallEntry dialerAttemptLimitsConfigChangeRecallEntry = (DialerAttemptLimitsConfigChangeRecallEntry) o;
    return Objects.equals(this.nbrAttempts, dialerAttemptLimitsConfigChangeRecallEntry.nbrAttempts) &&
        Objects.equals(this.minutesBetweenAttempts, dialerAttemptLimitsConfigChangeRecallEntry.minutesBetweenAttempts) &&
        Objects.equals(this.additionalProperties, dialerAttemptLimitsConfigChangeRecallEntry.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nbrAttempts, minutesBetweenAttempts, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DialerAttemptLimitsConfigChangeRecallEntry {\n");
    
    sb.append("    nbrAttempts: ").append(toIndentedString(nbrAttempts)).append("\n");
    sb.append("    minutesBetweenAttempts: ").append(toIndentedString(minutesBetweenAttempts)).append("\n");
    sb.append("    additionalProperties: ").append(toIndentedString(additionalProperties)).append("\n");
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

