package com.teachmeskills.lesson3;

import java.util.random.*;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        double sumMas1=0,sumMas2=0;

        int[] Mas1 = new int[5];
        for(int i=0;i<Mas1.length;i++){
            Mas1[i]=(int)(Math.random()*6);
            System.out.print(Mas1[i] +" ");
            sumMas1+=(double)Mas1[i]/Mas1.length; }
        System.out.println(" ");

        int[] Mas2=new int[5];
        for(int i=0;i<Mas2.length;i++){
            Mas2[i] =(int)(Math.random()*6);
            System.out.print(Mas2[i] +" ");
            sumMas2+=(double)Mas2[i]/Mas2.length;
        }
        System.out.println(" ");

        if(sumMas1==sumMas2)System.out.println("The arithmetic mean of the two arrays are equal");
        else {if(sumMas1>sumMas2)
            System.out.println("The arithmetic mean of the first array is bigger  and equal ");
        else System.out.println("The arithmetic mean of the first array is bigger  and equal ");





        }
    }  }
