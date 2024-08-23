package com.module_2;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {

	public static void main(String[] args) {
		HashSet hs = new HashSet();
		hs.add("Hello");
		hs.add("Nikhil");
		hs.add("Prajapati");
		
		Iterator itr = hs.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		System.out.println("Number of elements in list : "+hs.size());
	}
}
