package com.upskill.assignment_2;



//4.  Write a for loop upto 500 which will increase the value double every time.



public class Practice2_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IncreaseDouble();

	}
	
	public static void IncreaseDouble()
	{
		int i;
		for (i = 1; i<= 500; i++)
		{
			//System.out.println(" ");
			int doubleTable = i*2;

			System.out.print( doubleTable +  " ");
		}
		System.out.println(" ");


	}
	
	
	

}
