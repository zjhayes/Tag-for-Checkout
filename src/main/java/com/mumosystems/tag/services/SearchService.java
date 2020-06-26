package com.mumosystems.tag.services;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.mumosystems.tag.model.Issue;
import com.mumosystems.tag.model.Item;
import com.mumosystems.tag.model.SearchResult;
import org.json.simple.parser.ParseException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.task.DelegatingSecurityContextAsyncTaskExecutor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

@Service
public class SearchService
{
    @Autowired
    JiraService jira;

    public SearchResult searchForItem(String projectKey, String searchString, int maxResults, int startAt)
            throws Exception
    {
        SearchResult result = new SearchResult();
        // Add issues matching search string to results.
        result.setIssues(searchIssues(projectKey, searchString, maxResults, startAt));
        // Add item to results.
        if(result.hasIssues())
        {
            result.setItem(getItemFromIssue(searchString, result.getIssues().get(0)));
        }

        return result;
    }

    private List<Issue> searchIssues(String projectKey, String searchString, int maxResults, int startAt)
            throws Exception
    {
        List<Issue> issues = jira.getProjectIssues(projectKey, maxResults, startAt);
        List<Issue> matchingIssues = new ArrayList<Issue>();
        for(Issue issue : issues)
        {
            // Add issue to results if item exists in issue.
            if(issueHasItem(searchString, issue.getCheckout().getItems()))
            {
                matchingIssues.add(issue);
            }
        }
        return matchingIssues;
    }

    private boolean issueHasItem(String searchString, Item[] items)
    {
        for(Item item : items)
        {
            if(item.getItemDescription().equals(searchString))
            {
                return true;
            }
        }
        return false;
    }

    private Item getItemFromIssue(String searchString, Issue issue) throws Exception
    {
        for(Item item : issue.getCheckout().getItems())
        {
            if(item.getItemDescription().equals(searchString))
            {
                return item;
            }
        }
        throw new NoSuchElementException("Could not find item in issue " + issue.getKey());
    }
}
