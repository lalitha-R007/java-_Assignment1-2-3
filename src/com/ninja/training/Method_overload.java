package com.ninja.training;

public class Method_overload {
	public static boolean Parameters(int a, int b) {
		if (  a == b){
		return true;}
		else
			return false;
	}
	public static boolean Parameters(String m, String n) {
		if ( m == n) {
		return true;}
		else {
			return false;}
	}
	

	public static void main(String[] args) {
		int num1 = 20;
		int num2 = 20;
		String str1 = "abc";
		String str2 = "mno";
		boolean s = Parameters(num1,num2);
		System.out.println("If both parameters are integers : "+ s );
		boolean r = Parameters(str1,str2);
		System.out.println("If both parameters are Strings: "+ r );
		
	}

}
