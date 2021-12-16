package com.teachmeskills.lesson3;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        int[] arr = new int[]{4, 5, 12, 7, 9, 6,};
        int[] newArr = null;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to be deleted:");
        int num = sc.nextInt();
        for (int i = 0; i < arr.length; i++)
            if (arr[i] == num) {
                newArr = new int [arr.length-1];
                for (int index = 0; index < i; index++){
                    newArr[index] = arr[index];
                }
                for (int j = 0; j < arr.length; i++)
                System.out.print();
            if (arr[i] != num) {
                System.out.print("Number doesnt exist");
                break;
            }
        }
    }


    }

