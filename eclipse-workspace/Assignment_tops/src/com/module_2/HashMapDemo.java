package com.module_2;

import java.util.HashMap;

public class HashMapDemo {

	public static void main(String[] args) {
		HashMap map = new HashMap();
		map.put(1, "Nikhil");
		map.put(2, "Prajapati");
		map.put(3, 21);
		System.out.println(map);
		
		System.out.println("Size of HashMap is : "+map.size());
	}
}
