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
import io.swagger.client.model.ComicDataContainer;
import io.swagger.v3.oas.annotations.media.Schema;
/**
 * ComicDataWrapper
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2025-02-21T01:26:09.968009500-05:00[America/Lima]")
public class ComicDataWrapper {
  @JsonProperty("code")
  private Integer code = null;

  @JsonProperty("status")
  private String status = null;

  @JsonProperty("copyright")
  private String copyright = null;

  @JsonProperty("attributionText")
  private String attributionText = null;

  @JsonProperty("attributionHTML")
  private String attributionHTML = null;

  @JsonProperty("data")
  private ComicDataContainer data = null;

  @JsonProperty("etag")
  private String etag = null;

  public ComicDataWrapper code(Integer code) {
    this.code = code;
    return this;
  }

   /**
   * Get code
   * @return code
  **/
  @Schema(description = "")
  public Integer getCode() {
    return code;
  }

  public void setCode(Integer code) {
    this.code = code;
  }

  public ComicDataWrapper status(String status) {
    this.status = status;
    return this;
  }

   /**
   * A string description of the call status.
   * @return status
  **/
  @Schema(description = "A string description of the call status.")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public ComicDataWrapper copyright(String copyright) {
    this.copyright = copyright;
    return this;
  }

   /**
   * The copyright notice for the returned result.
   * @return copyright
  **/
  @Schema(description = "The copyright notice for the returned result.")
  public String getCopyright() {
    return copyright;
  }

  public void setCopyright(String copyright) {
    this.copyright = copyright;
  }

  public ComicDataWrapper attributionText(String attributionText) {
    this.attributionText = attributionText;
    return this;
  }

   /**
   * The attribution notice for this result.  Please display either this notice or the contents of the attributionHTML field on all screens which contain data from the Marvel Comics API.
   * @return attributionText
  **/
  @Schema(description = "The attribution notice for this result.  Please display either this notice or the contents of the attributionHTML field on all screens which contain data from the Marvel Comics API.")
  public String getAttributionText() {
    return attributionText;
  }

  public void setAttributionText(String attributionText) {
    this.attributionText = attributionText;
  }

  public ComicDataWrapper attributionHTML(String attributionHTML) {
    this.attributionHTML = attributionHTML;
    return this;
  }

   /**
   * An HTML representation of the attribution notice for this result.  Please display either this notice or the contents of the attributionText field on all screens which contain data from the Marvel Comics API.
   * @return attributionHTML
  **/
  @Schema(description = "An HTML representation of the attribution notice for this result.  Please display either this notice or the contents of the attributionText field on all screens which contain data from the Marvel Comics API.")
  public String getAttributionHTML() {
    return attributionHTML;
  }

  public void setAttributionHTML(String attributionHTML) {
    this.attributionHTML = attributionHTML;
  }

  public ComicDataWrapper data(ComicDataContainer data) {
    this.data = data;
    return this;
  }

   /**
   * Get data
   * @return data
  **/
  @Schema(description = "")
  public ComicDataContainer getData() {
    return data;
  }

  public void setData(ComicDataContainer data) {
    this.data = data;
  }

  public ComicDataWrapper etag(String etag) {
    this.etag = etag;
    return this;
  }

   /**
   * A digest value of the content returned by the call.
   * @return etag
  **/
  @Schema(description = "A digest value of the content returned by the call.")
  public String getEtag() {
    return etag;
  }

  public void setEtag(String etag) {
    this.etag = etag;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComicDataWrapper comicDataWrapper = (ComicDataWrapper) o;
    return Objects.equals(this.code, comicDataWrapper.code) &&
        Objects.equals(this.status, comicDataWrapper.status) &&
        Objects.equals(this.copyright, comicDataWrapper.copyright) &&
        Objects.equals(this.attributionText, comicDataWrapper.attributionText) &&
        Objects.equals(this.attributionHTML, comicDataWrapper.attributionHTML) &&
        Objects.equals(this.data, comicDataWrapper.data) &&
        Objects.equals(this.etag, comicDataWrapper.etag);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, status, copyright, attributionText, attributionHTML, data, etag);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComicDataWrapper {\n");
    
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    copyright: ").append(toIndentedString(copyright)).append("\n");
    sb.append("    attributionText: ").append(toIndentedString(attributionText)).append("\n");
    sb.append("    attributionHTML: ").append(toIndentedString(attributionHTML)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    etag: ").append(toIndentedString(etag)).append("\n");
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
