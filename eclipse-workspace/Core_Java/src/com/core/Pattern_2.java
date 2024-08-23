package com.core;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Pattern_2 {
    public static void main(String[] args) {
        int n =5;
       for (int i = 0; i <= n ; i++) {
            for (int k = i; k <= n; k++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
            System.out.print((char)(j+65)+" ");
            }
            System.out.println();
       }
       for (int i = n-1; i >= 0 ; i--) {

        for (int k = i; k <= n; k++) {
            System.out.print(" ");
        }
        for (int j = 0; j <= i; j++) {
            System.out.print((char)(j+65)+" ");
        }
        System.out.println();
   }

    }
}
