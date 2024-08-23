package com.module_2;

import java.util.HashMap;
import java.util.Map;

public class CheckMapEmpty {

    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
 
        map.put(1, "Value 1");
        map.put(2, "Value 2");
        map.put(3, "Value 3");

        if (map.isEmpty()) {
            System.out.println("The map is empty.");
        } else {
            System.out.println("The map is not empty.");
        }
    }
}
