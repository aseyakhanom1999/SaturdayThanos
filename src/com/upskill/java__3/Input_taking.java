package com.upskill.java__3;

import java.util.Scanner;

// Taking input......
public class Input_taking {
	static int age = 45;
	static String name;


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		
		
		System.out.println(" Enter your age: " );
		age = s.nextInt();
		
		System.out.println(" Enter your name: " );
		name = s.next();
		
		
		System.out.println("Your age is: " +age);
		System.out.println("Your name is: " +name);

	}
	
	

}
