package com.codegym;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a: ");
       int a = scanner.nextInt();
        System.out.println("Enter b: ");
       int b = scanner.nextInt();
       int[][] array = new int[a][b];
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                System.out.print("Enter arr[i][j]" + j + " : " + "\t");
                array[i][j] = scanner.nextInt();

            }
        }
        int sum = 0;
        System.out.println("Find a1: ");
        int a1 = scanner.nextInt();
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i][a1];
        }
        System.out.println("Sum = " + sum);
    }
}
