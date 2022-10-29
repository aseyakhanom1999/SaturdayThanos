package com.upskill.assignment_3;

//Write two java functions which will return two different integer values, write a 
//program to compare those numbers and send message that one number is bigger 
//than other. (hints: using if..else)


public class Ex_3 {
	
	static int a1;
	static int b1;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//value_1();
		//value_2();
		if( a1> b1)
		{
			System.out.println(" value_2 is bigger");
		}
		else 
		{
			System.out.println("value_1 is smaller");
		}

	}
	public static int value_1(int a1)
	{
		return 10;
	}
	public static int value_2(int b1)
	{
		return 15;
	}

}
