package com.mumosystems.tag.services;

import com.atlassian.connect.spring.AtlassianHostRestClients;
import com.fasterxml.jackson.core.JsonProcessingException;
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

    public List<Issue> getProjectIssues(String projectKey, int maxResults, int startAt)
            throws ParseException, JsonProcessingException
    {
        String endpoint = "/rest/api/2/search?jql=project=" + projectKey + "&maxResults=" + maxResults +
                "&startAt=" + startAt;
        JSONObject json = makeRestGetCall(endpoint);
        List<Issue> issues = mapper.readValue(json.get("issues").toString(),
                mapper.getTypeFactory().constructCollectionType(List.class, Issue.class));
        for(Issue issue : issues)
        {
            issue.setCheckout(getCheckoutProperties(issue.getKey()));
        }
        return issues;
    }

    private CheckoutProperties getCheckoutProperties(String issueKey) throws ParseException, JsonProcessingException
    {
        String endpoint = "/rest/api/2/issue/" + issueKey + "/properties/com.mumosystems.checkout-order";
        JSONObject json = makeRestGetCall(endpoint);
        return mapper.readValue(json.get("value").toString(),CheckoutProperties.class);
    }

    private JSONObject makeRestGetCall(String endpoint) throws ParseException
    {
        JSONParser parser = new JSONParser();
        String response = atlassianHostRestClients.authenticatedAsAddon().getForObject(endpoint, String.class);
        return (JSONObject) parser.parse(response);
    }
}