package com.controller;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.URL;

import org.codehaus.*;
import org.codehaus.jackson.map.ObjectMapper;

import com.dao.AccountDAOImpl;
import com.model.Response;
import com.sevices.CheckAccount;
import com.util.Mapper;
import com.util.URLSigner;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@SuppressWarnings("unused")
//@WebServlet("/CreateSubscription")
public class CancelSubscription extends HttpServlet
{
	private static final long serialVersionUID = 1L;
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException
     {
    ObjectMapper mapper = new ObjectMapper();
	response.setContentType("application/json");
	String eventUrl3=request.getParameter("eventUrl");
	System.out.println(eventUrl3);
	 PrintWriter out=response.getWriter();
	URL url3=new URL(eventUrl3);
    Mapper m=new Mapper();
    CheckAccount c=new CheckAccount();
    if(c.check(m.accountmap(url3).getAccountIdentifier()))
    {
	Response r=new Response("true",null,"Account Successfully deleted");
	response.getWriter().write((mapper.writerWithDefaultPrettyPrinter().writeValueAsString(r)));
	AccountDAOImpl a=new AccountDAOImpl();
	a.deleteAccount(m.accountmap(url3).getAccountIdentifier());
	}
    else
    {
    	Response p=new Response("false","USER_NOT_FOUND");
    	response.getWriter().write((mapper.writerWithDefaultPrettyPrinter().writeValueAsString(p)));
    }
    
}
}

