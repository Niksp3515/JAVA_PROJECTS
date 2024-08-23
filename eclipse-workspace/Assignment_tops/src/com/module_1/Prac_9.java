package com.module_1;

import java.util.Scanner;

public class Prac_9 {
public static void main(String[] args) {
	 Scanner scanner = new Scanner(System.in);
     System.out.println("Enter a string:");
     String input = scanner.nextLine();
     
     int letters = 0;
     int spaces = 0;
     int numbers = 0;
     int others = 0;
     
     for (int i = 0; i < input.length(); i++) {
         char ch = input.charAt(i);
         
         if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
             letters++;
         } else if (ch >= '0' && ch <= '9') {
             numbers++;
         } else if (ch == ' ') {
             spaces++;
         } else {
             others++;
         }
     }
     
     System.out.println("Letters: " + letters);
     System.out.println("Spaces: " + spaces);
     System.out.println("Numbers: " + numbers);
     System.out.println("Other characters: " + others);
     
}
}
