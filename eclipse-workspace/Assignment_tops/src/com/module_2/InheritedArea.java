package com.module_2;

class Rectangle{
	double lenght,breadth;
	
	public Rectangle(double lenght,double breadth) {
	this.lenght = lenght;
	this.breadth = breadth;
	}
	
	void Perimeter() {
		System.out.println("Perimeter will be : "+2*(breadth+lenght));
	}
	
	void Area() {
		System.out.println("Area of Rectangle is : "+lenght*breadth);
	}
}

class Square extends Rectangle{
	
	public Square(double lenght) {
		super(lenght, lenght);
	}
}

public class InheritedArea {
	public static void main(String[] args) {
		Square sq = new Square(25);
		sq.Area();
		
		
	}
}
