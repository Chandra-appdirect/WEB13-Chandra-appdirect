package com.util;

import java.io.IOException;
import java.net.URL;

import org.codehaus.jackson.JsonNode;
import org.codehaus.jackson.JsonProcessingException;
import org.codehaus.jackson.map.DeserializationConfig;
import org.codehaus.jackson.map.ObjectMapper;

import com.model.Account;
import com.model.Company;
import com.model.Creator;
import com.model.Order;

public class Mapper 
{
	public Mapper()
	{
		
	}
	ObjectMapper mapper = new ObjectMapper()
			  .configure(DeserializationConfig.Feature.FAIL_ON_UNKNOWN_PROPERTIES, false);
	@SuppressWarnings("unused")
	public Account accountmap(URL urlString) throws JsonProcessingException, IOException
	{
		URLSigner u=new URLSigner("demoapp-154115","zwJsy3oZ05Vy");
		JsonNode root = mapper.readTree(u.signURL(urlString));
	    JsonNode n1=root.get("creator");
	    JsonNode n2 = root.get("payload");
	    JsonNode n2a= n2.get("company");
	    JsonNode n2b= n2.get("account");
	    JsonNode n2c= n2.get("order");
	    Account a=mapper.treeToValue(n2b,Account.class);
	    return a;
	}
	@SuppressWarnings("unused")
	public Company companymap(URL urlString) throws JsonProcessingException, IOException
	{
		URLSigner u=new URLSigner("demoapp-154115","zwJsy3oZ05Vy");
		JsonNode root = mapper.readTree(u.signURL(urlString));
	    JsonNode n1=root.get("creator");
	    JsonNode n2 = root.get("payload");
	    JsonNode n2a= n2.get("company");
	    JsonNode n2b= n2.get("account");
	    JsonNode n2c= n2.get("order");
	    Company c=mapper.treeToValue(n2a,Company.class);
	    return c;
	}
	@SuppressWarnings("unused")
	public Creator creatormap(URL urlString) throws JsonProcessingException, IOException
	{
		URLSigner u=new URLSigner("demoapp-154115","zwJsy3oZ05Vy");
		JsonNode root = mapper.readTree(u.signURL(urlString));
	    JsonNode n1=root.get("creator");
	    JsonNode n2 = root.get("payload");
	    JsonNode n2a= n2.get("company");
	    JsonNode n2b= n2.get("account");
	    JsonNode n2c= n2.get("order");
	    Creator cr=mapper.treeToValue(n1,Creator.class);
	    return cr;
	}
	@SuppressWarnings("unused")
	public Order ordermap(URL urlString) throws JsonProcessingException, IOException
	{
		URLSigner u=new URLSigner("demoapp-154115","zwJsy3oZ05Vy");
		JsonNode root = mapper.readTree(u.signURL(urlString));
	    JsonNode n1=root.get("creator");
	    JsonNode n2 = root.get("payload");
	    JsonNode n2a= n2.get("company");
	    JsonNode n2b= n2.get("account");
	    JsonNode n2c= n2.get("order");
	    Order o=mapper.treeToValue(n1,Order.class);
	    return o;
	}
	

}
