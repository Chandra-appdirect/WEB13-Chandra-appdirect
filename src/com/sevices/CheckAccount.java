package com.sevices;
import com.dao.*;
import com.Exceptions.*;
public class CheckAccount 
{
public CheckAccount()
{}
public boolean checkForCreation(String id)
{
	AccountDAOImpl a=new AccountDAOImpl();
	if((a.getAccountFromTable(id))==null)
	{
		return true;
	}
	else
	{
		return false;
	}
}
public boolean check(String id)
{
	AccountDAOImpl a=new AccountDAOImpl();
	if((a.getAccountFromTable(id))==null)
	{
		new AccountNotFoundException("Account Not Found--Create one to proceed");
	}
	return true;
}
}
