package com.dao;

import com.model.Account;
import com.model.Order;

public interface OrdersDAO 
{
	boolean insertOrder(Order o);
	public boolean updateOrder(Order o,Account a) ;
}
