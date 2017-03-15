package com.model;
public class User 
{
    private String email;
    private String firstName;
    private String lastName;
    private String language;
    private String locale;
    private String openId;
    private String uuid;
    private String [] attributes;
    private Address address;
    

    

	public Address getAddress() 
	{
		return address;
	}


	public void setAddress(Address address) 
	{
		this.address = address;
	}


	public User(String email, String firstName, String lastName, String language, String locale, String openId,
			String uuid, String[] attributes, Address address) {
		this.email = email;
		this.firstName = firstName;
		this.lastName = lastName;
		this.language = language;
		this.locale = locale;
		this.openId = openId;
		this.uuid = uuid;
		this.attributes = attributes;
		this.address = address;
	}


	public User(){

    }

	public String getEmail() 
	{
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getFirstname() {
		return firstName;
	}


	public void setFirstname(String firstname) {
		this.firstName = firstname;
	}


	public String getLastname() {
		return lastName;
	}


	public void setLastname(String lastname) {
		this.lastName = lastname;
	}


	public String getLanguage() {
		return language;
	}


	public void setLanguage(String language) {
		this.language = language;
	}


	public String getLocale() {
		return locale;
	}


	public void setLocale(String locale) {
		this.locale = locale;
	}

	public String getOpenid() {
		return openId;
	}


	public void setOpenid(String openid) {
		this.openId = openid;
	}

	
	public String getUuid() {
		return uuid;
	}


	public void setUuid(String uuid) {
		this.uuid = uuid;
	}


	public String[] getAttributes() {
		return attributes;
	}


	public void setAttributes(String[] attributes) 
	{
		this.attributes = attributes;
	}
}
	

    