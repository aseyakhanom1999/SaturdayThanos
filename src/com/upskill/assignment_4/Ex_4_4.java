package com.upskill.assignment_4;

import java.util.Scanner;

//Write a method to check leap year?


public class Ex_4_4 {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		leapyear();

	}
	public static void leapyear()
	{
		int a =2013;
	
		if((a % 4 == 0) && (a %100 == 0) && (a%400 == 0))
		{
			System.out.println("the year is leap year");
			
		}
		else if ((a % 4 == 0) && (a %100 == 0) && (a%400 != 0))
		{
			System.out.println("the year is not leap year");
			
		}
		
		else if ((a % 4 == 0) && (a %100 != 0))
		{
			System.out.println("the year is leap year");
			
		}
		
		else if  (a % 4 != 0)
		{
			System.out.println("the year is not leap year");
			
		}
		System.out.println("The year is "+a);

		
	}


}
