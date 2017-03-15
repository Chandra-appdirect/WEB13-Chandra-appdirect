package com.model;

import java.util.List;


public class Order
{
    private String pricingDuration;
    private String addonOfferingCode;

    private List<Items> items;

    private String editionCode;
    private List<String> customAttributes;
    public Order()
    {}

    public Order(String pricingDuration, String addonofferingcode, List<Items> items, String editionCode,
    		List<String> customAttributes) {
		this.pricingDuration = pricingDuration;
		this.addonOfferingCode = addonofferingcode;
		this.items = items;
		this.editionCode = editionCode;
		this.customAttributes = customAttributes;
	}
	
	public String getPricingDuration ()
    {
        return pricingDuration;
    }

    public void setPricingDuration (String pricingDuration)
    {
        this.pricingDuration = pricingDuration;
    }

    public List<Items> getItems ()
    {
        return items;
    }

    public void setItems (List<Items> items)
    {
        this.items = items;
    }

    public String getEditionCode ()
    {
        return editionCode;
    }

    public void setEditionCode (String editionCode)
    {
        this.editionCode = editionCode;
    }

	public String getAddonofferingcode() {
		return addonOfferingCode;
	}

	public void setAddonofferingcode(String addonofferingcode) {
		this.addonOfferingCode = addonofferingcode;
	}

	public List<String> getCustomattributes() {
		return customAttributes;
	}

	public void setCustomattributes(List<String> customattributes) {
		this.customAttributes = customattributes;
	}

   
}
