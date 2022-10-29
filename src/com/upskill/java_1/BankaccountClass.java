package com.upskill.java_1;

import java.util.Scanner;

/* Write a class name BankAccount which has savings and checking class. 
 * BankAccount class that has a name and an initial amount, which are both set in the constructor. 
 * Also, it lets users make deposits.
 *  Note that the account name must be set when an account is created. 
 *  Demonstrates the account class hierarchy with output of:
 	a.     account name: savings

	b.    initial amount: 10000

	c.     new amount after deposit: 15000

	d.    account name: checking

	e.    initial amount: 20000

	f.      new amount after deposit: 26000

	g.     new amount after withdrawal: 23000 */

public class BankaccountClass extends SavingaccountInheritance {
	static float initial_amount;
	
	public BankaccountClass(String saving, int j)
	{
		String account_type = saving;
		int initial_amount1 = j;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sr = new Scanner(System.in);
		System.out.println(" Enter your deposite amount: ");
		initial_amount = sr.nextFloat();
		
		BankaccountClass obj = new BankaccountClass("Saving",1000);
		float initial_amount1 = 100000;
		System.out.println("After deposite your amount is : "+(initial_amount1 +initial_amount));
		//System.out.println("Account type: "+obj.account_type);
		nameAccount();
		CheeckingAccount();

	}
	public static void nameAccount()
	{
		String account__name = "saving";
		float initialValue = (float )100000.90;
		System.out.println("account_type: "+account__name);
		System.out.println("initial value is : "+initialValue);
	}
	public static void CheeckingAccount()
	{
		String account___name = "Checking";
		float initialValue2 = (float )20000.90;
		System.out.println("account_type: "+account___name);
		System.out.println("initial value is : "+initialValue2);
	}

}
