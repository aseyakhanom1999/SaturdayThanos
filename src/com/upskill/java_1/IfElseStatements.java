package com.upskill.java_1;

public class IfElseStatements {

	public static void main(String[] args) {
		int age = 13;
		if (age < 7)
		{
			System.out.println(" you are baby");
		}
		else if (age < 12)
		{
			 if (age > 8  && age < 12)
			{
				System.out.println(" you are growing up");
			}
			 
			 else 
			 {
				 System.out.println("not defined");
			 }
			//System.out.println(" you are teenager");
		}
		//nested if else:
		
		
		/*
		
		else if (age >= 18 && age < 25)
		{
			System.out.println(" you are adult");
		}
		else if(age == 30 || age ==35)
		{
			System.out.println(" either 30 or 35");
		}
		else 
		{
			System.out.println(" same as previous");
		} */

	}

}
