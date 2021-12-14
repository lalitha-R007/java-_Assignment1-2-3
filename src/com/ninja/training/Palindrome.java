package com.ninja.training;

import java.util.Scanner;

public class Palindrome {
	 static boolean Palindrome(String str) {
		int i =0;
		int j = str.length()-1;
		//while (i < j){
		if (str.charAt(i)!= str.charAt(j)){
			i++;
			j--;
			return false;}
		else {
			return true;
		}
		
	}
	
	public static void main(String[] args) {
		String str=null;
		System.out.println("Enter your word here : ");
		Scanner input = new Scanner(System.in);
		str= input.next();
		
		if (Palindrome(str)) {
		System.out.println("This is a Palindrome.");}
		else
			System.out.println("This is not a Palindrome.");
		
	
 
	}}


