package com.mumosystems.tag.model;

public class User
{
    private String accountId;

    private String emailAddress;

    private String displayName;

    private String self;

    private String active;

    private String timeZone;


    public String getAccountId ()
    {
        return accountId;
    }

    public void setAccountId (String accountId)
    {
        this.accountId = accountId;
    }

    public String getEmailAddress ()
    {
        return emailAddress;
    }

    public void setEmailAddress (String emailAddress)
    {
        this.emailAddress = emailAddress;
    }

    public String getDisplayName ()
    {
        return displayName;
    }

    public void setDisplayName (String displayName)
    {
        this.displayName = displayName;
    }

    public String getSelf ()
    {
        return self;
    }

    public void setSelf (String self)
    {
        this.self = self;
    }

    public String getActive ()
    {
        return active;
    }

    public void setActive (String active)
    {
        this.active = active;
    }

    public String getTimeZone ()
    {
        return timeZone;
    }

    public void setTimeZone (String timeZone)
    {
        this.timeZone = timeZone;
    }


    @Override
    public String toString()
    {
        return "ClassPojo [accountId = "+accountId+", emailAddress = "+emailAddress+", displayName = "+displayName+
                ", self = "+self+", active = "+active+", timeZone = "+timeZone+"]";
    }
}
