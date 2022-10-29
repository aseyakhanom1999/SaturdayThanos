package com.upskill.assignment_1;

// A function which returns the multiply value of a and b where a = 9 and b = 11. 
//Write a program which will display addition of a +b + function returns value.


public class FunctionReturnValues {
	
	static int a = 9;
	static int b = 11;
	

	public static void main(String[] args) {
		
	
		// TODO Auto-generated method stub
		System.out.println(a + b + newFunction(9,11));

	}
	public static int newFunction(int a, int b)
	{
		return a * b;
	}

}
