package com.upskill.java_6;

public class SingleTone {
	
	private SingleTone()
	{
		
	}
	

	private static SingleTone SingletoObj = new SingleTone();
	public static SingleTone getInstance()
	{
		return SingletoObj;
		
	}
	protected static void demo()
	{
		System.out.println("Demo method for singletone class");
	}

}
