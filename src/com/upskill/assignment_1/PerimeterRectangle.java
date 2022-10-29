package com.upskill.assignment_1;

//A rectangle width and length are: 9 and 13 inches. Write a method to display the perimeter of rectangle in console output.


public class PerimeterRectangle {
	
	static int width = 9;
	static int length = 13;
	static int perimeter = 2 *(width + length);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		perimeterRectangle();

	}
	
	
	public static void perimeterRectangle()
	{
		System.out.println("The perimeter is : " + perimeter);
		
		
	}

}
