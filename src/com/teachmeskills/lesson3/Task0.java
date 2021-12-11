package com.teachmeskills.lesson3;

import java.util.Scanner;
public class Task0 {
        public static void main(String[] args) {

            int [] arrayNumbers = new int [] {2, 4, 8, 5, 12, 9};

            Scanner sc = new Scanner(System.in);
            System.out.println( "Enter a number: ");
            int num = sc.nextInt();

            for (int i  = 0; i < arrayNumbers.length; i++)
            {
                if (arrayNumbers[i] == num) {
                    System.out.print("Number exist");
                    break;
                } else {
                    System.out.print("Number doesnt exist in array");
                    break;

                }

            }
        }
    }

