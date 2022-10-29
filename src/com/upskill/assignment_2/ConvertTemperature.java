package com.upskill.assignment_2;

//10. Write a Java program to convert temperature from Fahrenheit to Celsius degree. 





public class ConvertTemperature {
	
	float c;
	//int c = ((f - 32)*(5/9));
	
	 public ConvertTemperature(float f)
	 { 
	   c = (float)((f - 32)*0.5667);
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConvertTemperature obj = new ConvertTemperature(30);
		System.out.println("The answer is : " + obj.c);

	}
	

}
