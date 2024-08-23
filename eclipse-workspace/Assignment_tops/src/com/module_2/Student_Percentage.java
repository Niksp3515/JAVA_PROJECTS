package com.module_2;

abstract class Marks{
abstract double get_per();
}


class C extends Marks{
	double sub1,sub2,sub3;

	public C(double sub1, double sub2, double sub3) {
		this.sub1 = sub1;
		this.sub2 = sub2;
		this.sub3 = sub3;
	}
	double get_per() {
		return ((sub1+sub2+sub3)*100)/300;
	}
	
}

class D extends Marks{
	double sub1,sub2,sub3,sub4;

	public D(double sub1, double sub2, double sub3, double sub4) {
		this.sub1 = sub1;
		this.sub2 = sub2;
		this.sub3 = sub3;
		this.sub4 = sub4;
	}
	double get_per() {
		return ((sub1+sub2+sub3+sub4)*100)/400;
	}
}

public class Student_Percentage {

	public static void main(String[] args) {
		C c1= new C(50, 60, 100);
		System.out.println("C's Percentage is : "+c1.get_per()+"%");
		D d1 = new D(80, 90, 100, 100);
		System.out.println("D's Percentage is : "+d1.get_per()+"%");
	}
}
