package com.module_2;

import java.util.ArrayList;
import java.util.Collections;

public class ReverseArrayList {

    public static void main(String[] args) {
        
        ArrayList<String> list = new ArrayList<>();
        list.add("Element 1");
        list.add("Element 2");
        list.add("Element 3");
        list.add("Element 4");

       
        System.out.println("Original ArrayList: " + list);
        Collections.reverse(list);
        System.out.println("Reversed ArrayList: " + list);
    }
}

