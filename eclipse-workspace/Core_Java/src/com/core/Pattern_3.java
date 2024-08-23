package com.core;
public class Pattern_3 {

        public static void main(String[] args) {
            int n = 5; // Number of rows
    
            // Loop for each row
            for (int i = 0; i < n; i++) {
                // Print leading spaces
                for (int j = 0; j < n - i - 1; j++) {
                    System.out.print("  ");
                }
    
                // Print numbers in increasing order
                for (int j = 1; j <= i + 1; j++) {
                    System.out.print(j + " ");
                }
    
                // Print numbers in decreasing order
                for (int j = i; j > 0; j--) {
                    System.out.print(j + " ");
                }
    
                // Move to the next line
                System.out.println();
            }
            
        }
    
    
}
