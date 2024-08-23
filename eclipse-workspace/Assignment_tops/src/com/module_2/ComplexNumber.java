package com.module_2;

public class ComplexNumber {
		int real,image;
	public ComplexNumber(int real , int image) {
		this.real = real;
		this.image = image;
	}
	
	public void Show() {
		System.out.println(this.real+"+ i"+this.image);
	}
	
	public  ComplexNumber add(ComplexNumber c2) {
		return new ComplexNumber(this.real+c2.real,this.image+c2.image);
	}
	
	public  ComplexNumber sub(ComplexNumber c2) {
		return new ComplexNumber(this.real-c2.real,this.image-c2.image);
	}
	
	public  ComplexNumber mul(ComplexNumber c2) {
		return new ComplexNumber(this.real*c2.real,this.image*c2.image);
	}
	
	public static void main(String[] args) {
		ComplexNumber n1 = new ComplexNumber(10, 20);
		
		ComplexNumber n2 = new ComplexNumber(4, 5);	
		
		ComplexNumber res1 = n1.add(n2);
		res1.Show();
		
		ComplexNumber res2 = n1.sub(n2);
		res2.Show();
		
		ComplexNumber res3 = n1.mul(n2);
		res3.Show();
		
	}
}
