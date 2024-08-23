package com.file;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Student implements Serializable{//Interface that has not abstract methods is called marked interface
	
	int rn;
	String name;
	Double per;
	public Student(int rn, String name, Double per) {
		this.rn = rn;
		this.name = name;
		this.per = per;
	}
	
		public String toString() {
			return "Roll No : "+rn+"\nName : "+name+"\nPrecentage : "+per;
		}
	
	
}
public class SerializationDemo {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Student s = new Student(18, "Nikhil Prajapati", 90.87);
		FileOutputStream fos = new FileOutputStream("new");
		
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(s);
		oos.flush();
		oos.close();
		
		System.out.println("Object is written Successfully");
		
		FileInputStream fis = new FileInputStream("new");
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		Student s2 = (Student) ois.readObject();
		System.out.println(s2);
		fis.close();
	}
}
