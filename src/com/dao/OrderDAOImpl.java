package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.model.Account;
import com.model.Order;

public class OrderDAOImpl implements OrdersDAO
{

	@Override
	public boolean insertOrder(Order o) 
	{
		Connection connection = DBConnection.getConnection();
	    try 
	    {
	        PreparedStatement ps = connection.prepareStatement("INSERT INTO  ORDER(EDITIONCODE,ADDONOFFERINGCODE,PRICINGDURATION) values (?, ?, ?)");
	        ps.setString(1, o.getEditionCode());
	        ps.setString(2, o.getAddonofferingcode());
	        ps.setString(4, o.getPricingDuration());
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
	public boolean updateOrder(Order o,Account a) 
	{
		Connection connection = DBConnection.getConnection();
	    try {
	        PreparedStatement ps = connection.prepareStatement("update Orders set editioncode=?,pricingduration=? where accountidentifier=?");
	        ps.setString(1, o.getEditionCode());
	        ps.setString(2, o.getPricingDuration());
	        ps.setString(3, a.getAccountIdentifier());
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
	
