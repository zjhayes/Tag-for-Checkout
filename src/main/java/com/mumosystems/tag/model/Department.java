package com.mumosystems.tag.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties
public class Department
{
    private String accountId;

    private String code;

    private String contactEmail;

    private String name;

    private String id;

    private String userKey;

    private String budget;

    public String getAccountId ()
    {
        return accountId;
    }

    public void setAccountId (String accountId)
    {
        this.accountId = accountId;
    }

    public String getCode ()
    {
        return code;
    }

    public void setCode (String code)
    {
        this.code = code;
    }

    public String getContactEmail ()
    {
        return contactEmail;
    }

    public void setContactEmail (String contactEmail)
    {
        this.contactEmail = contactEmail;
    }

    public String getName ()
    {
        return name;
    }

    public void setName (String name)
    {
        this.name = name;
    }

    public String getId ()
    {
        return id;
    }

    public void setId (String id)
    {
        this.id = id;
    }

    public String getUserKey ()
    {
        return userKey;
    }

    public void setUserKey (String userKey)
    {
        this.userKey = userKey;
    }

    public String getBudget ()
    {
        return budget;
    }

    public void setBudget (String budget)
    {
        this.budget = budget;
    }

    @Override
    public String toString()
    {
        return "Department [accountId = "+accountId+", code = "+code+", contactEmail = "+contactEmail+
                ", name = "+name+", id = "+id+", userKey = "+userKey+", budget = "+budget+"]";
    }
}
