package com.ninja.training;

public class Home_mainClass {

	public static void main(String[] args) {
		
		Homeclass_objects Home = new Homeclass_objects();
		
		Home.setName("Bungla");
		Home.setArea(50.20);
		Home.setFloors(2);
		Home.setRooms(10);
		
		System.out.println("Home Details");
		System.out.println("Home Name: " + Home.getName());
		System.out.println("Area of the Home is: " + Home.getArea());
		System.out.println("No of rooms in the home are : " + Home.getRooms());
		System.out.println("No of floors in the home are :" + Home.getFloors());
		System.out.println("-----------------------------------------------");
		
Homeclass_objects Home1 = new Homeclass_objects();
		
		Home1.setName("Barn");
		Home1.setArea(33.66);
		Home1.setFloors(3);
		Home1.setRooms(15);
		
		System.out.println("Home Details");
		System.out.println("Home Name: " + Home1.getName());
		System.out.println("Area of the Home is: " + Home1.getArea());
		System.out.println("No of rooms in the home are : " + Home1.getRooms());
		System.out.println("No of floors in the home are :" + Home1.getFloors());
		System.out.println("-----------------------------------------------");
		
		Home.CleanUp();
		Home1.PainIt();
		

}

	

}
