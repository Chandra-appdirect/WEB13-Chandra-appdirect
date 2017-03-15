package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.model.Creator;

public class CreatorDAOImpl implements CreatorDAO
{
	public boolean insertCreator(Creator c) 
	{
		Connection connection = DBConnection.getConnection();
	    try 
	    {
	        PreparedStatement ps = connection.prepareStatement("INSERT INTO  Creator(firstname,lastname,email,openid) values (?, ?, ?,?)");
	        ps.setString(1, c.getFirstName());
	        ps.setString(2, c.getLastName());
	        ps.setString(3, c.getEmail());
	        ps.setString(4, c.getOpenId());
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
	public boolean updateCreator(Creator c) 
	{
		Connection connection = DBConnection.getConnection();
	    try {
	        PreparedStatement ps = connection.prepareStatement("update creator ");
	        ps.setString(1, c.getFirstName());
	        ps.setString(2, c.getLastName());
	        ps.setString(3, c.getEmail());
	        ps.setString(4, c.getOpenId());
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
}
