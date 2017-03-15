package com.model;


public class Company
{
    private String phoneNumber;

    private String website;

    private String email;

    private String name;

    private String uuid;

    private String externalId;
    private String Country;
    
public Company()
{}

    public String getPhoneNumber ()
    {
        return phoneNumber;
    }

    public void setPhoneNumber (String phoneNumber)
    {
        this.phoneNumber = phoneNumber;
    }

    public String getWebsite ()
    {
        return website;
    }

    public void setWebsite (String website)
    {
        this.website = website;
    }

    public String getEmail ()
    {
        return email;
    }

    public void setEmail (String email)
    {
        this.email = email;
    }
   
    public String getName ()
    {
        return name;
    }
    public void setName (String name)
    {
        this.name = name;
    }
public Company(String phoneNumber, String website, String email, String name, String uuid, String externalId,String Country) {
	super();
	this.phoneNumber = phoneNumber;
	this.website = website;
	this.email = email;
	this.name = name;
	this.uuid = uuid;
	this.externalId = externalId;
	this.Country=Country;
}



    public String getUuid ()
    {
        return uuid;
    }

    public void setUuid (String uuid)
    {
        this.uuid = uuid;
    }

    public String getExternalId ()
    {
        return externalId;
    }

    public void setExternalId (String externalId)
    {
        this.externalId = externalId;
    }
	public String getCountry() {
		return Country;
	}
	public void setCountry(String country) {
		Country = country;
	}

}