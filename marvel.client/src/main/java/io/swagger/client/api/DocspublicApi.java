package io.swagger.client.api;

import io.swagger.client.ApiClient;

import org.threeten.bp.OffsetDateTime;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.util.UriComponentsBuilder;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2025-02-21T01:26:09.968009500-05:00[America/Lima]")@Component("io.swagger.client.api.DocspublicApi")
public class DocspublicApi {
    private ApiClient apiClient;

    public DocspublicApi() {
        this(new ApiClient());
    }

    @Autowired
    public DocspublicApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Fetches lists of events filtered by a character id.
     * Fetches lists of events in which a specific character appears, with optional filters. See notes on individual parameters below.
     * <p><b>409</b> - Invalid value passed to filter.
     * @param characterId The character ID.
     * @param name Filter the event list by name.
     * @param nameStartsWith Return events with names that begin with the specified string (e.g. Sp).
     * @param modifiedSince Return only events which have been modified since the specified date.
     * @param creators Return only events which feature work by the specified creators (accepts a comma-separated list of ids).
     * @param series Return only events which are part of the specified series (accepts a comma-separated list of ids).
     * @param comics Return only events which take place in the specified comics (accepts a comma-separated list of ids).
     * @param stories Return only events which contain the specified stories (accepts a comma-separated list of ids).
     * @param orderBy Order the result set by a field or fields. Add a \&quot;-\&quot; to the value sort in descending order. Multiple values are given priority in the order in which they are passed.
     * @param limit Limit the result set to the specified number of resources.
     * @param offset Skip the specified number of resources in the result set.
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void getCharacterEventsCollection(Integer characterId, String name, String nameStartsWith, OffsetDateTime modifiedSince, List<Integer> creators, List<Integer> series, List<Integer> comics, List<Integer> stories, List<String> orderBy, Integer limit, Integer offset) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'characterId' is set
        if (characterId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'characterId' when calling getCharacterEventsCollection");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("characterId", characterId);
        String path = UriComponentsBuilder.fromPath("/v1/public/characters/{characterId}/events").buildAndExpand(uriVariables).toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "name", name));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "nameStartsWith", nameStartsWith));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "modifiedSince", modifiedSince));
        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("csv".toUpperCase()), "creators", creators));
        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("csv".toUpperCase()), "series", series));
        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("csv".toUpperCase()), "comics", comics));
        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("csv".toUpperCase()), "stories", stories));
        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("csv".toUpperCase()), "orderBy", orderBy));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "limit", limit));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "offset", offset));

        final String[] accepts = {  };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

        ParameterizedTypeReference<Void> returnType = new ParameterizedTypeReference<Void>() {};
        apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Fetches a single character by id.
     * This method fetches a single character resource.  It is the canonical URI for any character resource provided by the API.
     * <p><b>404</b> - Character not found.
     * @param characterId A single character id.
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void getCharacterIndividual(Integer characterId) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'characterId' is set
        if (characterId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'characterId' when calling getCharacterIndividual");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("characterId", characterId);
        String path = UriComponentsBuilder.fromPath("/v1/public/characters/{characterId}").buildAndExpand(uriVariables).toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] accepts = {  };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

        ParameterizedTypeReference<Void> returnType = new ParameterizedTypeReference<Void>() {};
        apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Fetches lists of series filtered by a character id.
     * Fetches lists of comic series in which a specific character appears, with optional filters. See notes on individual parameters below.
     * <p><b>409</b> - Invalid value passed to filter.
     * @param characterId The character ID
     * @param title Filter by series title.
     * @param titleStartsWith Return series with titles that begin with the specified string (e.g. Sp).
     * @param startYear Return only series matching the specified start year.
     * @param modifiedSince Return only series which have been modified since the specified date.
     * @param comics Return only series which contain the specified comics (accepts a comma-separated list of ids).
     * @param stories Return only series which contain the specified stories (accepts a comma-separated list of ids).
     * @param events Return only series which have comics that take place during the specified events (accepts a comma-separated list of ids).
     * @param creators Return only series which feature work by the specified creators (accepts a comma-separated list of ids).
     * @param seriesType Filter the series by publication frequency type.
     * @param contains Return only series containing one or more comics with the specified format.
     * @param orderBy Order the result set by a field or fields. Add a \&quot;-\&quot; to the value sort in descending order. Multiple values are given priority in the order in which they are passed.
     * @param limit Limit the result set to the specified number of resources.
     * @param offset Skip the specified number of resources in the result set.
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void getCharacterSeriesCollection(Integer characterId, String title, String titleStartsWith, Integer startYear, OffsetDateTime modifiedSince, List<Integer> comics, List<Integer> stories, List<Integer> events, List<Integer> creators, String seriesType, List<String> contains, List<String> orderBy, Integer limit, Integer offset) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'characterId' is set
        if (characterId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'characterId' when calling getCharacterSeriesCollection");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("characterId", characterId);
        String path = UriComponentsBuilder.fromPath("/v1/public/characters/{characterId}/series").buildAndExpand(uriVariables).toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "title", title));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "titleStartsWith", titleStartsWith));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "startYear", startYear));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "modifiedSince", modifiedSince));
        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("csv".toUpperCase()), "comics", comics));
        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("csv".toUpperCase()), "stories", stories));
        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("csv".toUpperCase()), "events", events));
        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("csv".toUpperCase()), "creators", creators));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "seriesType", seriesType));
        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("csv".toUpperCase()), "contains", contains));
        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("csv".toUpperCase()), "orderBy", orderBy));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "limit", limit));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "offset", offset));

        final String[] accepts = {  };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

        ParameterizedTypeReference<Void> returnType = new ParameterizedTypeReference<Void>() {};
        apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Fetches lists of stories filtered by a character id.
     * Fetches lists of comic stories  featuring a specific character with optional filters. See notes on individual parameters below.
     * <p><b>409</b> - Invalid value passed to filter.
     * @param characterId The character ID.
     * @param modifiedSince Return only stories which have been modified since the specified date.
     * @param comics Return only stories contained in the specified (accepts a comma-separated list of ids).
     * @param series Return only stories contained the specified series (accepts a comma-separated list of ids).
     * @param events Return only stories which take place during the specified events (accepts a comma-separated list of ids).
     * @param creators Return only stories which feature work by the specified creators (accepts a comma-separated list of ids).
     * @param orderBy Order the result set by a field or fields. Add a \&quot;-\&quot; to the value sort in descending order. Multiple values are given priority in the order in which they are passed.
     * @param limit Limit the result set to the specified number of resources.
     * @param offset Skip the specified number of resources in the result set.
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void getCharacterStoryCollection(Integer characterId, OffsetDateTime modifiedSince, List<Integer> comics, List<Integer> series, List<Integer> events, List<Integer> creators, List<String> orderBy, Integer limit, Integer offset) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'characterId' is set
        if (characterId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'characterId' when calling getCharacterStoryCollection");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("characterId", characterId);
        String path = UriComponentsBuilder.fromPath("/v1/public/characters/{characterId}/stories").buildAndExpand(uriVariables).toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "modifiedSince", modifiedSince));
        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("csv".toUpperCase()), "comics", comics));
        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("csv".toUpperCase()), "series", series));
        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("csv".toUpperCase()), "events", events));
        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("csv".toUpperCase()), "creators", creators));
        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("csv".toUpperCase()), "orderBy", orderBy));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "limit", limit));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "offset", offset));

        final String[] accepts = {  };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

        ParameterizedTypeReference<Void> returnType = new ParameterizedTypeReference<Void>() {};
        apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Fetches lists of characters filtered by a comic id.
     * Fetches lists of characters which appear in a specific comic with optional filters. See notes on individual parameters below.
     * <p><b>409</b> - Invalid value passed to filter.
     * @param comicId The comic id.
     * @param name Return only characters matching the specified full character name (e.g. Spider-Man).
     * @param nameStartsWith Return characters with names that begin with the specified string (e.g. Sp).
     * @param modifiedSince Return only characters which have been modified since the specified date.
     * @param series Return only characters which appear the specified series (accepts a comma-separated list of ids).
     * @param events Return only characters which appear comics that took place in the specified events (accepts a comma-separated list of ids).
     * @param stories Return only characters which appear the specified stories (accepts a comma-separated list of ids).
     * @param orderBy Order the result set by a field or fields. Add a \&quot;-\&quot; to the value sort in descending order. Multiple values are given priority in the order in which they are passed.
     * @param limit Limit the result set to the specified number of resources.
     * @param offset Skip the specified number of resources in the result set.
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void getComicCharacterCollection(Integer comicId, String name, String nameStartsWith, OffsetDateTime modifiedSince, List<Integer> series, List<Integer> events, List<Integer> stories, List<String> orderBy, Integer limit, Integer offset) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'comicId' is set
        if (comicId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'comicId' when calling getComicCharacterCollection");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("comicId", comicId);
        String path = UriComponentsBuilder.fromPath("/v1/public/comics/{comicId}/characters").buildAndExpand(uriVariables).toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "name", name));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "nameStartsWith", nameStartsWith));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "modifiedSince", modifiedSince));
        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("csv".toUpperCase()), "series", series));
        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("csv".toUpperCase()), "events", events));
        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("csv".toUpperCase()), "stories", stories));
        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("csv".toUpperCase()), "orderBy", orderBy));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "limit", limit));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "offset", offset));

        final String[] accepts = {  };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

        ParameterizedTypeReference<Void> returnType = new ParameterizedTypeReference<Void>() {};
        apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Fetches a single comic by id.
     * This method fetches a single comic resource.  It is the canonical URI for any comic resource provided by the API.
     * <p><b>404</b> - Comic not found.
     * @param comicId A single comic.
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void getComicIndividual(Integer comicId) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'comicId' is set
        if (comicId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'comicId' when calling getComicIndividual");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("comicId", comicId);
        String path = UriComponentsBuilder.fromPath("/v1/public/comics/{comicId}").buildAndExpand(uriVariables).toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] accepts = {  };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

        ParameterizedTypeReference<Void> returnType = new ParameterizedTypeReference<Void>() {};
        apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Fetches lists of stories filtered by a comic id.
     * Fetches lists of comic stories in a specific comic issue, with optional filters. See notes on individual parameters below.
     * <p><b>409</b> - Invalid value passed to filter.
     * @param comicId The comic ID.
     * @param modifiedSince Return only stories which have been modified since the specified date.
     * @param series Return only stories contained the specified series (accepts a comma-separated list of ids).
     * @param events Return only stories which take place during the specified events (accepts a comma-separated list of ids).
     * @param creators Return only stories which feature work by the specified creators (accepts a comma-separated list of ids).
     * @param characters Return only stories which feature the specified characters (accepts a comma-separated list of ids).
     * @param orderBy Order the result set by a field or fields. Add a \&quot;-\&quot; to the value sort in descending order. Multiple values are given priority in the order in which they are passed.
     * @param limit Limit the result set to the specified number of resources.
     * @param offset Skip the specified number of resources.
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void getComicStoryCollection(Integer comicId, OffsetDateTime modifiedSince, List<Integer> series, List<Integer> events, List<Integer> creators, List<Integer> characters, List<String> orderBy, Integer limit, Integer offset) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'comicId' is set
        if (comicId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'comicId' when calling getComicStoryCollection");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("comicId", comicId);
        String path = UriComponentsBuilder.fromPath("/v1/public/comics/{comicId}/stories").buildAndExpand(uriVariables).toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "modifiedSince", modifiedSince));
        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("csv".toUpperCase()), "series", series));
        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("csv".toUpperCase()), "events", events));
        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("csv".toUpperCase()), "creators", creators));
        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("csv".toUpperCase()), "characters", characters));
        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("csv".toUpperCase()), "orderBy", orderBy));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "limit", limit));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "offset", offset));

        final String[] accepts = {  };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

        ParameterizedTypeReference<Void> returnType = new ParameterizedTypeReference<Void>() {};
        apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Fetches lists of comics filtered by a character id.
     * Fetches lists of comics containing a specific character, with optional filters. See notes on individual parameters below.
     * <p><b>409</b> - Invalid value passed to filter.
     * @param characterId The character id.
     * @param format Filter by the issue format (e.g. comic, digital comic, hardcover).
     * @param formatType Filter by the issue format type (comic or collection).
     * @param noVariants Exclude variant comics from the result set.
     * @param dateDescriptor Return comics within a predefined date range.
     * @param dateRange Return comics within a predefined date range.  Dates must be specified as date1,date2 (e.g. 2013-01-01,2013-01-02).  Dates are preferably formatted as YYYY-MM-DD but may be sent as any common date format.
     * @param title Return only issues in series whose title matches the input.
     * @param titleStartsWith Return only issues in series whose title starts with the input.
     * @param startYear Return only issues in series whose start year matches the input.
     * @param issueNumber Return only issues in series whose issue number matches the input.
     * @param diamondCode Filter by diamond code.
     * @param digitalId Filter by digital comic id.
     * @param upc Filter by UPC.
     * @param isbn Filter by ISBN.
     * @param ean Filter by EAN.
     * @param issn Filter by ISSN.
     * @param hasDigitalIssue Include only results which are available digitally.
     * @param modifiedSince Return only comics which have been modified since the specified date.
     * @param creators Return only comics which feature work by the specified creators (accepts a comma-separated list of ids).
     * @param series Return only comics which are part of the specified series (accepts a comma-separated list of ids).
     * @param events Return only comics which take place in the specified events (accepts a comma-separated list of ids).
     * @param stories Return only comics which contain the specified stories (accepts a comma-separated list of ids).
     * @param sharedAppearances Return only comics in which the specified characters appear together (for example in which BOTH Spider-Man and Wolverine appear).
     * @param collaborators Return only comics in which the specified creators worked together (for example in which BOTH Stan Lee and Jack Kirby did work).
     * @param orderBy Order the result set by a field or fields. Add a \&quot;-\&quot; to the value sort in descending order. Multiple values are given priority in the order in which they are passed.
     * @param limit Limit the result set to the specified number of resources.
     * @param offset Skip the specified number of resources in the result set.
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void getComicsCharacterCollection(Integer characterId, String format, String formatType, Boolean noVariants, String dateDescriptor, List<Integer> dateRange, String title, String titleStartsWith, Integer startYear, Integer issueNumber, String diamondCode, Integer digitalId, String upc, String isbn, String ean, String issn, Boolean hasDigitalIssue, OffsetDateTime modifiedSince, List<Integer> creators, List<Integer> series, List<Integer> events, List<Integer> stories, List<Integer> sharedAppearances, List<Integer> collaborators, List<String> orderBy, Integer limit, Integer offset) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'characterId' is set
        if (characterId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'characterId' when calling getComicsCharacterCollection");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("characterId", characterId);
        String path = UriComponentsBuilder.fromPath("/v1/public/characters/{characterId}/comics").buildAndExpand(uriVariables).toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "format", format));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "formatType", formatType));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "noVariants", noVariants));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "dateDescriptor", dateDescriptor));
        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("csv".toUpperCase()), "dateRange", dateRange));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "title", title));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "titleStartsWith", titleStartsWith));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "startYear", startYear));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "issueNumber", issueNumber));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "diamondCode", diamondCode));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "digitalId", digitalId));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "upc", upc));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "isbn", isbn));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "ean", ean));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "issn", issn));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "hasDigitalIssue", hasDigitalIssue));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "modifiedSince", modifiedSince));
        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("csv".toUpperCase()), "creators", creators));
        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("csv".toUpperCase()), "series", series));
        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("csv".toUpperCase()), "events", events));
        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("csv".toUpperCase()), "stories", stories));
        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("csv".toUpperCase()), "sharedAppearances", sharedAppearances));
        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("csv".toUpperCase()), "collaborators", collaborators));
        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("csv".toUpperCase()), "orderBy", orderBy));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "limit", limit));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "offset", offset));

        final String[] accepts = {  };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

        ParameterizedTypeReference<Void> returnType = new ParameterizedTypeReference<Void>() {};
        apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Fetches lists of comics filtered by a creator id.
     * Fetches lists of comics in which the work of a specific creator appears, with optional filters. See notes on individual parameters below.
     * <p><b>409</b> - Invalid value passed to filter.
     * @param creatorId The creator ID.
     * @param format Filter by the issue format (e.g. comic, digital comic, hardcover).
     * @param formatType Filter by the issue format type (comic or collection).
     * @param noVariants Exclude variant comics from the result set.
     * @param dateDescriptor Return comics within a predefined date range.
     * @param dateRange Return comics within a predefined date range.  Dates must be specified as date1,date2 (e.g. 2013-01-01,2013-01-02).  Dates are preferably formatted as YYYY-MM-DD but may be sent as any common date format.
     * @param title Return only issues in series whose title matches the input.
     * @param titleStartsWith Return only issues in series whose title starts with the input.
     * @param startYear Return only issues in series whose start year matches the input.
     * @param issueNumber Return only issues in series whose issue number matches the input.
     * @param diamondCode Filter by diamond code.
     * @param digitalId Filter by digital comic id.
     * @param upc Filter by UPC.
     * @param isbn Filter by ISBN.
     * @param ean Filter by EAN.
     * @param issn Filter by ISSN.
     * @param hasDigitalIssue Include only results which are available digitally.
     * @param modifiedSince Return only comics which have been modified since the specified date.
     * @param characters Return only comics which feature the specified characters (accepts a comma-separated list of ids).
     * @param series Return only comics which are part of the specified series (accepts a comma-separated list of ids).
     * @param events Return only comics which take place in the specified events (accepts a comma-separated list of ids).
     * @param stories Return only comics which contain the specified stories (accepts a comma-separated list of ids).
     * @param sharedAppearances Return only comics in which the specified characters appear together (for example in which BOTH Spider-Man and Wolverine appear).
     * @param collaborators Return only comics in which the specified creators worked together (for example in which BOTH Stan Lee and Jack Kirby did work).
     * @param orderBy Order the result set by a field or fields. Add a \&quot;-\&quot; to the value sort in descending order. Multiple values are given priority in the order in which they are passed.
     * @param limit Limit the result set to the specified number of resources.
     * @param offset Skip the specified number of resources in the result set.
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void getComicsCollection(Integer creatorId, String format, String formatType, Boolean noVariants, String dateDescriptor, List<Integer> dateRange, String title, String titleStartsWith, Integer startYear, Integer issueNumber, String diamondCode, Integer digitalId, String upc, String isbn, String ean, String issn, List<Boolean> hasDigitalIssue, OffsetDateTime modifiedSince, List<Integer> characters, List<Integer> series, List<Integer> events, List<Integer> stories, List<Integer> sharedAppearances, List<Integer> collaborators, List<String> orderBy, Integer limit, Integer offset) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'creatorId' is set
        if (creatorId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'creatorId' when calling getComicsCollection");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("creatorId", creatorId);
        String path = UriComponentsBuilder.fromPath("/v1/public/creators/{creatorId}/comics").buildAndExpand(uriVariables).toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "format", format));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "formatType", formatType));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "noVariants", noVariants));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "dateDescriptor", dateDescriptor));
        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("csv".toUpperCase()), "dateRange", dateRange));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "title", title));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "titleStartsWith", titleStartsWith));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "startYear", startYear));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "issueNumber", issueNumber));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "diamondCode", diamondCode));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "digitalId", digitalId));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "upc", upc));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "isbn", isbn));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "ean", ean));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "issn", issn));
        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("csv".toUpperCase()), "hasDigitalIssue", hasDigitalIssue));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "modifiedSince", modifiedSince));
        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("csv".toUpperCase()), "characters", characters));
        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("csv".toUpperCase()), "series", series));
        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("csv".toUpperCase()), "events", events));
        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("csv".toUpperCase()), "stories", stories));
        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("csv".toUpperCase()), "sharedAppearances", sharedAppearances));
        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("csv".toUpperCase()), "collaborators", collaborators));
        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("csv".toUpperCase()), "orderBy", orderBy));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "limit", limit));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "offset", offset));

        final String[] accepts = {  };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

        ParameterizedTypeReference<Void> returnType = new ParameterizedTypeReference<Void>() {};
        apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Fetches lists of comics filtered by an event id.
     * Fetches lists of comics which take place during a specific event, with optional filters. See notes on individual parameters below.
     * <p><b>409</b> - Invalid value passed to filter.
     * @param eventId The event id.
     * @param format Filter by the issue format (e.g. comic, digital comic, hardcover).
     * @param formatType Filter by the issue format type (comic or collection).
     * @param noVariants Exclude variant comics from the result set.
     * @param dateDescriptor Return comics within a predefined date range.
     * @param dateRange Return comics within a predefined date range.  Dates must be specified as date1,date2 (e.g. 2013-01-01,2013-01-02).  Dates are preferably formatted as YYYY-MM-DD but may be sent as any common date format.
     * @param title Return only issues in series whose title matches the input.
     * @param titleStartsWith Return only issues in series whose title starts with the input.
     * @param startYear Return only issues in series whose start year matches the input.
     * @param issueNumber Return only issues in series whose issue number matches the input.
     * @param diamondCode Filter by diamond code.
     * @param digitalId Filter by digital comic id.
     * @param upc Filter by UPC.
     * @param isbn Filter by ISBN.
     * @param ean Filter by EAN.
     * @param issn Filter by ISSN.
     * @param hasDigitalIssue Include only results which are available digitally.
     * @param modifiedSince Return only comics which have been modified since the specified date.
     * @param creators Return only comics which feature work by the specified creators (accepts a comma-separated list of ids).
     * @param characters Return only comics which feature the specified characters (accepts a comma-separated list of ids).
     * @param series Return only comics which are part of the specified series (accepts a comma-separated list of ids).
     * @param events Return only comics which take place in the specified events (accepts a comma-separated list of ids).
     * @param stories Return only comics which contain the specified stories (accepts a comma-separated list of ids).
     * @param sharedAppearances Return only comics in which the specified characters appear together (for example in which BOTH Spider-Man and Wolverine appear).
     * @param collaborators Return only comics in which the specified creators worked together (for example in which BOTH Stan Lee and Jack Kirby did work).
     * @param orderBy Order the result set by a field or fields. Add a \&quot;-\&quot; to the value sort in descending order. Multiple values are given priority in the order in which they are passed.
     * @param limit Limit the result set to the specified number of resources.
     * @param offset Skip the specified number of resources in the result set.
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void getComicsCollection_0(Integer eventId, String format, String formatType, List<Boolean> noVariants, List<String> dateDescriptor, List<Integer> dateRange, String title, String titleStartsWith, Integer startYear, Integer issueNumber, String diamondCode, Integer digitalId, String upc, String isbn, String ean, String issn, List<Boolean> hasDigitalIssue, OffsetDateTime modifiedSince, List<Integer> creators, List<Integer> characters, List<Integer> series, List<Integer> events, List<Integer> stories, List<Integer> sharedAppearances, List<Integer> collaborators, List<String> orderBy, Integer limit, Integer offset) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'eventId' is set
        if (eventId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'eventId' when calling getComicsCollection_0");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("eventId", eventId);
        String path = UriComponentsBuilder.fromPath("/v1/public/events/{eventId}/comics").buildAndExpand(uriVariables).toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "format", format));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "formatType", formatType));
        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("csv".toUpperCase()), "noVariants", noVariants));
        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("csv".toUpperCase()), "dateDescriptor", dateDescriptor));
        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("csv".toUpperCase()), "dateRange", dateRange));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "title", title));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "titleStartsWith", titleStartsWith));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "startYear", startYear));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "issueNumber", issueNumber));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "diamondCode", diamondCode));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "digitalId", digitalId));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "upc", upc));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "isbn", isbn));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "ean", ean));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "issn", issn));
        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("csv".toUpperCase()), "hasDigitalIssue", hasDigitalIssue));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "modifiedSince", modifiedSince));
        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("csv".toUpperCase()), "creators", creators));
        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("csv".toUpperCase()), "characters", characters));
        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("csv".toUpperCase()), "series", series));
        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("csv".toUpperCase()), "events", events));
        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("csv".toUpperCase()), "stories", stories));
        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("csv".toUpperCase()), "sharedAppearances", sharedAppearances));
        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("csv".toUpperCase()), "collaborators", collaborators));
        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("csv".toUpperCase()), "orderBy", orderBy));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "limit", limit));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "offset", offset));

        final String[] accepts = {  };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

        ParameterizedTypeReference<Void> returnType = new ParameterizedTypeReference<Void>() {};
        apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Fetches lists of comics filtered by a series id.
     * Fetches lists of comics which are published as part of a specific series, with optional filters. See notes on individual parameters below.
     * <p><b>409</b> - Invalid value passed to filter.
     * @param seriesId The series ID.
     * @param format Filter by the issue format (e.g. comic, digital comic, hardcover).
     * @param formatType Filter by the issue format type (comic or collection).
     * @param noVariants Exclude variant comics from the result set.
     * @param dateDescriptor Return comics within a predefined date range.
     * @param dateRange Return comics within a predefined date range.  Dates must be specified as date1,date2 (e.g. 2013-01-01,2013-01-02).  Dates are preferably formatted as YYYY-MM-DD but may be sent as any common date format.
     * @param title Return only issues in series whose title matches the input.
     * @param titleStartsWith Return only issues in series whose title starts with the input.
     * @param startYear Return only issues in series whose start year matches the input.
     * @param issueNumber Return only issues in series whose issue number matches the input.
     * @param diamondCode Filter by diamond code.
     * @param digitalId Filter by digital comic id.
     * @param upc Filter by UPC.
     * @param isbn Filter by ISBN.
     * @param ean Filter by EAN.
     * @param issn Filter by ISSN.
     * @param hasDigitalIssue Include only results which are available digitally.
     * @param modifiedSince Return only comics which have been modified since the specified date.
     * @param creators Return only comics which feature work by the specified creators (accepts a comma-separated list of ids).
     * @param characters Return only comics which feature the specified characters (accepts a comma-separated list of ids).
     * @param events Return only comics which take place in the specified events (accepts a comma-separated list of ids).
     * @param stories Return only comics which contain the specified stories (accepts a comma-separated list of ids).
     * @param sharedAppearances Return only comics in which the specified characters appear together (for example in which BOTH Spider-Man and Wolverine appear).
     * @param collaborators Return only comics in which the specified creators worked together (for example in which BOTH Stan Lee and Jack Kirby did work).
     * @param orderBy Order the result set by a field or fields. Add a \&quot;-\&quot; to the value sort in descending order. Multiple values are given priority in the order in which they are passed.
     * @param limit Limit the result set to the specified number of resources.
     * @param offset Skip the specified number of resources in the result set.
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void getComicsCollection_1(Integer seriesId, String format, String formatType, List<Boolean> noVariants, List<String> dateDescriptor, List<Integer> dateRange, String title, String titleStartsWith, Integer startYear, Integer issueNumber, String diamondCode, Integer digitalId, String upc, String isbn, String ean, String issn, List<Boolean> hasDigitalIssue, OffsetDateTime modifiedSince, List<Integer> creators, List<Integer> characters, List<Integer> events, List<Integer> stories, List<Integer> sharedAppearances, List<Integer> collaborators, List<String> orderBy, Integer limit, Integer offset) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'seriesId' is set
        if (seriesId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'seriesId' when calling getComicsCollection_1");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("seriesId", seriesId);
        String path = UriComponentsBuilder.fromPath("/v1/public/series/{seriesId}/comics").buildAndExpand(uriVariables).toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "format", format));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "formatType", formatType));
        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("csv".toUpperCase()), "noVariants", noVariants));
        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("csv".toUpperCase()), "dateDescriptor", dateDescriptor));
        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("csv".toUpperCase()), "dateRange", dateRange));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "title", title));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "titleStartsWith", titleStartsWith));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "startYear", startYear));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "issueNumber", issueNumber));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "diamondCode", diamondCode));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "digitalId", digitalId));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "upc", upc));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "isbn", isbn));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "ean", ean));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "issn", issn));
        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("csv".toUpperCase()), "hasDigitalIssue", hasDigitalIssue));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "modifiedSince", modifiedSince));
        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("csv".toUpperCase()), "creators", creators));
        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("csv".toUpperCase()), "characters", characters));
        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("csv".toUpperCase()), "events", events));
        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("csv".toUpperCase()), "stories", stories));
        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("csv".toUpperCase()), "sharedAppearances", sharedAppearances));
        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("csv".toUpperCase()), "collaborators", collaborators));
        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("csv".toUpperCase()), "orderBy", orderBy));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "limit", limit));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "offset", offset));

        final String[] accepts = {  };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

        ParameterizedTypeReference<Void> returnType = new ParameterizedTypeReference<Void>() {};
        apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Fetches lists of comics.
     * Fetches lists of comics with optional filters. See notes on individual parameters below.
     * <p><b>409</b> - Invalid value passed to filter.
     * @param format Filter by the issue format (e.g. comic, digital comic, hardcover).
     * @param formatType Filter by the issue format type (comic or collection).
     * @param noVariants Exclude variants (alternate covers, secondary printings, director&#x27;s cuts, etc.) from the result set.
     * @param dateDescriptor Return comics within a predefined date range.
     * @param dateRange Return comics within a predefined date range.  Dates must be specified as date1,date2 (e.g. 2013-01-01,2013-01-02).  Dates are preferably formatted as YYYY-MM-DD but may be sent as any common date format.
     * @param title Return only issues in series whose title matches the input.
     * @param titleStartsWith Return only issues in series whose title starts with the input.
     * @param startYear Return only issues in series whose start year matches the input.
     * @param issueNumber Return only issues in series whose issue number matches the input.
     * @param diamondCode Filter by diamond code.
     * @param digitalId Filter by digital comic id.
     * @param upc Filter by UPC.
     * @param isbn Filter by ISBN.
     * @param ean Filter by EAN.
     * @param issn Filter by ISSN.
     * @param hasDigitalIssue Include only results which are available digitally.
     * @param modifiedSince Return only comics which have been modified since the specified date.
     * @param creators Return only comics which feature work by the specified creators (accepts a comma-separated list of ids).
     * @param characters Return only comics which feature the specified characters (accepts a comma-separated list of ids).
     * @param series Return only comics which are part of the specified series (accepts a comma-separated list of ids).
     * @param events Return only comics which take place in the specified events (accepts a comma-separated list of ids).
     * @param stories Return only comics which contain the specified stories (accepts a comma-separated list of ids).
     * @param sharedAppearances Return only comics in which the specified characters appear together (for example in which BOTH Spider-Man and Wolverine appear). Accepts a comma-separated list of ids.
     * @param collaborators Return only comics in which the specified creators worked together (for example in which BOTH Stan Lee and Jack Kirby did work). Accepts a comma-separated list of ids.
     * @param orderBy Order the result set by a field or fields. Add a \&quot;-\&quot; to the value sort in descending order. Multiple values are given priority in the order in which they are passed.
     * @param limit Limit the result set to the specified number of resources.
     * @param offset Skip the specified number of resources in the result set.
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void getComicsCollection_2(String format, String formatType, Boolean noVariants, String dateDescriptor, List<Integer> dateRange, String title, String titleStartsWith, Integer startYear, Integer issueNumber, String diamondCode, Integer digitalId, String upc, String isbn, String ean, String issn, Boolean hasDigitalIssue, OffsetDateTime modifiedSince, List<Integer> creators, List<Integer> characters, List<Integer> series, List<Integer> events, List<Integer> stories, List<Integer> sharedAppearances, List<Integer> collaborators, List<String> orderBy, Integer limit, Integer offset) throws RestClientException {
        Object postBody = null;
        String path = UriComponentsBuilder.fromPath("/v1/public/comics").build().toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "format", format));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "formatType", formatType));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "noVariants", noVariants));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "dateDescriptor", dateDescriptor));
        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("csv".toUpperCase()), "dateRange", dateRange));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "title", title));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "titleStartsWith", titleStartsWith));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "startYear", startYear));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "issueNumber", issueNumber));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "diamondCode", diamondCode));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "digitalId", digitalId));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "upc", upc));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "isbn", isbn));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "ean", ean));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "issn", issn));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "hasDigitalIssue", hasDigitalIssue));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "modifiedSince", modifiedSince));
        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("csv".toUpperCase()), "creators", creators));
        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("csv".toUpperCase()), "characters", characters));
        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("csv".toUpperCase()), "series", series));
        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("csv".toUpperCase()), "events", events));
        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("csv".toUpperCase()), "stories", stories));
        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("csv".toUpperCase()), "sharedAppearances", sharedAppearances));
        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("csv".toUpperCase()), "collaborators", collaborators));
        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("csv".toUpperCase()), "orderBy", orderBy));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "limit", limit));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "offset", offset));

        final String[] accepts = {  };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

        ParameterizedTypeReference<Void> returnType = new ParameterizedTypeReference<Void>() {};
        apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Fetches lists of comics filtered by a story id.
     * Fetches lists of comics in which a specific story appears, with optional filters. See notes on individual parameters below.
     * <p><b>409</b> - Invalid value passed to filter.
     * @param storyId The story ID.
     * @param format Filter by the issue format (e.g. comic, digital comic, hardcover).
     * @param formatType Filter by the issue format type (comic or collection).
     * @param noVariants Exclude variant comics from the result set.
     * @param dateDescriptor Return comics within a predefined date range.
     * @param dateRange Return comics within a predefined date range.  Dates must be specified as date1,date2 (e.g. 2013-01-01,2013-01-02).  Dates are preferably formatted as YYYY-MM-DD but may be sent as any common date format.
     * @param title Return only issues in series whose title matches the input.
     * @param titleStartsWith Return only issues in series whose title starts with the input.
     * @param startYear Return only issues in series whose start year matches the input.
     * @param issueNumber Return only issues in series whose issue number matches the input.
     * @param diamondCode Filter by diamond code.
     * @param digitalId Filter by digital comic id.
     * @param upc Filter by UPC.
     * @param isbn Filter by ISBN.
     * @param ean Filter by EAN.
     * @param issn Filter by ISSN.
     * @param hasDigitalIssue Include only results which are available digitally.
     * @param modifiedSince Return only comics which have been modified since the specified date.
     * @param creators Return only comics which feature work by the specified creators (accepts a comma-separated list of ids).
     * @param characters Return only comics which feature the specified characters (accepts a comma-separated list of ids).
     * @param series Return only comics which are part of the specified series (accepts a comma-separated list of ids).
     * @param events Return only comics which take place in the specified events (accepts a comma-separated list of ids).
     * @param sharedAppearances Return only comics in which the specified characters appear together (for example in which BOTH Spider-Man and Wolverine appear).
     * @param collaborators Return only comics in which the specified creators worked together (for example in which BOTH Stan Lee and Jack Kirby did work).
     * @param orderBy Order the result set by a field or fields. Add a \&quot;-\&quot; to the value sort in descending order. Multiple values are given priority in the order in which they are passed.
     * @param limit Limit the result set to the specified number of resources.
     * @param offset Skip the specified number of resources in the result set.
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void getComicsCollection_3(Integer storyId, String format, String formatType, List<Boolean> noVariants, List<String> dateDescriptor, List<Integer> dateRange, String title, String titleStartsWith, Integer startYear, Integer issueNumber, String diamondCode, Integer digitalId, String upc, String isbn, String ean, String issn, List<Boolean> hasDigitalIssue, OffsetDateTime modifiedSince, List<Integer> creators, List<Integer> characters, List<Integer> series, List<Integer> events, List<Integer> sharedAppearances, List<Integer> collaborators, List<String> orderBy, Integer limit, Integer offset) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'storyId' is set
        if (storyId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'storyId' when calling getComicsCollection_3");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("storyId", storyId);
        String path = UriComponentsBuilder.fromPath("/v1/public/stories/{storyId}/comics").buildAndExpand(uriVariables).toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "format", format));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "formatType", formatType));
        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("csv".toUpperCase()), "noVariants", noVariants));
        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("csv".toUpperCase()), "dateDescriptor", dateDescriptor));
        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("csv".toUpperCase()), "dateRange", dateRange));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "title", title));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "titleStartsWith", titleStartsWith));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "startYear", startYear));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "issueNumber", issueNumber));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "diamondCode", diamondCode));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "digitalId", digitalId));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "upc", upc));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "isbn", isbn));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "ean", ean));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "issn", issn));
        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("csv".toUpperCase()), "hasDigitalIssue", hasDigitalIssue));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "modifiedSince", modifiedSince));
        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("csv".toUpperCase()), "creators", creators));
        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("csv".toUpperCase()), "characters", characters));
        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("csv".toUpperCase()), "series", series));
        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("csv".toUpperCase()), "events", events));
        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("csv".toUpperCase()), "sharedAppearances", sharedAppearances));
        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("csv".toUpperCase()), "collaborators", collaborators));
        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("csv".toUpperCase()), "orderBy", orderBy));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "limit", limit));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "offset", offset));

        final String[] accepts = {  };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

        ParameterizedTypeReference<Void> returnType = new ParameterizedTypeReference<Void>() {};
        apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Fetches lists of creators.
     * Fetches lists of comic creators with optional filters. See notes on individual parameters below.
     * <p><b>409</b> - Invalid value passed to filter.
     * @param firstName Filter by creator first name (e.g. Brian).
     * @param middleName Filter by creator middle name (e.g. Michael).
     * @param lastName Filter by creator last name (e.g. Bendis).
     * @param suffix Filter by suffix or honorific (e.g. Jr., Sr.).
     * @param nameStartsWith Filter by creator names that match critera (e.g. B, St L).
     * @param firstNameStartsWith Filter by creator first names that match critera (e.g. B, St L).
     * @param middleNameStartsWith Filter by creator middle names that match critera (e.g. Mi).
     * @param lastNameStartsWith Filter by creator last names that match critera (e.g. Ben).
     * @param modifiedSince Return only creators which have been modified since the specified date.
     * @param comics Return only creators who worked on in the specified comics (accepts a comma-separated list of ids).
     * @param series Return only creators who worked on the specified series (accepts a comma-separated list of ids).
     * @param events Return only creators who worked on comics that took place in the specified events (accepts a comma-separated list of ids).
     * @param stories Return only creators who worked on the specified stories (accepts a comma-separated list of ids).
     * @param orderBy Order the result set by a field or fields. Add a \&quot;-\&quot; to the value sort in descending order. Multiple values are given priority in the order in which they are passed.
     * @param limit Limit the result set to the specified number of resources.
     * @param offset Skip the specified number of resources in the result set.
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void getCreatorCollection(String firstName, String middleName, String lastName, String suffix, String nameStartsWith, String firstNameStartsWith, String middleNameStartsWith, String lastNameStartsWith, OffsetDateTime modifiedSince, List<Integer> comics, List<Integer> series, List<Integer> events, List<Integer> stories, List<String> orderBy, Integer limit, Integer offset) throws RestClientException {
        Object postBody = null;
        String path = UriComponentsBuilder.fromPath("/v1/public/creators").build().toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "firstName", firstName));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "middleName", middleName));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "lastName", lastName));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "suffix", suffix));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "nameStartsWith", nameStartsWith));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "firstNameStartsWith", firstNameStartsWith));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "middleNameStartsWith", middleNameStartsWith));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "lastNameStartsWith", lastNameStartsWith));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "modifiedSince", modifiedSince));
        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("csv".toUpperCase()), "comics", comics));
        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("csv".toUpperCase()), "series", series));
        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("csv".toUpperCase()), "events", events));
        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("csv".toUpperCase()), "stories", stories));
        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("csv".toUpperCase()), "orderBy", orderBy));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "limit", limit));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "offset", offset));

        final String[] accepts = {  };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

        ParameterizedTypeReference<Void> returnType = new ParameterizedTypeReference<Void>() {};
        apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Fetches lists of characters filtered by a story id.
     * Fetches lists of comic characters appearing in a single story, with optional filters. See notes on individual parameters below.
     * <p><b>409</b> - Invalid value passed to filter.
     * @param storyId The story ID.
     * @param name Return only characters matching the specified full character name (e.g. Spider-Man).
     * @param nameStartsWith Return characters with names that begin with the specified string (e.g. Sp).
     * @param modifiedSince Return only characters which have been modified since the specified date.
     * @param comics Return only characters which appear in the specified comics (accepts a comma-separated list of ids).
     * @param series Return only characters which appear the specified series (accepts a comma-separated list of ids).
     * @param events Return only characters which appear comics that took place in the specified events (accepts a comma-separated list of ids).
     * @param orderBy Order the result set by a field or fields. Add a \&quot;-\&quot; to the value sort in descending order. Multiple values are given priority in the order in which they are passed.
     * @param limit Limit the result set to the specified number of resources.
     * @param offset Skip the specified number of resources in the result set.
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void getCreatorCollection_0(Integer storyId, String name, String nameStartsWith, OffsetDateTime modifiedSince, List<Integer> comics, List<Integer> series, List<Integer> events, List<String> orderBy, Integer limit, Integer offset) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'storyId' is set
        if (storyId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'storyId' when calling getCreatorCollection_0");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("storyId", storyId);
        String path = UriComponentsBuilder.fromPath("/v1/public/stories/{storyId}/characters").buildAndExpand(uriVariables).toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "name", name));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "nameStartsWith", nameStartsWith));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "modifiedSince", modifiedSince));
        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("csv".toUpperCase()), "comics", comics));
        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("csv".toUpperCase()), "series", series));
        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("csv".toUpperCase()), "events", events));
        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("csv".toUpperCase()), "orderBy", orderBy));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "limit", limit));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "offset", offset));

        final String[] accepts = {  };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

        ParameterizedTypeReference<Void> returnType = new ParameterizedTypeReference<Void>() {};
        apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Fetches lists of creators filtered by a series id.
     * Fetches lists of comic creators whose work appears in a specific series, with optional filters. See notes on individual parameters below.
     * <p><b>409</b> - Invalid value passed to filter.
     * @param seriesId The series ID.
     * @param firstName Filter by creator first name (e.g. brian).
     * @param middleName Filter by creator middle name (e.g. Michael).
     * @param lastName Filter by creator last name (e.g. Bendis).
     * @param suffix Filter by suffix or honorific (e.g. Jr., Sr.).
     * @param nameStartsWith Filter by creator names that match critera (e.g. B, St L).
     * @param firstNameStartsWith Filter by creator first names that match critera (e.g. B, St L).
     * @param middleNameStartsWith Filter by creator middle names that match critera (e.g. Mi).
     * @param lastNameStartsWith Filter by creator last names that match critera (e.g. Ben).
     * @param modifiedSince Return only creators which have been modified since the specified date.
     * @param comics Return only creators who worked on in the specified comics (accepts a comma-separated list of ids).
     * @param events Return only creators who worked on comics that took place in the specified events (accepts a comma-separated list of ids).
     * @param stories Return only creators who worked on the specified stories (accepts a comma-separated list of ids).
     * @param orderBy Order the result set by a field or fields. Add a \&quot;-\&quot; to the value sort in descending order. Multiple values are given priority in the order in which they are passed.
     * @param limit Limit the result set to the specified number of resources.
     * @param offset Skip the specified number of resources in the result set.
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void getCreatorCollection_1(Integer seriesId, String firstName, String middleName, String lastName, String suffix, String nameStartsWith, String firstNameStartsWith, String middleNameStartsWith, String lastNameStartsWith, OffsetDateTime modifiedSince, List<Integer> comics, List<Integer> events, List<Integer> stories, List<String> orderBy, Integer limit, Integer offset) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'seriesId' is set
        if (seriesId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'seriesId' when calling getCreatorCollection_1");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("seriesId", seriesId);
        String path = UriComponentsBuilder.fromPath("/v1/public/series/{seriesId}/creators").buildAndExpand(uriVariables).toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "firstName", firstName));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "middleName", middleName));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "lastName", lastName));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "suffix", suffix));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "nameStartsWith", nameStartsWith));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "firstNameStartsWith", firstNameStartsWith));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "middleNameStartsWith", middleNameStartsWith));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "lastNameStartsWith", lastNameStartsWith));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "modifiedSince", modifiedSince));
        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("csv".toUpperCase()), "comics", comics));
        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("csv".toUpperCase()), "events", events));
        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("csv".toUpperCase()), "stories", stories));
        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("csv".toUpperCase()), "orderBy", orderBy));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "limit", limit));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "offset", offset));

        final String[] accepts = {  };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

        ParameterizedTypeReference<Void> returnType = new ParameterizedTypeReference<Void>() {};
        apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Fetches lists of creators filtered by a comic id.
     * Fetches lists of comic creators whose work appears in a specific comic, with optional filters. See notes on individual parameters below.
     * <p><b>409</b> - Invalid value passed to filter.
     * @param comicId The comic id.
     * @param firstName Filter by creator first name (e.g. brian).
     * @param middleName Filter by creator middle name (e.g. Michael).
     * @param lastName Filter by creator last name (e.g. Bendis).
     * @param suffix Filter by suffix or honorific (e.g. Jr., Sr.).
     * @param nameStartsWith Filter by creator names that match critera (e.g. B, St L).
     * @param firstNameStartsWith Filter by creator first names that match critera (e.g. B, St L).
     * @param middleNameStartsWith Filter by creator middle names that match critera (e.g. Mi).
     * @param lastNameStartsWith Filter by creator last names that match critera (e.g. Ben).
     * @param modifiedSince Return only creators which have been modified since the specified date.
     * @param comics Return only creators who worked on in the specified comics (accepts a comma-separated list of ids).
     * @param series Return only creators who worked on the specified series (accepts a comma-separated list of ids).
     * @param stories Return only creators who worked on the specified stories (accepts a comma-separated list of ids).
     * @param orderBy Order the result set by a field or fields. Add a \&quot;-\&quot; to the value sort in descending order. Multiple values are given priority in the order in which they are passed.
     * @param limit Limit the result set to the specified number of resources.
     * @param offset Skip the specified number of resources in the result set.
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void getCreatorCollection_2(Integer comicId, String firstName, String middleName, String lastName, String suffix, String nameStartsWith, String firstNameStartsWith, String middleNameStartsWith, String lastNameStartsWith, OffsetDateTime modifiedSince, List<Integer> comics, List<Integer> series, List<Integer> stories, List<String> orderBy, Integer limit, Integer offset) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'comicId' is set
        if (comicId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'comicId' when calling getCreatorCollection_2");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("comicId", comicId);
        String path = UriComponentsBuilder.fromPath("/v1/public/comics/{comicId}/creators").buildAndExpand(uriVariables).toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "firstName", firstName));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "middleName", middleName));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "lastName", lastName));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "suffix", suffix));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "nameStartsWith", nameStartsWith));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "firstNameStartsWith", firstNameStartsWith));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "middleNameStartsWith", middleNameStartsWith));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "lastNameStartsWith", lastNameStartsWith));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "modifiedSince", modifiedSince));
        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("csv".toUpperCase()), "comics", comics));
        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("csv".toUpperCase()), "series", series));
        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("csv".toUpperCase()), "stories", stories));
        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("csv".toUpperCase()), "orderBy", orderBy));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "limit", limit));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "offset", offset));

        final String[] accepts = {  };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

        ParameterizedTypeReference<Void> returnType = new ParameterizedTypeReference<Void>() {};
        apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Fetches lists of characters.
     * Fetches lists of comic characters with optional filters. See notes on individual parameters below.
     * <p><b>409</b> - Invalid value passed to filter.
     * @param name Return only characters matching the specified full character name (e.g. Spider-Man).
     * @param nameStartsWith Return characters with names that begin with the specified string (e.g. Sp).
     * @param modifiedSince Return only characters which have been modified since the specified date.
     * @param comics Return only characters which appear in the specified comics (accepts a comma-separated list of ids).
     * @param series Return only characters which appear the specified series (accepts a comma-separated list of ids).
     * @param events Return only characters which appear in the specified events (accepts a comma-separated list of ids).
     * @param stories Return only characters which appear the specified stories (accepts a comma-separated list of ids).
     * @param orderBy Order the result set by a field or fields. Add a \&quot;-\&quot; to the value sort in descending order. Multiple values are given priority in the order in which they are passed.
     * @param limit Limit the result set to the specified number of resources.
     * @param offset Skip the specified number of resources in the result set.
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void getCreatorCollection_3(String name, String nameStartsWith, OffsetDateTime modifiedSince, List<Integer> comics, List<Integer> series, List<Integer> events, List<Integer> stories, List<String> orderBy, Integer limit, Integer offset) throws RestClientException {
        Object postBody = null;
        String path = UriComponentsBuilder.fromPath("/v1/public/characters").build().toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "name", name));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "nameStartsWith", nameStartsWith));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "modifiedSince", modifiedSince));
        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("csv".toUpperCase()), "comics", comics));
        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("csv".toUpperCase()), "series", series));
        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("csv".toUpperCase()), "events", events));
        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("csv".toUpperCase()), "stories", stories));
        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("csv".toUpperCase()), "orderBy", orderBy));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "limit", limit));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "offset", offset));

        final String[] accepts = {  };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

        ParameterizedTypeReference<Void> returnType = new ParameterizedTypeReference<Void>() {};
        apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Fetches lists of creators filtered by a story id.
     * Fetches lists of comic creators whose work appears in a specific story, with optional filters. See notes on individual parameters below.
     * <p><b>409</b> - Invalid value passed to filter.
     * @param storyId The story ID.
     * @param firstName Filter by creator first name (e.g. brian).
     * @param middleName Filter by creator middle name (e.g. Michael).
     * @param lastName Filter by creator last name (e.g. Bendis).
     * @param suffix Filter by suffix or honorific (e.g. Jr., Sr.).
     * @param nameStartsWith Filter by creator names that match critera (e.g. B, St L).
     * @param firstNameStartsWith Filter by creator first names that match critera (e.g. B, St L).
     * @param middleNameStartsWith Filter by creator middle names that match critera (e.g. Mi).
     * @param lastNameStartsWith Filter by creator last names that match critera (e.g. Ben).
     * @param modifiedSince Return only creators which have been modified since the specified date.
     * @param comics Return only creators who worked on in the specified comics (accepts a comma-separated list of ids).
     * @param series Return only creators who worked on the specified series (accepts a comma-separated list of ids).
     * @param events Return only creators who worked on comics that took place in the specified events (accepts a comma-separated list of ids).
     * @param orderBy Order the result set by a field or fields. Add a \&quot;-\&quot; to the value sort in descending order. Multiple values are given priority in the order in which they are passed.
     * @param limit Limit the result set to the specified number of resources.
     * @param offset Skip the specified number of resources in the result set.
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void getCreatorCollection_4(Integer storyId, String firstName, String middleName, String lastName, String suffix, String nameStartsWith, String firstNameStartsWith, String middleNameStartsWith, String lastNameStartsWith, OffsetDateTime modifiedSince, List<Integer> comics, List<Integer> series, List<Integer> events, List<String> orderBy, Integer limit, Integer offset) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'storyId' is set
        if (storyId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'storyId' when calling getCreatorCollection_4");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("storyId", storyId);
        String path = UriComponentsBuilder.fromPath("/v1/public/stories/{storyId}/creators").buildAndExpand(uriVariables).toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "firstName", firstName));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "middleName", middleName));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "lastName", lastName));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "suffix", suffix));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "nameStartsWith", nameStartsWith));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "firstNameStartsWith", firstNameStartsWith));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "middleNameStartsWith", middleNameStartsWith));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "lastNameStartsWith", lastNameStartsWith));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "modifiedSince", modifiedSince));
        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("csv".toUpperCase()), "comics", comics));
        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("csv".toUpperCase()), "series", series));
        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("csv".toUpperCase()), "events", events));
        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("csv".toUpperCase()), "orderBy", orderBy));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "limit", limit));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "offset", offset));

        final String[] accepts = {  };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

        ParameterizedTypeReference<Void> returnType = new ParameterizedTypeReference<Void>() {};
        apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Fetches lists of creators filtered by an event id.
     * Fetches lists of comic creators whose work appears in a specific event, with optional filters. See notes on individual parameters below.
     * <p><b>409</b> - Invalid value passed to filter.
     * @param eventId The event ID.
     * @param firstName Filter by creator first name (e.g. brian).
     * @param middleName Filter by creator middle name (e.g. Michael).
     * @param lastName Filter by creator last name (e.g. Bendis).
     * @param suffix Filter by suffix or honorific (e.g. Jr., Sr.).
     * @param nameStartsWith Filter by creator names that match critera (e.g. B, St L).
     * @param firstNameStartsWith Filter by creator first names that match critera (e.g. B, St L).
     * @param middleNameStartsWith Filter by creator middle names that match critera (e.g. Mi).
     * @param lastNameStartsWith Filter by creator last names that match critera (e.g. Ben).
     * @param modifiedSince Return only creators which have been modified since the specified date.
     * @param comics Return only creators who worked on in the specified comics (accepts a comma-separated list of ids).
     * @param series Return only creators who worked on the specified series (accepts a comma-separated list of ids).
     * @param stories Return only creators who worked on the specified stories (accepts a comma-separated list of ids).
     * @param orderBy Order the result set by a field or fields. Add a \&quot;-\&quot; to the value sort in descending order. Multiple values are given priority in the order in which they are passed.
     * @param limit Limit the result set to the specified number of resources.
     * @param offset Skip the specified number of resources in the result set.
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void getCreatorCollection_5(Integer eventId, String firstName, String middleName, String lastName, String suffix, String nameStartsWith, String firstNameStartsWith, String middleNameStartsWith, String lastNameStartsWith, OffsetDateTime modifiedSince, List<Integer> comics, List<Integer> series, List<Integer> stories, List<String> orderBy, Integer limit, Integer offset) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'eventId' is set
        if (eventId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'eventId' when calling getCreatorCollection_5");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("eventId", eventId);
        String path = UriComponentsBuilder.fromPath("/v1/public/events/{eventId}/creators").buildAndExpand(uriVariables).toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "firstName", firstName));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "middleName", middleName));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "lastName", lastName));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "suffix", suffix));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "nameStartsWith", nameStartsWith));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "firstNameStartsWith", firstNameStartsWith));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "middleNameStartsWith", middleNameStartsWith));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "lastNameStartsWith", lastNameStartsWith));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "modifiedSince", modifiedSince));
        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("csv".toUpperCase()), "comics", comics));
        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("csv".toUpperCase()), "series", series));
        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("csv".toUpperCase()), "stories", stories));
        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("csv".toUpperCase()), "orderBy", orderBy));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "limit", limit));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "offset", offset));

        final String[] accepts = {  };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

        ParameterizedTypeReference<Void> returnType = new ParameterizedTypeReference<Void>() {};
        apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Fetches lists of events filtered by a creator id.
     * Fetches lists of events featuring the work of a specific creator with optional filters. See notes on individual parameters below.
     * <p><b>409</b> - Invalid value passed to filter.
     * @param creatorId The creator ID.
     * @param name Filter the event list by name.
     * @param nameStartsWith Return events with names that begin with the specified string (e.g. Sp).
     * @param modifiedSince Return only events which have been modified since the specified date.
     * @param characters Return only events which feature the specified characters (accepts a comma-separated list of ids).
     * @param series Return only events which are part of the specified series (accepts a comma-separated list of ids).
     * @param comics Return only events which take place in the specified comics (accepts a comma-separated list of ids).
     * @param stories Return only events which contain the specified stories (accepts a comma-separated list of ids).
     * @param orderBy Order the result set by a field or fields. Add a \&quot;-\&quot; to the value sort in descending order. Multiple values are given priority in the order in which they are passed.
     * @param limit Limit the result set to the specified number of resources.
     * @param offset Skip the specified number of resources in the result set.
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void getCreatorEventsCollection(Integer creatorId, String name, String nameStartsWith, OffsetDateTime modifiedSince, List<Integer> characters, List<Integer> series, List<Integer> comics, List<Integer> stories, List<String> orderBy, Integer limit, Integer offset) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'creatorId' is set
        if (creatorId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'creatorId' when calling getCreatorEventsCollection");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("creatorId", creatorId);
        String path = UriComponentsBuilder.fromPath("/v1/public/creators/{creatorId}/events").buildAndExpand(uriVariables).toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "name", name));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "nameStartsWith", nameStartsWith));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "modifiedSince", modifiedSince));
        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("csv".toUpperCase()), "characters", characters));
        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("csv".toUpperCase()), "series", series));
        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("csv".toUpperCase()), "comics", comics));
        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("csv".toUpperCase()), "stories", stories));
        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("csv".toUpperCase()), "orderBy", orderBy));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "limit", limit));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "offset", offset));

        final String[] accepts = {  };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

        ParameterizedTypeReference<Void> returnType = new ParameterizedTypeReference<Void>() {};
        apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Fetches a single creator by id.
     * This method fetches a single creator resource.  It is the canonical URI for any creator resource provided by the API.
     * <p><b>404</b> - Creator not found.
     * @param creatorId A single creator id.
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void getCreatorIndividual(Integer creatorId) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'creatorId' is set
        if (creatorId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'creatorId' when calling getCreatorIndividual");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("creatorId", creatorId);
        String path = UriComponentsBuilder.fromPath("/v1/public/creators/{creatorId}").buildAndExpand(uriVariables).toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] accepts = {  };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

        ParameterizedTypeReference<Void> returnType = new ParameterizedTypeReference<Void>() {};
        apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Fetches lists of series filtered by a creator id.
     * Fetches lists of comic series in which a specific creator&#x27;s work appears, with optional filters. See notes on individual parameters below.
     * <p><b>409</b> - Invalid value passed to filter.
     * @param creatorId The creator ID.
     * @param title Filter by series title.
     * @param titleStartsWith Return series with titles that begin with the specified string (e.g. Sp).
     * @param startYear Return only series matching the specified start year.
     * @param modifiedSince Return only series which have been modified since the specified date.
     * @param comics Return only series which contain the specified comics (accepts a comma-separated list of ids).
     * @param stories Return only series which contain the specified stories (accepts a comma-separated list of ids).
     * @param events Return only series which have comics that take place during the specified events (accepts a comma-separated list of ids).
     * @param characters Return only series which feature the specified characters (accepts a comma-separated list of ids).
     * @param seriesType Filter the series by publication frequency type.
     * @param contains Return only series containing one or more comics with the specified format.
     * @param orderBy Order the result set by a field or fields. Add a \&quot;-\&quot; to the value sort in descending order. Multiple values are given priority in the order in which they are passed.
     * @param limit Limit the result set to the specified number of resources.
     * @param offset Skip the specified number of resources in the result set.
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void getCreatorSeriesCollection(Integer creatorId, String title, String titleStartsWith, Integer startYear, OffsetDateTime modifiedSince, List<Integer> comics, List<Integer> stories, List<Integer> events, List<Integer> characters, String seriesType, List<String> contains, List<String> orderBy, Integer limit, Integer offset) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'creatorId' is set
        if (creatorId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'creatorId' when calling getCreatorSeriesCollection");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("creatorId", creatorId);
        String path = UriComponentsBuilder.fromPath("/v1/public/creators/{creatorId}/series").buildAndExpand(uriVariables).toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "title", title));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "titleStartsWith", titleStartsWith));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "startYear", startYear));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "modifiedSince", modifiedSince));
        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("csv".toUpperCase()), "comics", comics));
        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("csv".toUpperCase()), "stories", stories));
        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("csv".toUpperCase()), "events", events));
        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("csv".toUpperCase()), "characters", characters));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "seriesType", seriesType));
        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("csv".toUpperCase()), "contains", contains));
        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("csv".toUpperCase()), "orderBy", orderBy));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "limit", limit));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "offset", offset));

        final String[] accepts = {  };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

        ParameterizedTypeReference<Void> returnType = new ParameterizedTypeReference<Void>() {};
        apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Fetches lists of stories filtered by a creator id.
     * Fetches lists of comic stories by a specific creator with optional filters. See notes on individual parameters below.
     * <p><b>409</b> - Invalid value passed to filter.
     * @param creatorId The ID of the creator.
     * @param modifiedSince Return only stories which have been modified since the specified date.
     * @param comics Return only stories contained in the specified comics (accepts a comma-separated list of ids).
     * @param series Return only stories contained the specified series (accepts a comma-separated list of ids).
     * @param events Return only stories which take place during the specified events (accepts a comma-separated list of ids).
     * @param characters Return only stories which feature the specified characters (accepts a comma-separated list of ids).
     * @param orderBy Order the result set by a field or fields. Add a \&quot;-\&quot; to the value sort in descending order. Multiple values are given priority in the order in which they are passed.
     * @param limit Limit the result set to the specified number of resources.
     * @param offset Skip the specified number of resources in the result set.
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void getCreatorStoryCollection(Integer creatorId, OffsetDateTime modifiedSince, List<Integer> comics, List<Integer> series, List<Integer> events, List<Integer> characters, List<String> orderBy, Integer limit, Integer offset) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'creatorId' is set
        if (creatorId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'creatorId' when calling getCreatorStoryCollection");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("creatorId", creatorId);
        String path = UriComponentsBuilder.fromPath("/v1/public/creators/{creatorId}/stories").buildAndExpand(uriVariables).toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "modifiedSince", modifiedSince));
        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("csv".toUpperCase()), "comics", comics));
        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("csv".toUpperCase()), "series", series));
        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("csv".toUpperCase()), "events", events));
        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("csv".toUpperCase()), "characters", characters));
        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("csv".toUpperCase()), "orderBy", orderBy));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "limit", limit));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "offset", offset));

        final String[] accepts = {  };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

        ParameterizedTypeReference<Void> returnType = new ParameterizedTypeReference<Void>() {};
        apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Fetches lists of characters filtered by an event id.
     * Fetches lists of characters which appear in a specific event, with optional filters. See notes on individual parameters below.
     * <p><b>409</b> - Invalid value passed to filter.
     * @param eventId The event ID
     * @param name Return only characters matching the specified full character name (e.g. Spider-Man).
     * @param nameStartsWith Return characters with names that begin with the specified string (e.g. Sp).
     * @param modifiedSince Return only characters which have been modified since the specified date.
     * @param comics Return only characters which appear in the specified comics (accepts a comma-separated list of ids).
     * @param series Return only characters which appear the specified series (accepts a comma-separated list of ids).
     * @param stories Return only characters which appear the specified stories (accepts a comma-separated list of ids).
     * @param orderBy Order the result set by a field or fields. Add a \&quot;-\&quot; to the value sort in descending order. Multiple values are given priority in the order in which they are passed.
     * @param limit Limit the result set to the specified number of resources.
     * @param offset Skip the specified number of resources in the result set.
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void getEventCharacterCollection(Integer eventId, String name, String nameStartsWith, OffsetDateTime modifiedSince, List<Integer> comics, List<Integer> series, List<Integer> stories, List<String> orderBy, Integer limit, Integer offset) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'eventId' is set
        if (eventId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'eventId' when calling getEventCharacterCollection");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("eventId", eventId);
        String path = UriComponentsBuilder.fromPath("/v1/public/events/{eventId}/characters").buildAndExpand(uriVariables).toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "name", name));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "nameStartsWith", nameStartsWith));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "modifiedSince", modifiedSince));
        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("csv".toUpperCase()), "comics", comics));
        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("csv".toUpperCase()), "series", series));
        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("csv".toUpperCase()), "stories", stories));
        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("csv".toUpperCase()), "orderBy", orderBy));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "limit", limit));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "offset", offset));

        final String[] accepts = {  };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

        ParameterizedTypeReference<Void> returnType = new ParameterizedTypeReference<Void>() {};
        apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Fetches a single event by id.
     * This method fetches a single event resource.  It is the canonical URI for any event resource provided by the API.
     * <p><b>404</b> - Event not found.
     * @param eventId A single event.
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void getEventIndividual(Integer eventId) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'eventId' is set
        if (eventId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'eventId' when calling getEventIndividual");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("eventId", eventId);
        String path = UriComponentsBuilder.fromPath("/v1/public/events/{eventId}").buildAndExpand(uriVariables).toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] accepts = {  };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

        ParameterizedTypeReference<Void> returnType = new ParameterizedTypeReference<Void>() {};
        apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Fetches lists of series filtered by an event id.
     * Fetches lists of comic series in which a specific event takes place, with optional filters. See notes on individual parameters below.
     * <p><b>409</b> - Invalid value passed to filter.
     * @param eventId The event ID.
     * @param title Filter by series title.
     * @param titleStartsWith Return series with titles that begin with the specified string (e.g. Sp).
     * @param startYear Return only series matching the specified start year.
     * @param modifiedSince Return only series which have been modified since the specified date.
     * @param comics Return only series which contain the specified comics (accepts a comma-separated list of ids).
     * @param stories Return only series which contain the specified stories (accepts a comma-separated list of ids).
     * @param creators Return only series which feature work by the specified creators (accepts a comma-separated list of ids).
     * @param characters Return only series which feature the specified characters (accepts a comma-separated list of ids).
     * @param seriesType Filter the series by publication frequency type.
     * @param contains Return only series containing one or more comics with the specified format.
     * @param orderBy Order the result set by a field or fields. Add a \&quot;-\&quot; to the value sort in descending order. Multiple values are given priority in the order in which they are passed.
     * @param limit Limit the result set to the specified number of resources.
     * @param offset Skip the specified number of resources in the result set.
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void getEventSeriesCollection(Integer eventId, String title, String titleStartsWith, Integer startYear, OffsetDateTime modifiedSince, List<Integer> comics, List<Integer> stories, List<Integer> creators, List<Integer> characters, String seriesType, List<String> contains, List<String> orderBy, Integer limit, Integer offset) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'eventId' is set
        if (eventId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'eventId' when calling getEventSeriesCollection");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("eventId", eventId);
        String path = UriComponentsBuilder.fromPath("/v1/public/events/{eventId}/series").buildAndExpand(uriVariables).toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "title", title));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "titleStartsWith", titleStartsWith));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "startYear", startYear));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "modifiedSince", modifiedSince));
        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("csv".toUpperCase()), "comics", comics));
        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("csv".toUpperCase()), "stories", stories));
        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("csv".toUpperCase()), "creators", creators));
        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("csv".toUpperCase()), "characters", characters));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "seriesType", seriesType));
        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("csv".toUpperCase()), "contains", contains));
        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("csv".toUpperCase()), "orderBy", orderBy));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "limit", limit));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "offset", offset));

        final String[] accepts = {  };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

        ParameterizedTypeReference<Void> returnType = new ParameterizedTypeReference<Void>() {};
        apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Fetches lists of stories filtered by an event id.
     * Fetches lists of comic stories from a specific event, with optional filters. See notes on individual parameters below.
     * <p><b>409</b> - Invalid value passed to filter.
     * @param eventId The ID of the event.
     * @param modifiedSince Return only stories which have been modified since the specified date.
     * @param comics Return only stories contained in the specified (accepts a comma-separated list of ids).
     * @param series Return only stories contained the specified series (accepts a comma-separated list of ids).
     * @param creators Return only stories which feature work by the specified creators (accepts a comma-separated list of ids).
     * @param characters Return only stories which feature the specified characters (accepts a comma-separated list of ids).
     * @param orderBy Order the result set by a field or fields. Add a \&quot;-\&quot; to the value sort in descending order. Multiple values are given priority in the order in which they are passed.
     * @param limit Limit the result set to the specified number of resources.
     * @param offset Skip the specified number of resources in the result set.
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void getEventStoryCollection(Integer eventId, OffsetDateTime modifiedSince, List<Integer> comics, List<Integer> series, List<Integer> creators, List<Integer> characters, List<String> orderBy, Integer limit, Integer offset) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'eventId' is set
        if (eventId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'eventId' when calling getEventStoryCollection");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("eventId", eventId);
        String path = UriComponentsBuilder.fromPath("/v1/public/events/{eventId}/stories").buildAndExpand(uriVariables).toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "modifiedSince", modifiedSince));
        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("csv".toUpperCase()), "comics", comics));
        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("csv".toUpperCase()), "series", series));
        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("csv".toUpperCase()), "creators", creators));
        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("csv".toUpperCase()), "characters", characters));
        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("csv".toUpperCase()), "orderBy", orderBy));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "limit", limit));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "offset", offset));

        final String[] accepts = {  };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

        ParameterizedTypeReference<Void> returnType = new ParameterizedTypeReference<Void>() {};
        apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Fetches lists of events filtered by a story id.
     * Fetches lists of events in which a specific story appears, with optional filters. See notes on individual parameters below.
     * <p><b>409</b> - Invalid value passed to filter.
     * @param storyId The story ID.
     * @param name Filter the event list by name.
     * @param nameStartsWith Return events with names that begin with the specified string (e.g. Sp).
     * @param modifiedSince Return only events which have been modified since the specified date.
     * @param creators Return only events which feature work by the specified creators (accepts a comma-separated list of ids).
     * @param characters Return only events which feature the specified characters (accepts a comma-separated list of ids).
     * @param series Return only events which are part of the specified series (accepts a comma-separated list of ids).
     * @param comics Return only events which take place in the specified comics (accepts a comma-separated list of ids).
     * @param orderBy Order the result set by a field or fields. Add a \&quot;-\&quot; to the value sort in descending order. Multiple values are given priority in the order in which they are passed.
     * @param limit Limit the result set to the specified number of resources.
     * @param offset Skip the specified number of resources in the result set.
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void getEventsCollection(Integer storyId, String name, String nameStartsWith, OffsetDateTime modifiedSince, List<Integer> creators, List<Integer> characters, List<Integer> series, List<Integer> comics, List<String> orderBy, Integer limit, Integer offset) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'storyId' is set
        if (storyId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'storyId' when calling getEventsCollection");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("storyId", storyId);
        String path = UriComponentsBuilder.fromPath("/v1/public/stories/{storyId}/events").buildAndExpand(uriVariables).toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "name", name));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "nameStartsWith", nameStartsWith));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "modifiedSince", modifiedSince));
        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("csv".toUpperCase()), "creators", creators));
        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("csv".toUpperCase()), "characters", characters));
        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("csv".toUpperCase()), "series", series));
        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("csv".toUpperCase()), "comics", comics));
        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("csv".toUpperCase()), "orderBy", orderBy));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "limit", limit));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "offset", offset));

        final String[] accepts = {  };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

        ParameterizedTypeReference<Void> returnType = new ParameterizedTypeReference<Void>() {};
        apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Fetches lists of events filtered by a series id.
     * Fetches lists of events which occur in a specific series, with optional filters. See notes on individual parameters below.
     * <p><b>409</b> - Invalid value passed to filter.
     * @param seriesId The series ID.
     * @param name Filter the event list by name.
     * @param nameStartsWith Return events with names that begin with the specified string (e.g. Sp).
     * @param modifiedSince Return only events which have been modified since the specified date.
     * @param creators Return only events which feature work by the specified creators (accepts a comma-separated list of ids).
     * @param characters Return only events which feature the specified characters (accepts a comma-separated list of ids).
     * @param comics Return only events which take place in the specified comics (accepts a comma-separated list of ids).
     * @param stories Return only events which contain the specified stories (accepts a comma-separated list of ids).
     * @param orderBy Order the result set by a field or fields. Add a \&quot;-\&quot; to the value sort in descending order. Multiple values are given priority in the order in which they are passed.
     * @param limit Limit the result set to the specified number of resources.
     * @param offset Skip the specified number of resources in the result set.
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void getEventsCollection_0(Integer seriesId, String name, String nameStartsWith, OffsetDateTime modifiedSince, List<Integer> creators, List<Integer> characters, List<Integer> comics, List<Integer> stories, List<String> orderBy, Integer limit, Integer offset) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'seriesId' is set
        if (seriesId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'seriesId' when calling getEventsCollection_0");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("seriesId", seriesId);
        String path = UriComponentsBuilder.fromPath("/v1/public/series/{seriesId}/events").buildAndExpand(uriVariables).toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "name", name));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "nameStartsWith", nameStartsWith));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "modifiedSince", modifiedSince));
        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("csv".toUpperCase()), "creators", creators));
        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("csv".toUpperCase()), "characters", characters));
        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("csv".toUpperCase()), "comics", comics));
        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("csv".toUpperCase()), "stories", stories));
        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("csv".toUpperCase()), "orderBy", orderBy));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "limit", limit));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "offset", offset));

        final String[] accepts = {  };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

        ParameterizedTypeReference<Void> returnType = new ParameterizedTypeReference<Void>() {};
        apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Fetches lists of events.
     * Fetches lists of events with optional filters. See notes on individual parameters below.
     * <p><b>409</b> - Invalid value passed to filter.
     * @param name Return only events which match the specified name.
     * @param nameStartsWith Return events with names that begin with the specified string (e.g. Sp).
     * @param modifiedSince Return only events which have been modified since the specified date.
     * @param creators Return only events which feature work by the specified creators (accepts a comma-separated list of ids).
     * @param characters Return only events which feature the specified characters (accepts a comma-separated list of ids).
     * @param series Return only events which are part of the specified series (accepts a comma-separated list of ids).
     * @param comics Return only events which take place in the specified comics (accepts a comma-separated list of ids).
     * @param stories Return only events which take place in the specified stories (accepts a comma-separated list of ids).
     * @param orderBy Order the result set by a field or fields. Add a \&quot;-\&quot; to the value sort in descending order. Multiple values are given priority in the order in which they are passed.
     * @param limit Limit the result set to the specified number of resources.
     * @param offset Skip the specified number of resources in the result set.
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void getEventsCollection_1(String name, String nameStartsWith, OffsetDateTime modifiedSince, List<Integer> creators, List<Integer> characters, List<Integer> series, List<Integer> comics, List<Integer> stories, List<String> orderBy, Integer limit, Integer offset) throws RestClientException {
        Object postBody = null;
        String path = UriComponentsBuilder.fromPath("/v1/public/events").build().toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "name", name));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "nameStartsWith", nameStartsWith));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "modifiedSince", modifiedSince));
        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("csv".toUpperCase()), "creators", creators));
        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("csv".toUpperCase()), "characters", characters));
        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("csv".toUpperCase()), "series", series));
        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("csv".toUpperCase()), "comics", comics));
        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("csv".toUpperCase()), "stories", stories));
        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("csv".toUpperCase()), "orderBy", orderBy));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "limit", limit));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "offset", offset));

        final String[] accepts = {  };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

        ParameterizedTypeReference<Void> returnType = new ParameterizedTypeReference<Void>() {};
        apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Fetches lists of events filtered by a comic id.
     * Fetches lists of events in which a specific comic appears, with optional filters. See notes on individual parameters below.
     * <p><b>409</b> - Invalid value passed to filter.
     * @param comicId The comic ID.
     * @param name Filter the event list by name.
     * @param nameStartsWith Return events with names that begin with the specified string (e.g. Sp).
     * @param modifiedSince Return only events which have been modified since the specified date.
     * @param creators Return only events which feature work by the specified creators (accepts a comma-separated list of ids).
     * @param characters Return only events which feature the specified characters (accepts a comma-separated list of ids).
     * @param series Return only events which are part of the specified series (accepts a comma-separated list of ids).
     * @param stories Return only events which contain the specified stories (accepts a comma-separated list of ids).
     * @param orderBy Order the result set by a field or fields. Add a \&quot;-\&quot; to the value sort in descending order. Multiple values are given priority in the order in which they are passed.
     * @param limit Limit the result set to the specified number of resources.
     * @param offset Skip the specified number of resources in the result set.
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void getIssueEventsCollection(Integer comicId, String name, String nameStartsWith, OffsetDateTime modifiedSince, List<Integer> creators, List<Integer> characters, List<Integer> series, List<Integer> stories, List<String> orderBy, Integer limit, Integer offset) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'comicId' is set
        if (comicId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'comicId' when calling getIssueEventsCollection");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("comicId", comicId);
        String path = UriComponentsBuilder.fromPath("/v1/public/comics/{comicId}/events").buildAndExpand(uriVariables).toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "name", name));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "nameStartsWith", nameStartsWith));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "modifiedSince", modifiedSince));
        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("csv".toUpperCase()), "creators", creators));
        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("csv".toUpperCase()), "characters", characters));
        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("csv".toUpperCase()), "series", series));
        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("csv".toUpperCase()), "stories", stories));
        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("csv".toUpperCase()), "orderBy", orderBy));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "limit", limit));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "offset", offset));

        final String[] accepts = {  };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

        ParameterizedTypeReference<Void> returnType = new ParameterizedTypeReference<Void>() {};
        apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Fetches lists of characters filtered by a series id.
     * Fetches lists of characters which appear in specific series, with optional filters. See notes on individual parameters below.
     * <p><b>409</b> - Invalid value passed to filter.
     * @param seriesId The series id.
     * @param name Return only characters matching the specified full character name (e.g. Spider-Man).
     * @param nameStartsWith Return characters with names that begin with the specified string (e.g. Sp).
     * @param modifiedSince Return only characters which have been modified since the specified date.
     * @param comics Return only characters which appear in the specified comics (accepts a comma-separated list of ids).
     * @param events Return only characters which appear comics that took place in the specified events (accepts a comma-separated list of ids).
     * @param stories Return only characters which appear the specified stories (accepts a comma-separated list of ids).
     * @param orderBy Order the result set by a field or fields. Add a \&quot;-\&quot; to the value sort in descending order. Multiple values are given priority in the order in which they are passed.
     * @param limit Limit the result set to the specified number of resources.
     * @param offset Skip the specified number of resources in the result set.
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void getSeriesCharacterWrapper(Integer seriesId, String name, String nameStartsWith, OffsetDateTime modifiedSince, List<Integer> comics, List<Integer> events, List<Integer> stories, List<String> orderBy, Integer limit, Integer offset) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'seriesId' is set
        if (seriesId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'seriesId' when calling getSeriesCharacterWrapper");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("seriesId", seriesId);
        String path = UriComponentsBuilder.fromPath("/v1/public/series/{seriesId}/characters").buildAndExpand(uriVariables).toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "name", name));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "nameStartsWith", nameStartsWith));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "modifiedSince", modifiedSince));
        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("csv".toUpperCase()), "comics", comics));
        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("csv".toUpperCase()), "events", events));
        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("csv".toUpperCase()), "stories", stories));
        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("csv".toUpperCase()), "orderBy", orderBy));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "limit", limit));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "offset", offset));

        final String[] accepts = {  };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

        ParameterizedTypeReference<Void> returnType = new ParameterizedTypeReference<Void>() {};
        apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Fetches lists of series.
     * Fetches lists of comic series with optional filters. See notes on individual parameters below.
     * <p><b>409</b> - Invalid value passed to filter.
     * @param title Return only series matching the specified title.
     * @param titleStartsWith Return series with titles that begin with the specified string (e.g. Sp).
     * @param startYear Return only series matching the specified start year.
     * @param modifiedSince Return only series which have been modified since the specified date.
     * @param comics Return only series which contain the specified comics (accepts a comma-separated list of ids).
     * @param stories Return only series which contain the specified stories (accepts a comma-separated list of ids).
     * @param events Return only series which have comics that take place during the specified events (accepts a comma-separated list of ids).
     * @param creators Return only series which feature work by the specified creators (accepts a comma-separated list of ids).
     * @param characters Return only series which feature the specified characters (accepts a comma-separated list of ids).
     * @param seriesType Filter the series by publication frequency type.
     * @param contains Return only series containing one or more comics with the specified format.
     * @param orderBy Order the result set by a field or fields. Add a \&quot;-\&quot; to the value sort in descending order. Multiple values are given priority in the order in which they are passed.
     * @param limit Limit the result set to the specified number of resources.
     * @param offset Skip the specified number of resources in the result set.
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void getSeriesCollection(String title, String titleStartsWith, Integer startYear, OffsetDateTime modifiedSince, List<Integer> comics, List<Integer> stories, List<Integer> events, List<Integer> creators, List<Integer> characters, String seriesType, List<String> contains, List<String> orderBy, Integer limit, Integer offset) throws RestClientException {
        Object postBody = null;
        String path = UriComponentsBuilder.fromPath("/v1/public/series").build().toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "title", title));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "titleStartsWith", titleStartsWith));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "startYear", startYear));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "modifiedSince", modifiedSince));
        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("csv".toUpperCase()), "comics", comics));
        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("csv".toUpperCase()), "stories", stories));
        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("csv".toUpperCase()), "events", events));
        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("csv".toUpperCase()), "creators", creators));
        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("csv".toUpperCase()), "characters", characters));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "seriesType", seriesType));
        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("csv".toUpperCase()), "contains", contains));
        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("csv".toUpperCase()), "orderBy", orderBy));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "limit", limit));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "offset", offset));

        final String[] accepts = {  };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

        ParameterizedTypeReference<Void> returnType = new ParameterizedTypeReference<Void>() {};
        apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Fetches a single comic series by id.
     * This method fetches a single comic series resource.  It is the canonical URI for any comic series resource provided by the API.
     * <p><b>404</b> - Series not found.
     * @param seriesId Filter by series title.
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void getSeriesIndividual(Integer seriesId) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'seriesId' is set
        if (seriesId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'seriesId' when calling getSeriesIndividual");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("seriesId", seriesId);
        String path = UriComponentsBuilder.fromPath("/v1/public/series/{seriesId}").buildAndExpand(uriVariables).toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] accepts = {  };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

        ParameterizedTypeReference<Void> returnType = new ParameterizedTypeReference<Void>() {};
        apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Fetches lists of stories filtered by a series id.
     * Fetches lists of comic stories from a specific series with optional filters. See notes on individual parameters below.
     * <p><b>409</b> - Invalid value passed to filter.
     * @param seriesId The series ID.
     * @param modifiedSince Return only stories which have been modified since the specified date.
     * @param comics Return only stories contained in the specified (accepts a comma-separated list of ids).
     * @param events Return only stories which take place during the specified events (accepts a comma-separated list of ids).
     * @param creators Return only stories which feature work by the specified creators (accepts a comma-separated list of ids).
     * @param characters Return only stories which feature the specified characters (accepts a comma-separated list of ids).
     * @param orderBy Order the result set by a field or fields. Add a \&quot;-\&quot; to the value sort in descending order. Multiple values are given priority in the order in which they are passed.
     * @param limit Limit the result set to the specified number of resources.
     * @param offset Skip the specified number of resources in the result set.
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void getSeriesStoryCollection(Integer seriesId, OffsetDateTime modifiedSince, List<Integer> comics, List<Integer> events, List<Integer> creators, List<Integer> characters, List<String> orderBy, Integer limit, Integer offset) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'seriesId' is set
        if (seriesId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'seriesId' when calling getSeriesStoryCollection");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("seriesId", seriesId);
        String path = UriComponentsBuilder.fromPath("/v1/public/series/{seriesId}/stories").buildAndExpand(uriVariables).toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "modifiedSince", modifiedSince));
        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("csv".toUpperCase()), "comics", comics));
        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("csv".toUpperCase()), "events", events));
        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("csv".toUpperCase()), "creators", creators));
        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("csv".toUpperCase()), "characters", characters));
        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("csv".toUpperCase()), "orderBy", orderBy));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "limit", limit));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "offset", offset));

        final String[] accepts = {  };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

        ParameterizedTypeReference<Void> returnType = new ParameterizedTypeReference<Void>() {};
        apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Fetches lists of stories.
     * Fetches lists of comic stories with optional filters. See notes on individual parameters below.
     * <p><b>409</b> - Invalid value passed to filter.
     * @param modifiedSince Return only stories which have been modified since the specified date.
     * @param comics Return only stories contained in the specified (accepts a comma-separated list of ids).
     * @param series Return only stories contained the specified series (accepts a comma-separated list of ids).
     * @param events Return only stories which take place during the specified events (accepts a comma-separated list of ids).
     * @param creators Return only stories which feature work by the specified creators (accepts a comma-separated list of ids).
     * @param characters Return only stories which feature the specified characters (accepts a comma-separated list of ids).
     * @param orderBy Order the result set by a field or fields. Add a \&quot;-\&quot; to the value sort in descending order. Multiple values are given priority in the order in which they are passed.
     * @param limit Limit the result set to the specified number of resources.
     * @param offset Skip the specified number of resources in the result set.
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void getStoryCollection(OffsetDateTime modifiedSince, List<Integer> comics, List<Integer> series, List<Integer> events, List<Integer> creators, List<Integer> characters, List<String> orderBy, Integer limit, Integer offset) throws RestClientException {
        Object postBody = null;
        String path = UriComponentsBuilder.fromPath("/v1/public/stories").build().toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "modifiedSince", modifiedSince));
        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("csv".toUpperCase()), "comics", comics));
        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("csv".toUpperCase()), "series", series));
        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("csv".toUpperCase()), "events", events));
        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("csv".toUpperCase()), "creators", creators));
        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("csv".toUpperCase()), "characters", characters));
        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("csv".toUpperCase()), "orderBy", orderBy));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "limit", limit));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "offset", offset));

        final String[] accepts = {  };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

        ParameterizedTypeReference<Void> returnType = new ParameterizedTypeReference<Void>() {};
        apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Fetches a single comic story by id.
     * This method fetches a single comic story resource.  It is the canonical URI for any comic story resource provided by the API.
     * <p><b>404</b> - Story not found.
     * @param storyId Filter by story id.
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void getStoryIndividual(Integer storyId) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'storyId' is set
        if (storyId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'storyId' when calling getStoryIndividual");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("storyId", storyId);
        String path = UriComponentsBuilder.fromPath("/v1/public/stories/{storyId}").buildAndExpand(uriVariables).toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] accepts = {  };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

        ParameterizedTypeReference<Void> returnType = new ParameterizedTypeReference<Void>() {};
        apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Fetches lists of series filtered by a story id.
     * Fetches lists of comic series in which the specified story takes place. See notes on individual parameters below.
     * <p><b>409</b> - Invalid value passed to filter.
     * @param storyId The story ID.
     * @param events Return only series which have comics that take place during the specified events (accepts a comma-separated list of ids).
     * @param title Filter by series title.
     * @param titleStartsWith Return series with titles that begin with the specified string (e.g. Sp).
     * @param startYear Return only series matching the specified start year.
     * @param modifiedSince Return only series which have been modified since the specified date.
     * @param comics Return only series which contain the specified comics (accepts a comma-separated list of ids).
     * @param creators Return only series which feature work by the specified creators (accepts a comma-separated list of ids).
     * @param characters Return only series which feature the specified characters (accepts a comma-separated list of ids).
     * @param seriesType Filter the series by publication frequency type.
     * @param contains Return only series containing one or more comics with the specified format.
     * @param orderBy Order the result set by a field or fields. Add a \&quot;-\&quot; to the value sort in descending order. Multiple values are given priority in the order in which they are passed.
     * @param limit Limit the result set to the specified number of resources.
     * @param offset Skip the specified number of resources in the result set.
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void getStorySeriesCollection(Integer storyId, List<Integer> events, String title, String titleStartsWith, Integer startYear, OffsetDateTime modifiedSince, List<Integer> comics, List<Integer> creators, List<Integer> characters, String seriesType, List<String> contains, List<String> orderBy, Integer limit, Integer offset) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'storyId' is set
        if (storyId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'storyId' when calling getStorySeriesCollection");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("storyId", storyId);
        String path = UriComponentsBuilder.fromPath("/v1/public/stories/{storyId}/series").buildAndExpand(uriVariables).toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();
        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("csv".toUpperCase()), "events", events));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "title", title));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "titleStartsWith", titleStartsWith));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "startYear", startYear));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "modifiedSince", modifiedSince));
        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("csv".toUpperCase()), "comics", comics));
        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("csv".toUpperCase()), "creators", creators));
        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("csv".toUpperCase()), "characters", characters));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "seriesType", seriesType));
        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("csv".toUpperCase()), "contains", contains));
        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("csv".toUpperCase()), "orderBy", orderBy));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "limit", limit));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "offset", offset));

        final String[] accepts = {  };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

        ParameterizedTypeReference<Void> returnType = new ParameterizedTypeReference<Void>() {};
        apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
}
