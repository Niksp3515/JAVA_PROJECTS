package com.module_2;

public class Area_Rec_Square {

	public static void Area(double breadth,double lenght) {
		System.out.println("Area of Rectangle is : "+breadth*lenght);
	}
	
	public static void Area(double lenght) {
		System.out.println("Area of Square is : "+lenght*lenght);
	}
	public static void main(String[] args) {
		Area(5);
		Area(20, 30);
	}
}
