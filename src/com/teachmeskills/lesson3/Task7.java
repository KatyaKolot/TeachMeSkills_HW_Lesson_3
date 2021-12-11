package com.teachmeskills.lesson3;

import java.util.Arrays;
public class Task7 {
    public static void main(String[] args) {
    int array [] = {4, 1, 456, 9,};
            for (int i = 0; i < array.length - 1; i++) {
            for (int j = array.length - 1; j > i; j--) {
               if (array[j - 1] > array[j]) {
                        int tmp = array[j - 1];
                        array[j - 1] = array[j];
                        array[j] = tmp;
    System.out.println(Arrays.toString(array));
                    }
                }
            }
        }
    }

