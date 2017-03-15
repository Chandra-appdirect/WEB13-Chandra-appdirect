package com.model;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;


@JsonIgnoreProperties(ignoreUnknown = true)
public class POJOBean
{
	public POJOBean(){
		//System.out.println("default");
	}
    public POJOBean(String returnUrl, String applicationUuid, String flag, PayLoad payload, String[] links,
			Marketplace marketplace, String type, Creator creator) 
    {
		this.returnUrl = returnUrl;
		this.applicationUuid = applicationUuid;
		this.flag = flag;
		this.payload = payload;
		this.links = links;
		this.marketplace = marketplace;
		this.type = type;
		this.creator = creator;
	}
   	private String returnUrl;

    private String applicationUuid;

    private String flag;
 
    private PayLoad payload;

    private String[] links;
  
    private Marketplace marketplace;

    private String type;
  
    private Creator creator;

    public String getReturnUrl ()
    {
        return this.returnUrl;
    }

    public void setReturnUrl (String returnUrl)
    {
        this.returnUrl = returnUrl;
    }

    public String getApplicationUuid ()
    {
        return this.applicationUuid;
    }

    public void setApplicationUuid (String applicationUuid)
    {
        this.applicationUuid = applicationUuid;
    }
   
    public String getFlag ()
    {
        return this.flag;
    }

    public void setFlag (String flag)
    {
        this.flag = flag;
    }

    public PayLoad getPayload ()
    {
        return this.payload;
    }

    public void setPayload (PayLoad payload)
    {
        this.payload = payload;
    }

    public String[] getLinks ()
    {
        return this.links;
    }

    public void setLinks (String[] links)
    {
        this.links = links;
    }

    public Marketplace getMarketplace ()
    {
        return this.marketplace;
    }

    public void setMarketplace (Marketplace marketplace)
    {
        this.marketplace = marketplace;
    }

    public String getType ()
    {
        return this.type;
    }

    public void setType (String type)
    {
        this.type = type;
    }

    public Creator getCreator ()
    {
        return this.creator;
    }

    public void setCreator (Creator creator)
    {
        this.creator = creator;
    }
    

}