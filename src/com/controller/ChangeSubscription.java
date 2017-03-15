package com.controller;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.URL;

import org.codehaus.*;
import org.codehaus.jackson.map.ObjectMapper;

import com.dao.OrderDAOImpl;
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
public class ChangeSubscription extends HttpServlet
{
	private static final long serialVersionUID = 1L;
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException
     {
    ObjectMapper mapper=new ObjectMapper();
	response.setContentType("application/json");
	String eventUrl2=request.getParameter("eventUrl");
	System.out.println(eventUrl2);
	PrintWriter out=response.getWriter();
	URL url2=new URL(eventUrl2);
	Mapper m=new Mapper();
	CheckAccount c=new CheckAccount();
	if(c.check(m.accountmap(url2).getAccountIdentifier()))
	{
	Response r=new Response("true",null,"Subscription changed successfully");
	response.getWriter().write((mapper.writerWithDefaultPrettyPrinter().writeValueAsString(r)));
	OrderDAOImpl u=new OrderDAOImpl();
	u.updateOrder(m.ordermap(url2),m.accountmap(url2));
    }
	else
	{
		Response p=new Response("false","ACCOUNT_NOT_FOUND");
		response.getWriter().write((mapper.writerWithDefaultPrettyPrinter().writeValueAsString(p)));
	}
}
}
