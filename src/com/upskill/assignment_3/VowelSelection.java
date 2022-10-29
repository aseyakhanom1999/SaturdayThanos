package com.upskill.assignment_3;

import java.util.Scanner;

//6.    Write a java program which will count the number of vowels, consonants, digits, 
//tabs and blank spaces from a string “A quick brown fox jumps over the lazy dog”.


public class VowelSelection {

	public static void main(String[] args) {
		
		int count = 0;
		int consonants = 0;
		int digits =0;
		int space= 0;
		int tabs =0;
		int uppercase =0;
		
		System.out.println("Enter a sentance: ");
		Scanner ss = new Scanner(System.in);
		String sentance = ss.nextLine();
		
		for(int i= 0; i<sentance.length();i++)
		{
			char ch= sentance.charAt(i);
			if (ch == 'a'|| ch == 'e'|| ch == 'i'||ch=='o'||ch=='u')
			{
				count ++;
			
			}
			else if  (ch >='a' && ch <='z')
			{

				consonants++;
			}
			else if  (ch >= '0' && ch <= '9')
			{

				digits++;
			}
			else if  (ch ==' ')
			{

				space++;
			}
			else if  (ch =='	')
			{

				tabs++;
			}
			else if  (ch >='A' && ch<= 'Z')
			{

			uppercase++;
			}
			
			
		}
		System.out.println("Number of vowel is given: "+count);
		System.out.println("Number of consonants is given: "+consonants);
		System.out.println("Number of digits is given: "+digits);
		System.out.println("Number of space is given: "+space);
		System.out.println("Number of tabs is given: "+tabs);
		System.out.println("Number of uppercase is given: "+uppercase);



		
		
		

	}

}
