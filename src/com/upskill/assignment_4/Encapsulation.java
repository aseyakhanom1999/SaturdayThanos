package com.upskill.assignment_4;


//Write a user program using encapsulation that contains the username, password, email,
//first and last names of a user of our application. Display the user information in 
//console output?



public class Encapsulation {
	
	private String first_name = "Aseya";
	private String last_name = "Khanom";
	private String user_name = "Aseyakhanom123";
	private String password ="ava123";
	private String email ="aseyakhanom99@gmail.com";
	
	public void setFirstName(String name)
	{
		first_name =name;
	}
	
	public void setLastName(String name2)
	{
		last_name =name2;
	}
	public void setUserName(String username2)
	{
		user_name =username2;
	}
	public void setPasswprd(String password2)
	{
			password=password2;
	}
	public void setEmail(String email2)
	{
		email =email2;
	}
	
	public String getFirstName()						
	{
		return first_name;
	}
	public String getLastName()						
	{
		return last_name;
	}
	public String getUserName()						
	{
		return user_name;
	}
	public String getpassword()						
	{
		return password;
	}
	public String getEmail()						
	{
		return email;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Encapsulation obj = new Encapsulation();
		obj.setFirstName("Anika");
		obj.setLastName("Tabassum");
		obj.setUserName("anika_tabassum_nova123");
		obj.setPasswprd("anika123456");
		obj.setEmail("anika123@gmail.com");
		System.out.println(obj.getFirstName());
		System.out.println(obj.getLastName());
		System.out.println(obj.getUserName());
		System.out.println(obj.getpassword());
		System.out.println(obj.getEmail());


	}

}
