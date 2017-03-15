package com.util;
import java.util.UUID;
public class RandomAccountidGenerator 
{
public RandomAccountidGenerator()
{}
public String generate()
{
	String acId = UUID.randomUUID().toString();
	return acId;
}
}
