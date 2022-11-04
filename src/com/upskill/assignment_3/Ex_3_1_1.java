package com.upskill.assignment_3;

import java.util.Scanner;

public class Ex_3_1_1 {
	
	static String account_name;
	static int initial_amount = 190;
	static int depo;
	static int with;
	Scanner s1 = new Scanner(System.in);

	
	
	Ex_3_1_1(String acc_name)
	{
		account_name = acc_name;
		
		System.out.println(" your account name : "+account_name);
		
		
	}
	
	public static void deposite()
	{
		depo = initial_amount+ depo;
		System.out.println(" after deposite your balance: "+depo);
	}
	
	public static void withdral()
	{
		with = initial_amount - depo;
		System.out.println(" after withdral your balance: "+with);

		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s1 = new Scanner(System.in);
		System.out.println("ENter your deposite amount: ");
		depo = s1.nextInt();
		System.out.println("ENter your account name: ");
		account_name = s1.next();


		
		
		
		Ex_3_1_1 obj = new Ex_3_1_1(account_name);
		deposite();
		withdral();
		
		
		
		

	}

}
