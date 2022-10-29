package com.upskill.assignment_2;
// 9. Write a program to swap two string variables (Talen, Tech) and display result on the 
//screen. 


public class Ex_2_9_DisplayString {
	
	String t1 = "Talen";
	String t2 = "Tech";
	
	public Ex_2_9_DisplayString(String t4,String t5)
	{
		t1 = t4;
		t2 = t5;
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub;
		Ex_2_9_DisplayString obj = new Ex_2_9_DisplayString("Tech", "Talen");
		System.out.println("Swap of first value: " +obj.t1);
		System.out.println("Swap of second value: " +obj.t2);
		
		
	

	}
	

}
