package com.ninja.training;

public class Polymorphism {
	
	public static int area(int a, int b) {
		int A =  a* b;
		return A;}
	public static double area (int r) {
		double B = 3.14*r*r;
		return B;
	}

	public static void main(String[] args) {
		int num1 = 5; int num2 = 4; int num3 = 8;
		int A1 = area(num1,num2);
		System.out.println("Area of rectangle is : "+ A1);
		double A2 = area(num3);
		System.out.println("Area of circle is : "+ A2);

	}

}
