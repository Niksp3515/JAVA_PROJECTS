package com.core;
import java.util.Scanner;

public class Pattern_1 {

    public static void main(String[] args) {
        Scanner sc = new  Scanner(System.in);
        System.out.println("Enter Number : ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            if (i < (n/2)) {
                
            
            for (int k = i; k < (n/2)-1; k++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print(" *");
            }
            System.out.println();
        }
        else{
            for (int k = 0; k <= i-(n/2); k++) {
                System.out.print(" ");
            }
            for (int j = 0; j < (n-1)-i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    }
}
