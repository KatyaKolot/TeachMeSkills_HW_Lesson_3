package com.teachmeskills.lesson3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        System.out.print("Enter a size of an array: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] randomNum = new int[n];
        for (int i = 0; i < randomNum.length; i++)
            randomNum[i] = new Random().nextInt(n);
        //System.out.print(Arrays.toString(randomNum));


    }
}
