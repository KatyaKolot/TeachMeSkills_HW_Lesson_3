package com.teachmeskills.lesson3;

import java.util.Scanner;

public class Task0 {
    public static void main(String[] args) {
        int[] arrayNumbers = new int[]{2, 4, 8, 5, 12, 9};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        boolean temp = false;
        for (int i = 0; i < arrayNumbers.length; i++) {
            if (num == arrayNumbers[i])
                System.out.println("Number exist");
                temp = true;

        }
        if (!temp)
            System.out.println("Number doesnt exist ");


    }
}