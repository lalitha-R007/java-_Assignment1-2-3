package com.ninja.training;

public class Addition {
	
	public static int add(int n1, int n2) {
		int sum = n1 + n2;
		return sum;
	}
	public static int add(int n1, int n2, int n3) {
		int sum = n1 + n2 + n3;
		return sum;
	}
	public static double add(double a, double b) {
		double c = a + b;
		return c;
		
	}

	public static void main(String[] args) {
		int num1 =30; int num2 = 40; int num5 =50;
		double num3 = 1.2; double num4 = 3.4;
		int s = add(num1, num2);
		int s2 = add(num1,num2,num5);
		double s1 = add(num3, num4);
		System.out.println(num1 + " + " + num2 + " = " +s);
		System.out.println( num3 + " + " +  num4 + " = " + s1);
		System.out.println(num1 + " + " + num2 +" + "+ num5 + " = " +s);}
	

	//+ operator used to concatinate strings
	//println method always called strings

}
