package com.ninja.training;

public class Constructor_Box {
	private int length;
	private int width;
	private int height;
	
	public void  setValues() {
	}
	 Constructor_Box(){
		 length= 0; 
		 width = 0;
		 height= 0;
		
	}
	 Constructor_Box(int a){
		  length = a;
		 width = a;
		  height = a;
	}
	 Constructor_Box(int a, int b, int c){
	     length =a ;
	     width =b;
		 height=c;
	}
	
	public  void Volume() {
		double V = length * width * height;
		System.out.println("Box volume is: "+ V);
	}
	
}
