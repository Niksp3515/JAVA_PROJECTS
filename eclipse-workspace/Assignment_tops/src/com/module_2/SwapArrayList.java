package com.module_2;

import java.util.ArrayList;
import java.util.Collections;

public class SwapArrayList {

    public static void main(String[] args) {
        
        ArrayList<String> list = new ArrayList<>();
        list.add("Element 1");
        list.add("Element 2");
        list.add("Element 3");
        list.add("Element 4");

        
        System.out.println("Original ArrayList: " + list);
        Collections.swap(list, 1, 3);
        System.out.println("ArrayList after swapping: " + list);
    }
}
