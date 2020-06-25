package com.mumosystems.tag.model;

public class Address
{
    private String country;

    private String headquarters;

    private String address;

    private String phoneNumber;

    private String address2;

    private String city;

    private String postalCode;

    private String shipToEmail;

    private String id;

    private String state;

    private String email;

    public String getCountry ()
    {
        return country;
    }

    public void setCountry (String country)
    {
        this.country = country;
    }

    public String getHeadquarters ()
    {
        return headquarters;
    }

    public void setHeadquarters (String headquarters)
    {
        this.headquarters = headquarters;
    }

    public String getAddress ()
    {
        return address;
    }

    public void setAddress (String address)
    {
        this.address = address;
    }

    public String getPhoneNumber ()
    {
        return phoneNumber;
    }

    public void setPhoneNumber (String phoneNumber)
    {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress2 ()
    {
        return address2;
    }

    public void setAddress2 (String address2)
    {
        this.address2 = address2;
    }

    public String getCity ()
    {
        return city;
    }

    public void setCity (String city)
    {
        this.city = city;
    }

    public String getPostalCode ()
    {
        return postalCode;
    }

    public void setPostalCode (String postalCode)
    {
        this.postalCode = postalCode;
    }

    public String getShipToEmail ()
    {
        return shipToEmail;
    }

    public void setShipToEmail (String shipToEmail)
    {
        this.shipToEmail = shipToEmail;
    }

    public String getId ()
    {
        return id;
    }

    public void setId (String id)
    {
        this.id = id;
    }

    public String getState ()
    {
        return state;
    }

    public void setState (String state)
    {
        this.state = state;
    }

    public String getEmail ()
    {
        return email;
    }

    public void setEmail (String email)
    {
        this.email = email;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [country = "+country+", headquarters = "+headquarters+", address = "+address+
                ", phoneNumber = "+phoneNumber+", address2 = "+address2+", city = "+city+", postalCode = "+postalCode+
                ", shipToEmail = "+shipToEmail+", id = "+id+", state = "+state+", email = "+email+"]";
    }
}
