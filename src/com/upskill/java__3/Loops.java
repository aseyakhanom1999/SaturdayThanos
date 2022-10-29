package com.upskill.java__3;

public class Loops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//System.out.println(1);

		//practiceForLoop();
		practiceWhileLoops();
		//practiceNestedForLoops();

	}
	
	public static void practiceForLoop()		//For loop: do again and again upto upper limit
	{
		int i;									// Initialize the variable
		for (i = 100; i>= 1; i--)				//setting lower limit, upper limit, increment or decrement
		{
			System.out.println("For Loops number = " + i);				//statement

		}
	}
	
	public static void practiceWhileLoops()
	{
		int i = 1; 						//initializing variable
		while(i<=10)					//setting condition
		{
			System.out.println("while Loops number = " + i);		//statement;
			i++;						// increment
		}
	}
	
	public static void practiceDoWhileLoop()
	{
		int i = 1;
		do
		{
			System.out.println("Do while loops numbers = " +i);
			i++;
		}
		while(i<=100);
			
	}
	
	public static void practiceInfiniteLoop()
	{
		int i;
		for(i= 1;   ;i++)
		{
			System.out.println("for loops no: " +i);
		}
		
	}
	
	public static void practiceNestedForLoops()
	{
		int i;			
		int j;									// Initialize the variable
		for (i = 1; i<= 10; i++)				//setting lower limit, upper limit, increment or decrement
		{
			for(j=1; j<= 10; j++)
			{
				int multi = i * j;
				
				System.out.print(multi + " ");
				
			}
			
			System.out.println(" ");				//statement

		}
	}
	

}
