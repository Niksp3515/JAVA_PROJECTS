package com.module_2;

class Shape{
	void print() {
		System.out.println("This is Shape method.");
	}
}

class Rect extends Shape{
	void print() {
		super.print();
		System.out.println("This is Rectangle method.");
	}
}

class circle extends Shape{
	void print() {
		super.print();
		System.out.println("This is Circle method.");
	}
}

	class square1 extends Rect{
		void print() {
			super.print();
			System.out.println("This is Square method.");
		}
	}

	public class ShapeInherited{
			public static void main(String[] args) {
				square1 sq =new square1();
				sq.print();
			}
	}