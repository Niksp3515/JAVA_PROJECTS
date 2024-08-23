package com.module_2;

import java.util.ArrayList;

public class JoinArrayLists {

    public static void main(String[] args) {

        ArrayList<String> list1 = new ArrayList<>();
        list1.add("Element 1");
        list1.add("Element 2");

        ArrayList<String> list2 = new ArrayList<>();
        list2.add("Element 3");
        list2.add("Element 4");
        System.out.println("ArrayList 1: " + list1);
        System.out.println("ArrayList 2: " + list2);
        list1.addAll(list2);
        System.out.println("Joined ArrayList: " + list1);
    }
}
