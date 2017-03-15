package com.util;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.*;

import org.codehaus.jackson.map.DeserializationConfig;
import org.codehaus.jackson.map.ObjectMapper;

import oauth.signpost.OAuthConsumer;
import oauth.signpost.basic.DefaultOAuthConsumer;
import oauth.signpost.exception.OAuthException;
import oauth.signpost.signature.QueryStringSigningStrategy;


public class URLSigner 
{
	private final OAuthConsumer consumer;
	ObjectMapper mapper = new ObjectMapper()
			  .configure(DeserializationConfig.Feature.FAIL_ON_UNKNOWN_PROPERTIES, false);
	

	public URLSigner(String consumerKey, String consumerSecret) 
	{
		this.consumer = new DefaultOAuthConsumer(consumerKey, consumerSecret);
		this.consumer.setTokenWithSecret(consumerKey,consumerSecret);
		this.consumer.setSigningStrategy(new QueryStringSigningStrategy());
	}
	
	public String signURL(URL urlString) throws IOException 
	{
		 String line="";
		 String str="";
		
		try 
		{
			    
			HttpURLConnection request=(HttpURLConnection)urlString.openConnection();
			request.setRequestProperty("Accept","application/json");
			if (request.getResponseCode() == HttpURLConnection.HTTP_OK) 
			{
				System.out.println("got connection!!");
			}
			 consumer.sign(request);
			 System.out.println("request Signed");
			 request.connect();
			 BufferedReader br=new BufferedReader(new InputStreamReader(request.getInputStream()));
			 System.out.println(request.getResponseMessage());;
			 while((line=br.readLine())!=null)
			 {
				 str=str+line;
			 }
		}
			 catch (OAuthException e)
				{
					System.out.println(e.getStackTrace());
					
				}
		
		return str;
	}
}
	
		
		

