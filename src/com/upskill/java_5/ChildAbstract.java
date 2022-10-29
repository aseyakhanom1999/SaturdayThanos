package com.upskill.java_5;

public class ChildAbstract extends AbstractClass {

	@Override
	public void iDoor() {
		// TODO Auto-generated method stub
		int door = 2;
		System.out.println("Door is :" +door);
	}

	@Override
	public void iSeat() {
		// TODO Auto-generated method stub
		int seat = 5;
		System.out.println("Seat is :" +seat);
	}

	@Override
	public void iWheel() {
		// TODO Auto-generated method stub
		int wheel = 4;
		System.out.println("wheel is :" +wheel);
	}

	@Override
	public void iRadio() {
		// TODO Auto-generated method stub
		int radio = 1;
		System.out.println("radio is :" +radio);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChildAbstract obj = new ChildAbstract();
		obj.iDoor();
		obj.iWheel();
		obj.iSeat();
		obj.iRadio();
		
		

	}

}
