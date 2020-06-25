package com.mumosystems.tag.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties({"total", "user", "address", "hasDebit"})
public class CheckoutProperties
{
    private String issueIdOrKey;

    private String[] unlistedItemRequests;

    private Department department;

    private Item[] items;

    private String status;

    public String getIssueIdOrKey ()
    {
        return issueIdOrKey;
    }

    public void setIssueIdOrKey (String issueIdOrKey)
    {
        this.issueIdOrKey = issueIdOrKey;
    }

    public String[] getUnlistedItemRequests ()
    {
        return unlistedItemRequests;
    }

    public void setUnlistedItemRequests (String[] unlistedItemRequests)
    {
        this.unlistedItemRequests = unlistedItemRequests;
    }

    public Department getDepartment ()
    {
        return department;
    }

    public void setDepartment (Department department)
    {
        this.department = department;
    }

    public Item[] getItems ()
    {
        return items;
    }

    public void setItems (Item[] items)
    {
        this.items = items;
    }

    public String getStatus ()
    {
        return status;
    }

    public void setStatus (String status)
    {
        this.status = status;
    }

    @Override
    public String toString()
    {
        return "CheckoutProperties [issueIdOrKey = "+issueIdOrKey+", unlistedItemRequests = "+unlistedItemRequests+
                ", department = "+department+", items = "+items+", status = "+status+"]";
    }
}
