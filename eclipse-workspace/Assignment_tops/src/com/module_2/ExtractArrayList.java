package com.module_2;

import java.util.ArrayList;
import java.util.List;

public class ExtractArrayList {

    public static void main(String[] args) {
        
        ArrayList<String> list = new ArrayList<>();
        list.add("Element 1");
        list.add("Element 2");
        list.add("Element 3");
        list.add("Element 4");
        list.add("Element 5");

        
        System.out.println("Original ArrayList: " + list);
        List<String> sublist = list.subList(1, 4);
        System.out.println("Extracted Portion: " + sublist);
    }
}

