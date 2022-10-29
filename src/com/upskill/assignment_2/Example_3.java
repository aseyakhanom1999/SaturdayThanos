package com.upskill.assignment_2;

//Write two java functions which will return two different integer values, write a 
//program to compare those numbers and send message that one number is bigger 
//than other. (hints: using if..else)


public class Example_3 {
	
	static int a1 = 15;
	static int b1 = 20;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//value_1(8);
		//value_2(5);
		compareNew();
	
	}
	
	 public static void compareNew ()
	 {
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
			return a1;
		}
		public static int value_2(int b1)
		{
			return b1;
		}
	 }

