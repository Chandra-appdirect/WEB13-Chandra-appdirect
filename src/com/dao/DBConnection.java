package com.dao;
import java.sql.Connection; 
import java.sql.DriverManager; 

public class DBConnection 
{ 
static DBConnection connection; 
private DBConnection()
{ 
try
{ 
Class.forName("com.mysql.jdbc.Driver"); 
}
catch(Exception e)
{
} 
} 
public static Connection getConnection()
{ 
if(connection == null)
{ 
connection=new DBConnection(); 
} 

try
{ 
Connection con=DriverManager.getConnection("remove this line and enter your db credentials"); 
return con; 
}
catch(Exception e)
{
} 
return null; 
} 
}