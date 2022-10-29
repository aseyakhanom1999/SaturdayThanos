package com.upskill.java_5;

public class Encapsulation {
	
	
	private String name= "Ava";				//Write & Read
	private int ssn = 12343434;			//Write only
	private String username = "Aseya_ava";  	//Read
	

	
	//Setter method- name
	public void setName(String value)   		//set the data-write
	{
		name = value;
	}
	//Getter method- name
	public String getName()						//get the data - read
	{
		return name;
	}
	
	public void setSsn(int digit)   		//set the data-write
	{
		ssn = digit;
	}
	
	//Setter method- username
		public void setUserName(String value)   		//set the data-write
		{
			username = value;
		}
		
		/*public int  getSsn()						//get the data - read
		{
			return ssn;
		}
		
		*/
		
		//Getter method- name
		public String getUserName()						//get the data - read
		{
			return username;
		}
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	Encapsulation obj = new Encapsulation();
	obj.setName("Anika");
	System.out.println(obj.getName());
	obj.setSsn(123);
	//System.out.println(obj.getSsn());
	System.out.println(obj.getUserName());


		

	}

}
