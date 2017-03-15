package com.controller;
import com.dao.*;
import com.model.Account;
import com.model.Response;
import com.sevices.CheckAccount;
import com.util.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.URL;

import org.codehaus.*;
import org.codehaus.jackson.map.ObjectMapper;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@SuppressWarnings("unused")
public class CreateSubscription extends HttpServlet
{
	private static final long serialVersionUID = 1L;
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException
     {
    ObjectMapper mapper = new ObjectMapper();
	response.setContentType("application/json");
	String eventUrl=request.getParameter("eventUrl");
	System.out.println(eventUrl);
    PrintWriter out=response.getWriter(); 
	URL url=new URL(eventUrl);
	Mapper m=new Mapper();
	CheckAccount c=new CheckAccount();
	if(c.checkForCreation(m.accountmap(url).getAccountIdentifier()))
    {
	RandomAccountidGenerator rand=new RandomAccountidGenerator();
	Response r=new Response("true",rand.generate());
	response.getWriter().write(mapper.writerWithDefaultPrettyPrinter().writeValueAsString(r));
	AccountDAOImpl a=new AccountDAOImpl();
	CreatorDAOImpl s=new CreatorDAOImpl();
	CompanyDAOImpl p=new CompanyDAOImpl();
	OrderDAOImpl o=new OrderDAOImpl();
	a.insertAccount(m.accountmap(url));
	s.insertCreator(m.creatormap(url));
	p.insertCompany(m.companymap(url));
	o.insertOrder(m.ordermap(url));
	}
	else
	{
		Response e=new Response("false","USER_ALREADY_EXISTS","user is registered");
		response.getWriter().write(mapper.writerWithDefaultPrettyPrinter().writeValueAsString(e));
		
	}
}
}
