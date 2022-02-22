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
import com.mypurecloud.sdk.v2.model.AuditLogMessage;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * AuditRealtimeQueryResultsResponse
 */

public class AuditRealtimeQueryResultsResponse  implements Serializable {
  
  private List<AuditLogMessage> entities = new ArrayList<AuditLogMessage>();
  private Integer pageSize = null;
  private Integer pageNumber = null;
  private Long total = null;
  private Integer pageCount = null;

  
  /**
   **/
  public AuditRealtimeQueryResultsResponse entities(List<AuditLogMessage> entities) {
    this.entities = entities;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("entities")
  public List<AuditLogMessage> getEntities() {
    return entities;
  }
  public void setEntities(List<AuditLogMessage> entities) {
    this.entities = entities;
  }

  
  /**
   **/
  public AuditRealtimeQueryResultsResponse pageSize(Integer pageSize) {
    this.pageSize = pageSize;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("pageSize")
  public Integer getPageSize() {
    return pageSize;
  }
  public void setPageSize(Integer pageSize) {
    this.pageSize = pageSize;
  }

  
  /**
   **/
  public AuditRealtimeQueryResultsResponse pageNumber(Integer pageNumber) {
    this.pageNumber = pageNumber;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("pageNumber")
  public Integer getPageNumber() {
    return pageNumber;
  }
  public void setPageNumber(Integer pageNumber) {
    this.pageNumber = pageNumber;
  }

  
  /**
   **/
  public AuditRealtimeQueryResultsResponse total(Long total) {
    this.total = total;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("total")
  public Long getTotal() {
    return total;
  }
  public void setTotal(Long total) {
    this.total = total;
  }

  
  /**
   **/
  public AuditRealtimeQueryResultsResponse pageCount(Integer pageCount) {
    this.pageCount = pageCount;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("pageCount")
  public Integer getPageCount() {
    return pageCount;
  }
  public void setPageCount(Integer pageCount) {
    this.pageCount = pageCount;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AuditRealtimeQueryResultsResponse auditRealtimeQueryResultsResponse = (AuditRealtimeQueryResultsResponse) o;
    return Objects.equals(this.entities, auditRealtimeQueryResultsResponse.entities) &&
        Objects.equals(this.pageSize, auditRealtimeQueryResultsResponse.pageSize) &&
        Objects.equals(this.pageNumber, auditRealtimeQueryResultsResponse.pageNumber) &&
        Objects.equals(this.total, auditRealtimeQueryResultsResponse.total) &&
        Objects.equals(this.pageCount, auditRealtimeQueryResultsResponse.pageCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(entities, pageSize, pageNumber, total, pageCount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuditRealtimeQueryResultsResponse {\n");
    
    sb.append("    entities: ").append(toIndentedString(entities)).append("\n");
    sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
    sb.append("    pageNumber: ").append(toIndentedString(pageNumber)).append("\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
    sb.append("    pageCount: ").append(toIndentedString(pageCount)).append("\n");
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

