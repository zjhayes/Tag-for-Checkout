package com.mumosystems.tag.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

@JsonIgnoreProperties
public class Item
{
    private String itemId;

    private String quantity;

    private String itemTitle;

    private String price;

    private String vendorId;

    private String itemDescription;

    private String type;

    private List<String> items;

    private String backFill;

    private String status;

    public String getItemId()
    {
        return itemId;
    }

    public void setItemId(String itemId)
    {
        this.itemId = itemId;
    }

    public String getQuantity()
    {
        return quantity;
    }

    public void setQuantity(String quantity)
    {
        this.quantity = quantity;
    }

    public String getItemTitle()
    {
        return itemTitle;
    }

    public void setItemTitle(String itemTitle)
    {
        this.itemTitle = itemTitle;
    }

    public String getPrice()
    {
        return price;
    }

    public void setPrice(String price)
    {
        this.price = price;
    }

    public String getVendorId()
    {
        return vendorId;
    }

    public void setVendorId(String vendorId)
    {
        this.vendorId = vendorId;
    }

    public String getItemDescription()
    {
        return itemDescription;
    }

    public void setItemDescription(String itemDescription)
    {
        this.itemDescription = itemDescription;
    }

    public String getType()
    {
        return type;
    }

    public void setType (String type)
    {
        this.type = type;
    }

    public List<String> getItems()
    {
        return items;
    }

    public void setItems( List<String> items)
    {
        this.items = items;
    }

    public String getBackFill()
    {
        return backFill;
    }

    public void setBackFill(String backFill)
    {
        this.backFill = backFill;
    }

    public String getStatus()
    {
        return status;
    }

    public void setStatus(String status)
    {
        this.status = status;
    }

    public String getSKU()
    {
        //TODO Change to SKU
        return itemDescription;
    }

    @Override
    public String toString()
    {
        return "Item [itemId = "+itemId+", quantity = "+quantity+", itemTitle = "+itemTitle+
                ", price = "+price+", vendorId = "+vendorId+", itemDescription = "+itemDescription+
                ", type = "+type+", items = "+items+", backFill = "+backFill+", status = "+status+"]";
    }
}
