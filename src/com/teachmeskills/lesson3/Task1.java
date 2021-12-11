package com.teachmeskills.lesson3;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        int[] arrayNumbers = new int[]{4, 5, 12, 7, 9, 6,};
        removeElement(arrayNumbers, 5);

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();
        for (int i = 0; i < arrayNumbers.length; i++) {
            if (arrayNumbers[i] != num) {
                System.out.print("Number doesnt exist");
                break;


            }
        }
    }

    private static void removeElement(int[] arrayNumbers, int i) {
    }
}