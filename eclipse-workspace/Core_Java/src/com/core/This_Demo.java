package com.core;

class Student{
	int rno;
	String name;
	
	public Student() {
		System.out.println("Default Constructor");
	}
	
	public Student(int rno,String name) {
		this();//this will call default constructor
		System.out.println("Para Constructor");
		this.rno = rno;
		this.name = name;

	}
	
	void Show(Student s) {
		System.out.println("Roll no : "+s.rno);
		System.out.println("Name : "+s.name);
	}
	
	void Display() {
//		Show(this);.
	
	}
}
public class This_Demo {
	
public static void main(String[] args) {
	Student s =new Student(1,"Nikhil");
	s.Display();
	}
}
