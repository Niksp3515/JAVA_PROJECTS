package com.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ComperatorDemo implements Comparator<Emp>{

	@Override
	public int compare(Emp e1, Emp e2) {
		int value = 0;
		if (e1.getSalary() > e2.getSalary()) {
			value = 1;
		}
		else if (e1.getSalary() == e2.getSalary()) {
			value = 0;
		}
		else if (e1.getSalary() < e2.getSalary()) {
			value = -1;
		}
		return value;
	}
	
	public static void main(String[] args) {
		ArrayList<Emp> arr = new ArrayList<Emp>();
		Emp e1= new Emp();
		e1.setEid(1);
		e1.setEname("Nikhil");
		e1.setSalary(15000);
		
		Emp e2 =new Emp();
		e2.setEid(2);
		e2.setEname("Pranj");
		e2.setSalary(1000);
		arr.add(e1);  
		arr.add(e2);
		
		Collections.sort(arr,new ComperatorDemo());
		
		for (Emp emp : arr) {
			System.out.println("Employee Id : "+emp.getEid()+"\nName : "+emp.getEname()+"\nSalary : "+emp.getSalary());
		}
	}

}
