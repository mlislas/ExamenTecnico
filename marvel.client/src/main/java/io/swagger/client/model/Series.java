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
import io.swagger.client.model.CreatorList;
import io.swagger.client.model.EventList;
import io.swagger.client.model.Image;
import io.swagger.client.model.SeriesSummary;
import io.swagger.client.model.StoryList;
import io.swagger.v3.oas.annotations.media.Schema;
/**
 * Series
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2025-02-21T01:26:09.968009500-05:00[America/Lima]")
public class Series {
  @JsonProperty("id")
  private Integer id = null;

  @JsonProperty("title")
  private String title = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("resourceURI")
  private String resourceURI = null;

  @JsonProperty("urls")
  private java.util.List urls = null;

  @JsonProperty("startYear")
  private Integer startYear = null;

  @JsonProperty("endYear")
  private Integer endYear = null;

  @JsonProperty("rating")
  private String rating = null;

  @JsonProperty("modified")
  private java.util.Date modified = null;

  @JsonProperty("thumbnail")
  private Image thumbnail = null;

  @JsonProperty("comics")
  private ComicList comics = null;

  @JsonProperty("stories")
  private StoryList stories = null;

  @JsonProperty("events")
  private EventList events = null;

  @JsonProperty("characters")
  private CharacterList characters = null;

  @JsonProperty("creators")
  private CreatorList creators = null;

  @JsonProperty("next")
  private SeriesSummary next = null;

  @JsonProperty("previous")
  private SeriesSummary previous = null;

  public Series id(Integer id) {
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

  public Series title(String title) {
    this.title = title;
    return this;
  }

   /**
   * The canonical title of the series.
   * @return title
  **/
  @Schema(description = "The canonical title of the series.")
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public Series description(String description) {
    this.description = description;
    return this;
  }

   /**
   * A description of the series.
   * @return description
  **/
  @Schema(description = "A description of the series.")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Series resourceURI(String resourceURI) {
    this.resourceURI = resourceURI;
    return this;
  }

   /**
   * The canonical URL identifier for this resource.
   * @return resourceURI
  **/
  @Schema(description = "The canonical URL identifier for this resource.")
  public String getResourceURI() {
    return resourceURI;
  }

  public void setResourceURI(String resourceURI) {
    this.resourceURI = resourceURI;
  }

  public Series urls(java.util.List urls) {
    this.urls = urls;
    return this;
  }

   /**
   * Get urls
   * @return urls
  **/
  @Schema(description = "")
  public java.util.List getUrls() {
    return urls;
  }

  public void setUrls(java.util.List urls) {
    this.urls = urls;
  }

  public Series startYear(Integer startYear) {
    this.startYear = startYear;
    return this;
  }

   /**
   * Get startYear
   * @return startYear
  **/
  @Schema(description = "")
  public Integer getStartYear() {
    return startYear;
  }

  public void setStartYear(Integer startYear) {
    this.startYear = startYear;
  }

  public Series endYear(Integer endYear) {
    this.endYear = endYear;
    return this;
  }

   /**
   * Get endYear
   * @return endYear
  **/
  @Schema(description = "")
  public Integer getEndYear() {
    return endYear;
  }

  public void setEndYear(Integer endYear) {
    this.endYear = endYear;
  }

  public Series rating(String rating) {
    this.rating = rating;
    return this;
  }

   /**
   * The age-appropriateness rating for the series.
   * @return rating
  **/
  @Schema(description = "The age-appropriateness rating for the series.")
  public String getRating() {
    return rating;
  }

  public void setRating(String rating) {
    this.rating = rating;
  }

  public Series modified(java.util.Date modified) {
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

  public Series thumbnail(Image thumbnail) {
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

  public Series comics(ComicList comics) {
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

  public Series stories(StoryList stories) {
    this.stories = stories;
    return this;
  }

   /**
   * Get stories
   * @return stories
  **/
  @Schema(description = "")
  public StoryList getStories() {
    return stories;
  }

  public void setStories(StoryList stories) {
    this.stories = stories;
  }

  public Series events(EventList events) {
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

  public Series characters(CharacterList characters) {
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

  public Series creators(CreatorList creators) {
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

  public Series next(SeriesSummary next) {
    this.next = next;
    return this;
  }

   /**
   * Get next
   * @return next
  **/
  @Schema(description = "")
  public SeriesSummary getNext() {
    return next;
  }

  public void setNext(SeriesSummary next) {
    this.next = next;
  }

  public Series previous(SeriesSummary previous) {
    this.previous = previous;
    return this;
  }

   /**
   * Get previous
   * @return previous
  **/
  @Schema(description = "")
  public SeriesSummary getPrevious() {
    return previous;
  }

  public void setPrevious(SeriesSummary previous) {
    this.previous = previous;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Series series = (Series) o;
    return Objects.equals(this.id, series.id) &&
        Objects.equals(this.title, series.title) &&
        Objects.equals(this.description, series.description) &&
        Objects.equals(this.resourceURI, series.resourceURI) &&
        Objects.equals(this.urls, series.urls) &&
        Objects.equals(this.startYear, series.startYear) &&
        Objects.equals(this.endYear, series.endYear) &&
        Objects.equals(this.rating, series.rating) &&
        Objects.equals(this.modified, series.modified) &&
        Objects.equals(this.thumbnail, series.thumbnail) &&
        Objects.equals(this.comics, series.comics) &&
        Objects.equals(this.stories, series.stories) &&
        Objects.equals(this.events, series.events) &&
        Objects.equals(this.characters, series.characters) &&
        Objects.equals(this.creators, series.creators) &&
        Objects.equals(this.next, series.next) &&
        Objects.equals(this.previous, series.previous);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, title, description, resourceURI, urls, startYear, endYear, rating, modified, thumbnail, comics, stories, events, characters, creators, next, previous);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Series {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    resourceURI: ").append(toIndentedString(resourceURI)).append("\n");
    sb.append("    urls: ").append(toIndentedString(urls)).append("\n");
    sb.append("    startYear: ").append(toIndentedString(startYear)).append("\n");
    sb.append("    endYear: ").append(toIndentedString(endYear)).append("\n");
    sb.append("    rating: ").append(toIndentedString(rating)).append("\n");
    sb.append("    modified: ").append(toIndentedString(modified)).append("\n");
    sb.append("    thumbnail: ").append(toIndentedString(thumbnail)).append("\n");
    sb.append("    comics: ").append(toIndentedString(comics)).append("\n");
    sb.append("    stories: ").append(toIndentedString(stories)).append("\n");
    sb.append("    events: ").append(toIndentedString(events)).append("\n");
    sb.append("    characters: ").append(toIndentedString(characters)).append("\n");
    sb.append("    creators: ").append(toIndentedString(creators)).append("\n");
    sb.append("    next: ").append(toIndentedString(next)).append("\n");
    sb.append("    previous: ").append(toIndentedString(previous)).append("\n");
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
