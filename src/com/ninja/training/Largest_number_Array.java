package com.ninja.training;


import java.util.Arrays;

public class Largest_number_Array {
	public static int getLargest(int[] a, int total){  
		Arrays.sort(a);  
		return a[total-1];  
		} 
	
	

	public static void main(String[] args) {
		
		int a[] = {10,20,60,100};
		System.out.println("Largest number: "+ getLargest(a,4));
		

	}

}
