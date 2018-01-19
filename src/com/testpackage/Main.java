package com.testpackage;

import java.util.Scanner;
import java.lang.System;

public class Main {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Введите числа для первой последовательности:");
        String input=scanner.nextLine();
        String [] groupElements=input.split(" ");
        Scanner scanner2=new Scanner(System.in);
        System.out.println("Введите числа для второй последовательности:");
        String input2=scanner2.nextLine();
        String [] groupElements2=input2.split(" ");
        String [] mutualItems=findMutualItems(groupElements,groupElements2);
        print(mutualItems);
        printNumbersOfCoincidences(mutualItems);
    }



    private static String[] findMutualItems(String[] array, String[] array2) {
        String mutualItems="";
        for(int i=0;i<array.length;i++){
            for(int j=0;j<array2.length;j++){
                if(array[i].equals(array2[j])){
                    mutualItems+=array[i]+" ";
                }
            }
        }
        String[] result=mutualItems.split(" ");
        return result;
    }

    private static void print(String[] array) {
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }
    }

    private static void printNumbersOfCoincidences(String[] array) {
        System.out.println("\n Количество совпадений равно: "+array.length);
    }
}
