/*
 * 
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: Cable
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.swagger.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
/**
 * ComicDate
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2025-02-21T01:26:09.968009500-05:00[America/Lima]")
public class ComicDate {
  @JsonProperty("type")
  private String type = null;

  @JsonProperty("date")
  private java.util.Date date = null;

  public ComicDate type(String type) {
    this.type = type;
    return this;
  }

   /**
   * A description of the date (e.g. onsale date, FOC date).
   * @return type
  **/
  @Schema(description = "A description of the date (e.g. onsale date, FOC date).")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public ComicDate date(java.util.Date date) {
    this.date = date;
    return this;
  }

   /**
   * Get date
   * @return date
  **/
  @Schema(description = "")
  public java.util.Date getDate() {
    return date;
  }

  public void setDate(java.util.Date date) {
    this.date = date;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComicDate comicDate = (ComicDate) o;
    return Objects.equals(this.type, comicDate.type) &&
        Objects.equals(this.date, comicDate.date);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, date);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComicDate {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
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
