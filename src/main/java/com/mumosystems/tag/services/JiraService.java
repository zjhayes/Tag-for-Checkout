package com.mumosystems.tag.services;

import com.atlassian.connect.spring.AtlassianHostRestClients;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.mumosystems.tag.model.CheckoutProperties;
import com.mumosystems.tag.model.Issue;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JiraService
{
    @Autowired
    private AtlassianHostRestClients atlassianHostRestClients;

    ObjectMapper mapper = new ObjectMapper();

    public String getProject(String projectKey)
    {
        String endpoint = "/rest/api/3/project/";
        return atlassianHostRestClients.authenticatedAsAddon().getForObject(endpoint + projectKey, String.class);
    }

    public List<Issue> getProjectIssues(String projectKey, int maxResults, int startAt) throws Exception
    {
        String endpoint = "/rest/api/2/search?jql=project=" + projectKey + "&maxResults=" + maxResults +
                "&startAt=" + startAt;
        JSONObject json = makeRestForCall(endpoint);
        return mapper.readValue(json.get("issues").toString(),
                mapper.getTypeFactory().constructCollectionType(List.class, Issue.class));
    }

    public CheckoutProperties getCheckoutProperties(String issueKey) throws Exception
    {
        String endpoint = "/rest/api/2/issue/" + issueKey + "/properties/com.mumosystems.checkout-order";
        JSONObject json = makeRestForCall(endpoint);

        return mapper.readValue(json.get("value").toString(),CheckoutProperties.class);
    }

    private JSONObject makeRestForCall(String endpoint) throws ParseException
    {
        JSONParser parser = new JSONParser();
        String response = atlassianHostRestClients.authenticatedAsAddon().getForObject(endpoint, String.class);
        return (JSONObject) parser.parse(response);
    }
}
