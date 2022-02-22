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
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * WemCoachingAppointmentTopicCoachingAppointmentExternalLink
 */

public class WemCoachingAppointmentTopicCoachingAppointmentExternalLink  implements Serializable {
  
  private String externalLink = null;

  private static class ActionEnumDeserializer extends StdDeserializer<ActionEnum> {
    public ActionEnumDeserializer() {
      super(ActionEnumDeserializer.class);
    }

    @Override
    public ActionEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return ActionEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Gets or Sets action
   */
 @JsonDeserialize(using = ActionEnumDeserializer.class)
  public enum ActionEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    ADD("Add"),
    REMOVE("Remove"),
    NONE("None");

    private String value;

    ActionEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static ActionEnum fromString(String key) {
      if (key == null) return null;

      for (ActionEnum value : ActionEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return ActionEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private ActionEnum action = null;

  
  /**
   **/
  public WemCoachingAppointmentTopicCoachingAppointmentExternalLink externalLink(String externalLink) {
    this.externalLink = externalLink;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("externalLink")
  public String getExternalLink() {
    return externalLink;
  }
  public void setExternalLink(String externalLink) {
    this.externalLink = externalLink;
  }

  
  /**
   **/
  public WemCoachingAppointmentTopicCoachingAppointmentExternalLink action(ActionEnum action) {
    this.action = action;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("action")
  public ActionEnum getAction() {
    return action;
  }
  public void setAction(ActionEnum action) {
    this.action = action;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WemCoachingAppointmentTopicCoachingAppointmentExternalLink wemCoachingAppointmentTopicCoachingAppointmentExternalLink = (WemCoachingAppointmentTopicCoachingAppointmentExternalLink) o;
    return Objects.equals(this.externalLink, wemCoachingAppointmentTopicCoachingAppointmentExternalLink.externalLink) &&
        Objects.equals(this.action, wemCoachingAppointmentTopicCoachingAppointmentExternalLink.action);
  }

  @Override
  public int hashCode() {
    return Objects.hash(externalLink, action);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WemCoachingAppointmentTopicCoachingAppointmentExternalLink {\n");
    
    sb.append("    externalLink: ").append(toIndentedString(externalLink)).append("\n");
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
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

