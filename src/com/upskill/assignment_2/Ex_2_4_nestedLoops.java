package com.upskill.assignment_2;

public class Ex_2_4_nestedLoops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DoubleIncrease();

	}
	
	public static void DoubleIncrease()
	{
		int a;
		int b;
		for(a= 1;a <=500; a++)
		{
			for(b=1; b<= 500; b++)
			{
				System.out.print( a*2 + " ");
			}
			System.out.println(" ");
		}
	}

}
