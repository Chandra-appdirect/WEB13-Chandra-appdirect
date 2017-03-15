package com.dao;
import com.Exceptions.*;

import com.model.Account;

public interface AccountsDAO 
{
	Account getAccountFromTable(String Accountidentifier) throws DAOException;
	boolean insertAccount(Account a);
	boolean updateAccount(Account a);
	boolean deleteAccount(String Accountidentifier);
}
