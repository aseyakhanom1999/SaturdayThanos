package com.upskill.java__3;

import java.util.Scanner;

//input without constructor
public class InputWithoutConstructor {
	
	static int a;
	static int b ;
	//static int sum = a+b;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		
		
		System.out.println("Enter num for a: ");
		a = s.nextInt();
		
		System.out.println("Enter num for b: ");
		b = s.nextInt();
		int sum = a+b;
		
		System.out.println("The Sum is: "+ sum);

	}

}
//new addition is comming...........
