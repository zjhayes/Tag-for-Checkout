package com.mumosystems.tag.services;

import com.atlassian.connect.spring.AtlassianHostRestClients;
import com.mumosystems.tag.model.CheckoutProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.client.RestTemplate;

public class JiraService
{
    @Autowired
    private AtlassianHostRestClients atlassianHostRestClients;

    public String getProject(String projectKey)
    {
        String endpoint = "/rest/api/3/project/";
        return atlassianHostRestClients.authenticatedAsAddon().getForObject(endpoint + projectKey, String.class);
    }

    public CheckoutProperties getCheckoutProperties(String issueKey)
    {
        String endpoint = "/rest/api/2/issue/" + issueKey + "/properties/com.mumosystems.checkout-order";
        return atlassianHostRestClients.authenticatedAsAddon().getForObject(endpoint, CheckoutProperties.class);
    }
}
