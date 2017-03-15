package com.Exceptions;

public class AccountNotFoundException extends Exception
{
       @SuppressWarnings("unused")
	private String s1;
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public AccountNotFoundException(String s)
	{
		this.s1=s;
	}
	 

}
