package com.mumosystems.tag.model;

public class SearchResult
{
    Issue issue;
    Item item;

    public SearchResult(Issue issue, Item item)
    {
        this.issue = issue;
        this.item = item;
    }

    public Issue getIssue()
    {
        return issue;
    }

    public void setIssue(Issue issue)
    {
        this.issue = issue;
    }

    public Item getItem()
    {
        return item;
    }

    public void setItem(Item item)
    {
        this.item = item;
    }

    @Override
    public String toString()
    {
        return "Result{" +
                "issue=" + issue +
                ", item=" + item +
                '}';
    }
}
