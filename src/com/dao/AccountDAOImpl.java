package com.dao;
import com.Exceptions.*;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.model.Account;

public class AccountDAOImpl implements AccountsDAO
{
	public AccountDAOImpl()
	{}
	private Account extractAccountFromResultSet(ResultSet rs) throws SQLException 
	{
	    Account a = new Account();
	    a.setAccountIdentifier( rs.getString("ACCOUNTIDENTIFIER") );
	    a.setParentaccountIdentifier( rs.getString("PARENTACCOUNTIDENTIFIER") );
	    a.setStatus( rs.getString("STATUS") );
	    return a;
	}

	@Override
	public Account getAccountFromTable(String Accountidentifier) throws DAOException 
	{
		Connection connection = DBConnection.getConnection();
	    try 
	    {
	        Statement stmt = connection.createStatement();
	        ResultSet rs = stmt.executeQuery("SELECT * FROM ACCOUNT  WHERE ACCOUNTIDENTIFIER=" + Accountidentifier);
	        if(rs.next())
	        {
	            return extractAccountFromResultSet(rs);
	        }
	    } 
	    catch (SQLException ex) 
	    {
	        ex.printStackTrace();
	    }
	    return null;
		
		
	}

	@Override
	public boolean insertAccount(Account a) 
	{
		Connection connection = DBConnection.getConnection();
	    try 
	    {
	        PreparedStatement ps = connection.prepareStatement("INSERT INTO  ACCOUNT(ACCOUNTIDENTIFIER,PARENTACCOUNTIDENTIFIER,STATUS) values (?, ?, ?)");
	        ps.setString(1, a.getAccountIdentifier());
	        ps.setString(2, a.getParentaccountIdentifier());
	        ps.setString(3, a.getStatus());
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
	public boolean updateAccount(Account a) 
	{
		Connection connection = DBConnection.getConnection();
	    try {
	        PreparedStatement ps = connection.prepareStatement("");
	        ps.setString(1, a.getAccountIdentifier());
	        ps.setString(2, a.getParentaccountIdentifier());
	        ps.setString(3, a.getStatus());
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
	public boolean deleteAccount(String Accountidentifier) 
	{
		Connection connection = DBConnection.getConnection();
	    try {
	        Statement stmt = connection.createStatement();
	        int i = stmt.executeUpdate("DELETE FROM ACCOUNT WHERE ACCOUNTIDENTIFIER=" + Accountidentifier);
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



