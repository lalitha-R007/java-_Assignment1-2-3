package com.ninja.training;

import java.util.Scanner;

public class Even_Odd {
	
	
	public static void main(String[] args) {
		int num;
		System.out.println("Enter number here: ");
		Scanner input = new Scanner(System.in);
		num = input.nextInt();
		if(num%2 == 0) {
			System.out.println("True" + num + " is the Even Number!");
		}
		else {
			System.out.println("False" + num+ " is Odd number!!!");
		}
		
}
	}
