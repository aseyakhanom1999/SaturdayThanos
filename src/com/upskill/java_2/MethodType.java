package com.upskill.java_2;

public class MethodType {
	
	public static int hourlyIncome = 34;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodType obj = new MethodType();
		obj.annualIncomeVoid();
		System.out.println("my monthly income : " +obj.monthlyIncomeReturn());
		WeeklyIncomeVoid();


	}
	
	//void method
	public void annualIncomeVoid()
	{
		int calculateAnnualIncome = hourlyIncome *2000;
		System.out.println("my annual income  : " +calculateAnnualIncome);
	}
	
	//Return type method 
	public int monthlyIncomeReturn()
	{
		int calculateMonthlyIncome = hourlyIncome *180;
		return calculateMonthlyIncome;
	}
	
	//Static void method
	public static void WeeklyIncomeVoid()
	{
		int calculateweeklyIncome = hourlyIncome * 40;
		System.out.println("my weekly income :" + calculateweeklyIncome);
	}
	
	

}
