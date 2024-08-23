package com.core;
import java.util.Scanner;

public class Additio_Matrix {
    public static void main(String[] args) {
        int arr[][] = new int[3][3];
        int arr2[][] = new int[3][3];
        int result[][] = new int[3][3];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Elements in First Array :");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print("Enter Element arr["+i+"]["+j+"]: ");
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter Elements in second array: ");
        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                System.out.print("Enter Element arr2["+i+"]["+j+"]: ");
                arr2[i][j] = sc.nextInt();
            }
        }
        System.out.println("Now Addition Of Arrays: ");
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result.length; j++) {
                result[i][j] = arr[i][j] + arr2[i][j];
            }
        }
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result.length; j++) {
               System.out.print(result[i][j]+" ");
            }
            System.out.println();
        }
    }
}
