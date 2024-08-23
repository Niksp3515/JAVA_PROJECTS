package com.module_2;

import java.util.ArrayList;
import java.util.Objects;

public class CompareArrayLists {

    public static void main(String[] args) {
        
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("Element 1");
        list1.add("Element 2");
        list1.add("Element 3");

        ArrayList<String> list2 = new ArrayList<>();
        list2.add("Element 1");
        list2.add("Element 2");
        list2.add("Element 3");

        
        System.out.println("ArrayList 1: " + list1);
        System.out.println("ArrayList 2: " + list2);

        
        boolean areEqual = Objects.equals(list1, list2);

        
        if (areEqual) {
            System.out.println("The two ArrayLists are equal.");
        } else {
            System.out.println("The two ArrayLists are not equal.");
        }
    }
}
