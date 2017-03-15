package com.controller;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.URL;

import org.codehaus.*;
import org.codehaus.jackson.map.ObjectMapper;

import com.model.Response;
import com.util.URLSigner;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@SuppressWarnings("unused")
//@WebServlet("/CreateSubscription")
public class StatusSubscription extends HttpServlet
{
	private static final long serialVersionUID = 1L;
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException
     {
    ObjectMapper mapper = new ObjectMapper();
	response.setContentType("application/json");
	String eventUrl4=request.getParameter("eventUrl");
	System.out.println(eventUrl4);
	 PrintWriter out=response.getWriter();
	URLSigner u=new URLSigner("demoapp-154115","zwJsy3oZ05Vy");
	URL url4=new URL(eventUrl4);
	u.signURL(url4); 
	Response r=new Response("true","abc123");
	out.println(mapper.writerWithDefaultPrettyPrinter().writeValueAsString(r));
	
	
	 }
    
}


