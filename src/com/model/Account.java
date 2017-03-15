package com.model;


public class Account 
{
private String accountIdentifier;
private String parentAccountIdentifier;
private String status;
public Account()
{}
public Account(String accountIdentifier, String parentaccountIdentifier, String status) 
{
	this.accountIdentifier = accountIdentifier;
	this.parentAccountIdentifier = parentaccountIdentifier;
	this.status = status;
}

public String getAccountIdentifier() {
	return accountIdentifier;
}
public void setAccountIdentifier(String accountIdentifier) {
	this.accountIdentifier = accountIdentifier;
}

public String getParentaccountIdentifier() {
	return parentAccountIdentifier;
}
public void setParentaccountIdentifier(String parentaccountIdentifier) {
	this.parentAccountIdentifier = parentaccountIdentifier;
}

public String getStatus() {
	return status;
}
public void setStatus(String status) {
	this.status = status;
}


}
