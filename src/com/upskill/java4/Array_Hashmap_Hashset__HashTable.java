package com.upskill.java4;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;

public class Array_Hashmap_Hashset__HashTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int age = 23;
		int[] agethanos = new int[] {22,23,24,25,26,27,28};    //array
		
		//array index 		         [0] [1] [2] [3] [4] [5] [6] 	
		
		System.out.println("students age: " +agethanos[5]);
		System.out.println("total student age: " +agethanos.length);
		
		 int [][] agethanos2D = {{30,31,32,33,34,35},    //[0][0] [0][1] [0][2] [0][2] [0][3] [0][4]
		 						{25,26,27,28,29}};   // [1][0] [1][1] [1][2] [1][3]
		 
			System.out.println("students 2D age: " +agethanos2D[1][2]);
			
			// Hashmap store multiple data using key value pair, iplementation of map interface.
			
			HashMap<String, Integer> Student = new HashMap<String,Integer>();
			
			Student.put("Ava", 23);
			
			
		 System.out.println("Student age: " +Student.get("Ava"));
		 
		 
		 //Hashset
		 HashSet<String> car = new HashSet<String>();
		 car.add("BMW");
		 car.add("Audi");
		 car.add("Ford");
		 System.out.println("Car: " +car);
		 
		 
		 //HashTable
		  Hashtable<String,String> Region = new Hashtable<String, String>();
		  Region.put("BD", "Asia");
		  Region.put("India","Asia");
		  System.out.println(" Region: "+Region.get("India"));
		 
		 

	}

}
