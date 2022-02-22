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
 * ConversationCobrowseEventTopicJourneyCustomer
 */

public class ConversationCobrowseEventTopicJourneyCustomer  implements Serializable {
  
  private String id = null;
  private String idType = null;

  
  /**
   **/
  public ConversationCobrowseEventTopicJourneyCustomer id(String id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  
  /**
   **/
  public ConversationCobrowseEventTopicJourneyCustomer idType(String idType) {
    this.idType = idType;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("idType")
  public String getIdType() {
    return idType;
  }
  public void setIdType(String idType) {
    this.idType = idType;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConversationCobrowseEventTopicJourneyCustomer conversationCobrowseEventTopicJourneyCustomer = (ConversationCobrowseEventTopicJourneyCustomer) o;
    return Objects.equals(this.id, conversationCobrowseEventTopicJourneyCustomer.id) &&
        Objects.equals(this.idType, conversationCobrowseEventTopicJourneyCustomer.idType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, idType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConversationCobrowseEventTopicJourneyCustomer {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    idType: ").append(toIndentedString(idType)).append("\n");
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

