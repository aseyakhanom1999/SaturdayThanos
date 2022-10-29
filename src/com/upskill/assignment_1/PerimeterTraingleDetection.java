package com.upskill.assignment_1;

//A triangle three arms are: 5, 7 and 11 inches. Write a method to display the perimeter of triangle in console output.

public class PerimeterTraingleDetection {
	
	static int a = 5;
	static int b = 7;
	static int c = 11;
	static int p = a + b+ c;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*int a = 5;
		int b = 7;
		int c = 11;
		int p = a + b+ c; */
		 Perimeter();
		
	}
	
	public static void Perimeter()
	{
		 System.out.println("Perimeter of Triangle: " +p);
	}

}
