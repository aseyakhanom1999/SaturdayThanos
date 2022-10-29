package com.upskill.java_6;

public class UserDefineException extends Exception{
	String a;

	public UserDefineException(String b)
	{
		a=b;
		
	}
	public String demo()
	{
		return a;
	}

}
