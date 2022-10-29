package com.upskill.assignment_2;


/* You are given two integer number (a=25, b=30), write a program to swap them and 
display result on the screen. */
public class Ex_2_7_Swap {
	
	int a= 25;
	int b= 30;
	
	public Ex_2_7_Swap(int i,int j)
	{
	 a = i;
		b = j;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ex_2_7_Swap obj = new Ex_2_7_Swap(30,25);
		System.out.println("Swap value of a: "+ obj.a);
		System.out.println("Swap value of b: " +obj.b);
		
				
		
	}
		
	

}
