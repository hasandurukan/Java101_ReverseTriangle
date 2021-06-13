package com.java101;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = 0;
        Character c;

        System.out.print("Enter height of the triangle : ");
        size = sc.nextInt();

        int i, j, k;

        for (i = size; i > 0; i--) {
            for (j = size; j > i; j--) {
                System.out.print(" ");
            }
            for (k = 0; k < (i * 2 - 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
