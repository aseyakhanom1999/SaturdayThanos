package com.upskill.java4;

import com.upskill.java_2.MethodType;

public class Polymorphism extends MethodType{
	
	private String a;
	public Polymorphism()
	{
		int a = 2;
		int b = 3;
	}
	 public Polymorphism(int c, int d)
	 {
		 int c1= 4;
		 int d1 = 1;
		
		 
	 }
	
	
	
	
	

	public static void main(String[] args) {
	
		// TODO Auto-generated method stub
		car("red");
		WeeklyIncomeVoid();
		Polymorphism obj = new Polymorphism();
		System.out.println("value is : "+obj.a);
		//System.out.println("value is : "+obj.);

		

	}
	
	
	
	//method overloading(compiletime polymorphism)-static binding:
	//same name with diff signeture
	
	public static void WeeklyIncomeVoid()
	{
		int calculateweeklyIncome = hourlyIncome * 40+ 1333;
		System.out.println("my weekly income :" + calculateweeklyIncome);
	}
	
	
	
	public static void car()
	{
		System.out.println("my care is BMW...");
	}
	public static void car(int door)
	{
		door = 2;
		System.out.println("my care is BMW has:..."+door);
	}
	public static void car(int door,int seat)
	{
		seat = 4;
		door = 2;
		System.out.println("my care is BMW..."+ seat );
		System.out.println("my care is BMW..."+ door );
	}
	public static void car(String color)
	{
		color= "red";
		System.out.println("my care is BMW and its color is: "+color);
	}
	
	

}
