package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import com.model.Company;

public class CompanyDAOImpl implements CompanyDAO {

	@Override
	public boolean insertCompany(Company a) 
	{
		// TODO Auto-generated method stub
		Connection connection = DBConnection.getConnection();
	    try 
	    {
	        PreparedStatement ps = connection.prepareStatement("INSERT INTO  COMPANY(NAME,COMPANYID,WEBSITE,COUNTRY,PHONENUMBER) values (?, ?, ?,?,?)");
	        ps.setString(1, a.getName());
	        ps.setString(2, a.getUuid());
	        ps.setString(3, a.getWebsite());
	        ps.setString(4, a.getCountry());
	        ps.setString(3, a.getPhoneNumber());
	        int i = ps.executeUpdate();
	      if(i == 1) 
	      {
	        return true;
	      }
	    } 
	    catch (SQLException ex) 
	    {
	        ex.printStackTrace();
	    }
	    return false;
		
	}

	@Override
	public boolean updateCompany(Company a) 
	{
		Connection connection = DBConnection.getConnection();
	    try {
	        PreparedStatement ps = connection.prepareStatement("");
	        ps.setString(1, a.getName());
	        ps.setString(2, a.getUuid());
	        ps.setString(3, a.getWebsite());
	        ps.setString(4, a.getCountry());
	        ps.setString(5, a.getPhoneNumber());
	        
	        
	        int i = ps.executeUpdate();
	      if(i == 1) 
	      {
	    return true;
	      }
	    } catch (SQLException ex) 
	    {
	        ex.printStackTrace();
	    }
	    return false;
	
	}

	@Override
	public boolean deleteCompany(String id) 
	{
		Connection connection = DBConnection.getConnection();
	    try {
	        Statement stmt = connection.createStatement();
	        int i = stmt.executeUpdate("DELETE FROM COMPANY WHERE COMPANYID=" +id);
	      if(i == 1) 
	      {
	    return true;
	      }
	    } 
	    catch (SQLException ex) 
	    {
	        ex.printStackTrace();
	    }
	    return false;
	    }
		
	}


