package com.module_2;

import java.util.HashSet;
import java.util.ArrayList;
import java.util.List;

public class HashSetToList {

    public static void main(String[] args) {
        
        HashSet<String> set = new HashSet<>();
        set.add("Element 1");
        set.add("Element 2");
        set.add("Element 3");
        set.add("Element 4");
        System.out.println("Original HashSet: " + set);

        List<String> list = new ArrayList<>(set);
        System.out.println("ArrayList: " + list);
    }
}
