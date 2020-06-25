package com.mumosystems.tag.model;

public class CheckoutProperties
{
    private String total;

    private Address address;

    private String hasDebit;

    private String issueIdOrKey;

    private String[] unlistedItemRequests;

    private Department department;

    private Item[] items;

    private User user;

    private String status;

    public String getTotal ()
    {
        return total;
    }

    public void setTotal (String total)
    {
        this.total = total;
    }

    public Address getAddress ()
    {
        return address;
    }

    public void setAddress (Address address)
    {
        this.address = address;
    }

    public String getHasDebit ()
    {
        return hasDebit;
    }

    public void setHasDebit (String hasDebit)
    {
        this.hasDebit = hasDebit;
    }

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

    public User getUser ()
    {
        return user;
    }

    public void setUser (User user)
    {
        this.user = user;
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
        return "ClassPojo [total = "+total+", address = "+address+", hasDebit = "+hasDebit+
                ", issueIdOrKey = "+issueIdOrKey+", unlistedItemRequests = "+unlistedItemRequests+
                ", department = "+department+", items = "+items+", user = "+user+", status = "+status+"]";
    }
}
