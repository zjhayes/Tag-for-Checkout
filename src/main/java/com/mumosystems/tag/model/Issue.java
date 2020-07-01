package com.mumosystems.tag.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.mumosystems.tag.services.FieldJsonDeserializer;
import org.json.simple.JSONObject;

import java.util.Map;

@JsonIgnoreProperties({"expand"})
public class Issue
{
    private String self;
    private String id;
    private String key;
    private CheckoutProperties checkout;
    //@JsonDeserialize(using = FieldJsonDeserializer.class)
    private Map<String, Object> fields;

    public String getSelf()
    {
        return self;
    }

    public void setSelf(String self)
    {
        this.self = self;
    }

    public String getId()
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

    public void setFields(Map<String, Object> fields)
    {
        this.fields = fields;
    }

    public Map<String, Object> getFields()
    {
        return fields;
    }

    public CheckoutProperties getCheckout()
    {
        return checkout;
    }

    public void setCheckout(CheckoutProperties checkout)
    {
        this.checkout = checkout;
    }

    @Override
    public String toString()
    {
        return "Issue [id = "+id+", key = "+key+"]";
    }
}
