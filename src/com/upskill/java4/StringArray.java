package com.upskill.java4;

import java.util.HashMap;
import java.util.HashSet;

public class StringArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name = "Ava";
		String Capital = "Dhaka";
		String[] namethanos = new String [] {"Rupa", "Farjana","Rasel"};
		
		System.out.println("the third name: "+ namethanos[2]);
		System.out.println(" the total name: " +namethanos.length);
		//System.out.println(" the total name: " +String[] namethanos);
		
		//array with multi-dimentional
		
		HashMap<String , String> CC = new HashMap<String, String>();
		CC.put("Bangladesh", "Dhaka");
		System.out.println("Capital: "+CC.get("Bangladesh"));
		
		
		HashSet<Integer> age = new HashSet<Integer>();
		
		age.add(23);
		age.add(31);
		
		System.out.println("age: " +age);
		
		

	}

}
