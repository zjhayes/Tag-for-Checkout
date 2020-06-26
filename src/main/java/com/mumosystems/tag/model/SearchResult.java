package com.mumosystems.tag.model;

import java.util.List;

public class SearchResult
{
    private Item item;
    private List<Issue> issues;

    public int getResultTotal()
    {
        return issues.size();
    }

    public boolean hasIssues()
    {
        return !issues.isEmpty();
    }

    public Item getItem()
    {
        return item;
    }

    public boolean hasItem()
    {
        return item != null;
    }

    public void setItem(Item item)
    {
        this.item = item;
    }

    public List<Issue> getIssues()
    {
        return issues;
    }

    public void setIssues(List<Issue> issues)
    {
        this.issues = issues;
    }

    public void addIssue(Issue issue)
    {
        issues.add(issue);
    }

    public String toString()
    {
        return "SearchResults: Total= " + getResultTotal() + " Items: " + item.toString();
    }
}
