package com.upskill.java_2;

public class IfElseStatement {
	static int age = 107; 
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		age();

		
		
	}
	//if else sttement
	public static void age(){
		if (age < 13){
			System.out.println("You are children");
		} else if (age > 13 && age < 18){
			System.out.println("You are Teenager");
		} else if (age >=60){	
			//Nested If Else Statement
			if (age > 100){
				System.out.println("You are Hero");
			} else {
				System.out.println("You are Senior");
			}
		} else {
			System.out.println("You are adult");
		}
	}
}