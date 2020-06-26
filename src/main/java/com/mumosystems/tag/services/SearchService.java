package com.mumosystems.tag.services;
import com.mumosystems.tag.model.Issue;
import com.mumosystems.tag.model.Item;
import com.mumosystems.tag.model.SearchResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

@Service
public class SearchService
{
    @Autowired
    JiraService jira;

    public List<SearchResult> searchEachIssueInProjectForItem(String projectKey, String sku,
                                                               int maxResults, int startAt) throws Exception
    {
        List<Issue> issues = jira.getProjectIssues(projectKey, maxResults, startAt);
        List<SearchResult> results = new ArrayList<>();
        for(Issue issue : issues)
        {
            // Iterate each item in issue.
            List<Item> items = issue.getCheckout().getItems();
            for(Item item : items)
            {
                // Capture issue and item if sku matches.
                if(item.getSKU().equals(sku))
                {
                    SearchResult result = new SearchResult(issue, item);
                    results.add(result);
                }
            }
        }
        return results;
    }
}
