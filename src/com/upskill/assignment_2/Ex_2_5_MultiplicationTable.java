package com.upskill.assignment_2;


//5.  Write a program in Java to display the multiplication table of (eight)8.


public class Ex_2_5_MultiplicationTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		tableOfEight();

	}
	public static void tableOfEight()
	{
		int i;
		
		for(i = 1 ; i<= 10; i++)
		{
			int j= i*8;
			System.out.print(" " +j);
		}
	}

}
