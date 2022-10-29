package com.upskill.java__3;

public class Constractor {

	String admin;
	int adAge;
	
	public Constractor(String name, int age)
	{
		admin = name;
		adAge= age; 
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Constractor obj = new Constractor ("Ava", 23);
		System.out.println(obj.adAge);
		System.out.println(obj.admin);
		

	}

}
