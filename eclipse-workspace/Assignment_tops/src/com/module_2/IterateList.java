package com.module_2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class IterateList {

	public static void main(String[] args) {
		ArrayList arr = new ArrayList();
		arr.add("Nikhil");
		arr.add("Prajapati");
		arr.add(21);
		arr.add(56.23);
		arr.add(0, "Hello");
		
		
		System.out.println("Specific Index Lettter is : "+arr.get(0));
		
		//update element 
		arr.set(0, "How Are You?");
		
		//remove third element
		
		arr.remove(3);
		
		//search an element
		
		System.out.println("Nikhil name is contain list or not : "+arr.contains("Nikhil"));
		
		//sort arraylist
		
//		Collections.sort(arr);
		
		//copy array list
		ArrayList list = arr;
		
		System.out.println(list);
		
		
		//Iteration of list using Iterator
		Iterator  iter = arr.iterator();
		while (iter.hasNext()) {
			System.out.println(iter.next());
		}
	}
}
