package com.model;

public class Response
{
	private String success;
	private String AccountIdentifier;
	private String userIdentifier;
	private String errorCode;
	private String message;
	public Response(String success, String accountIdentifier) 
			
	{
		this.success = success;
		this.AccountIdentifier = accountIdentifier;
	}
	public Response(String success,String errorCode,String message)
	{
		this.success = success;
		this.errorCode = errorCode;
		this.message = message;
	}
	public String getSuccess() {
		return success;
	}
	public void setSuccess(String success) {
		this.success = success;
	}
	public String getAccountIdentifier() 
	{
		return AccountIdentifier;
	}
	public void setAccountIdentifier(String accountIdentifier) {
		AccountIdentifier = accountIdentifier;
	}
	public String getUserIdentifier() {
		return userIdentifier;
	}
	public void setUserIdentifier(String userIdentifier) {
		this.userIdentifier = userIdentifier;
	}
	public String getErrorCode() {
		return errorCode;
	}
	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
	
	

}
