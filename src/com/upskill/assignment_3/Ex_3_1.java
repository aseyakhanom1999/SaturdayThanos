package com.upskill.assignment_3;

import java.util.Scanner;

/* Write a class name BankAccount which has savings and checking class. 
 * BankAccount class that has a name and an initial amount, which are both set in the constructor. Also, it lets users make deposits.
 *  Note that the account name must be set when an account is created. 
 *  Demonstrates the account class hierarchy with output of:
 	a.     account name: savings

	b.    initial amount: 10000

	c.     new amount after deposit: 15000

	d.    account name: checking

	e.    initial amount: 20000

	f.      new amount after deposit: 26000

	g.     new amount after withdrawal: 23000 */





public class Ex_3_1 {
	
	static String account_name;
	static int amount;
	int amount1;
	Scanner s1 = new Scanner(System.in);
	
	
	Ex_3_1(String account_name)
	{
		//this.account_name = account_name;
		System.out.println("Enter your account name : "+account_name);
		System.out.println("Enter your initial ammount for this account named " +account_name);
		System.out.println("Enter your initial amount: "+amount);

		
	}
	
	//System.out.println("Enter your initial amount: "+this.amount);
	public static void deposite(int amount)
	{
		int amount1 = amount + amount ;
		System.out.println("new amount after deposite: "+amount1);
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//TRT
		Ex_3_1 obj = new Ex_3_1(account_name);
		obj.
		deposite(10);

	}

}
