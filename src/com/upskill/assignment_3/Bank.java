package com.upskill.assignment_3;


//Bank is a class that provides functionality to get interest rate. 
//Display different interest rate using rate functionality for Chase, 
//City and TD banks followed by 8%, 7% and 9%. Hints: using method override.
public class Bank extends Ex_3_3  {

	public static void main(String[] args) {
		
		chaseBankInterestRate("Chase Bank",(float)0.8);
		chaseBankInterestRate(" Bank TD",(float)0.7);
		chaseBankInterestRate("City Bank",(float) 0.9);

	}
	public static void chaseBankInterestRate(String bankname1, float interest_rate)
	{
		String bankname;
		float interest_rate1;
		int time = 2;
		float principle = 2000;
		System.out.println("For chase bank: "+(interest_rate*time*principle));
	
	}
	

}
