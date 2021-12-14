package com.ninja.training;

public class Constructor_BoxDemo {

	public static void main(String[] args) {
		
		Constructor_Box box = new Constructor_Box();
		Constructor_Box box1 = new Constructor_Box(20);
		Constructor_Box box2 = new Constructor_Box(20,30,40);
		box.Volume();
		box1.Volume();
		box2.Volume();

	}

}
