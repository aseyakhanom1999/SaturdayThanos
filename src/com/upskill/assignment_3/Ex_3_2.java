package com.upskill.assignment_3;


//2.Write a java program which will display 5 employee information(name, age, salary and address).


public class Ex_3_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String [] name = new String[] {"Ava", "Rupa","Farjana", "fahim","anis"};
		int [] age = new int [] {21,22,23,24,25};
		float[] salary = new float[] {(float)1000.9,(float)2000.3,(float)3000.5,(float) 4000.3,(float)6000.54 };
		String [] address = new String[] { "Bronx", "Queens","Bangladesh","Dhaka","Saidpur"};
		
		
		System.out.println(" employees name: "+name[2]);
		System.out.println(" employees age: "+ age[2]);
		System.out.println(" employees salary: "+salary[2]);
		System.out.println(" employees salary: "+address[2]);


	}

}
