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
import io.swagger.client.model.CharacterList;
import io.swagger.client.model.ComicList;
import io.swagger.client.model.ComicSummary;
import io.swagger.client.model.CreatorList;
import io.swagger.client.model.EventList;
import io.swagger.client.model.Image;
import io.swagger.client.model.SeriesList;
import io.swagger.v3.oas.annotations.media.Schema;
/**
 * Story
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2025-02-21T01:26:09.968009500-05:00[America/Lima]")
public class Story {
  @JsonProperty("id")
  private Integer id = null;

  @JsonProperty("title")
  private String title = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("resourceURI")
  private String resourceURI = null;

  @JsonProperty("type")
  private String type = null;

  @JsonProperty("modified")
  private java.util.Date modified = null;

  @JsonProperty("thumbnail")
  private Image thumbnail = null;

  @JsonProperty("comics")
  private ComicList comics = null;

  @JsonProperty("series")
  private SeriesList series = null;

  @JsonProperty("events")
  private EventList events = null;

  @JsonProperty("characters")
  private CharacterList characters = null;

  @JsonProperty("creators")
  private CreatorList creators = null;

  @JsonProperty("originalissue")
  private ComicSummary originalissue = null;

  public Story id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @Schema(description = "")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public Story title(String title) {
    this.title = title;
    return this;
  }

   /**
   * The story title.
   * @return title
  **/
  @Schema(description = "The story title.")
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public Story description(String description) {
    this.description = description;
    return this;
  }

   /**
   * A short description of the story.
   * @return description
  **/
  @Schema(description = "A short description of the story.")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Story resourceURI(String resourceURI) {
    this.resourceURI = resourceURI;
    return this;
  }

   /**
   * The canonical URL identifier for this resource. 
   * @return resourceURI
  **/
  @Schema(description = "The canonical URL identifier for this resource. ")
  public String getResourceURI() {
    return resourceURI;
  }

  public void setResourceURI(String resourceURI) {
    this.resourceURI = resourceURI;
  }

  public Story type(String type) {
    this.type = type;
    return this;
  }

   /**
   * The story type e.g. interior story, cover, text story.
   * @return type
  **/
  @Schema(description = "The story type e.g. interior story, cover, text story.")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public Story modified(java.util.Date modified) {
    this.modified = modified;
    return this;
  }

   /**
   * Get modified
   * @return modified
  **/
  @Schema(description = "")
  public java.util.Date getModified() {
    return modified;
  }

  public void setModified(java.util.Date modified) {
    this.modified = modified;
  }

  public Story thumbnail(Image thumbnail) {
    this.thumbnail = thumbnail;
    return this;
  }

   /**
   * Get thumbnail
   * @return thumbnail
  **/
  @Schema(description = "")
  public Image getThumbnail() {
    return thumbnail;
  }

  public void setThumbnail(Image thumbnail) {
    this.thumbnail = thumbnail;
  }

  public Story comics(ComicList comics) {
    this.comics = comics;
    return this;
  }

   /**
   * Get comics
   * @return comics
  **/
  @Schema(description = "")
  public ComicList getComics() {
    return comics;
  }

  public void setComics(ComicList comics) {
    this.comics = comics;
  }

  public Story series(SeriesList series) {
    this.series = series;
    return this;
  }

   /**
   * Get series
   * @return series
  **/
  @Schema(description = "")
  public SeriesList getSeries() {
    return series;
  }

  public void setSeries(SeriesList series) {
    this.series = series;
  }

  public Story events(EventList events) {
    this.events = events;
    return this;
  }

   /**
   * Get events
   * @return events
  **/
  @Schema(description = "")
  public EventList getEvents() {
    return events;
  }

  public void setEvents(EventList events) {
    this.events = events;
  }

  public Story characters(CharacterList characters) {
    this.characters = characters;
    return this;
  }

   /**
   * Get characters
   * @return characters
  **/
  @Schema(description = "")
  public CharacterList getCharacters() {
    return characters;
  }

  public void setCharacters(CharacterList characters) {
    this.characters = characters;
  }

  public Story creators(CreatorList creators) {
    this.creators = creators;
    return this;
  }

   /**
   * Get creators
   * @return creators
  **/
  @Schema(description = "")
  public CreatorList getCreators() {
    return creators;
  }

  public void setCreators(CreatorList creators) {
    this.creators = creators;
  }

  public Story originalissue(ComicSummary originalissue) {
    this.originalissue = originalissue;
    return this;
  }

   /**
   * Get originalissue
   * @return originalissue
  **/
  @Schema(description = "")
  public ComicSummary getOriginalissue() {
    return originalissue;
  }

  public void setOriginalissue(ComicSummary originalissue) {
    this.originalissue = originalissue;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Story story = (Story) o;
    return Objects.equals(this.id, story.id) &&
        Objects.equals(this.title, story.title) &&
        Objects.equals(this.description, story.description) &&
        Objects.equals(this.resourceURI, story.resourceURI) &&
        Objects.equals(this.type, story.type) &&
        Objects.equals(this.modified, story.modified) &&
        Objects.equals(this.thumbnail, story.thumbnail) &&
        Objects.equals(this.comics, story.comics) &&
        Objects.equals(this.series, story.series) &&
        Objects.equals(this.events, story.events) &&
        Objects.equals(this.characters, story.characters) &&
        Objects.equals(this.creators, story.creators) &&
        Objects.equals(this.originalissue, story.originalissue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, title, description, resourceURI, type, modified, thumbnail, comics, series, events, characters, creators, originalissue);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Story {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    resourceURI: ").append(toIndentedString(resourceURI)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    modified: ").append(toIndentedString(modified)).append("\n");
    sb.append("    thumbnail: ").append(toIndentedString(thumbnail)).append("\n");
    sb.append("    comics: ").append(toIndentedString(comics)).append("\n");
    sb.append("    series: ").append(toIndentedString(series)).append("\n");
    sb.append("    events: ").append(toIndentedString(events)).append("\n");
    sb.append("    characters: ").append(toIndentedString(characters)).append("\n");
    sb.append("    creators: ").append(toIndentedString(creators)).append("\n");
    sb.append("    originalissue: ").append(toIndentedString(originalissue)).append("\n");
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
