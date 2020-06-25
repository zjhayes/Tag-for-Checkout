package com.mumosystems.tag.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties({"self", "fields", "expand"})
public class Issue
{
    private String id;
    private String key;

    public String getId ()
    {
        return id;
    }

    public void setId (String id)
    {
        this.id = id;
    }

    public String getKey ()
    {
        return key;
    }

    public void setKey (String key)
    {
        this.key = key;
    }

    @Override
    public String toString()
    {
        return "Issue [id = "+id+", key = "+key+"]";
    }
}
