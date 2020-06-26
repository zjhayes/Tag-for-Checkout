package com.mumosystems.tag.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties({"self", "fields", "expand"})
public class Issue
{
    private String id;
    private String key;
    private CheckoutProperties checkout;

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
