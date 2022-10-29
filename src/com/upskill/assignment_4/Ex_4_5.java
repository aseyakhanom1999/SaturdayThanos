package com.upskill.assignment_4;

import java.util.Arrays;

public class Ex_4_5 {

	public static void main(String[] args) {
		
		char string1 [] = ("ava").toCharArray();
		char string2 [] = ("ava").toCharArray();

		if (anagram(string1, string2))
            System.out.println("The two strings are anagram of each other");
        else
            System.out.println("The two strings are not anagram of each other");
	}
	
	static boolean anagram (char [] string1, char [] string2){
		
		int n1 = string1.length;
		int n2 = string2.length;
		
		if ( n1 != n2)
			return false;
		
		Arrays.sort(string1);
		Arrays.sort(string2);
		
		for ( int i =0; i < n1; i ++)
			if (string1 [i] != string2 [i])
				return false;
		
		return true;
				
	}

}