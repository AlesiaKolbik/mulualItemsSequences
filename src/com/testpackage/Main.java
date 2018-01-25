package com.testpackage;

import java.util.Scanner;
import java.lang.System;

public class Main {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Введите числа для  последовательностей:");
        String input=scanner.nextLine();
        String inputTwo=scanner.nextLine();
        String [] groupElements=input.split(" ");
        String [] groupElements2=inputTwo.split(" ");
        StringBuilder mutualItems=findMutualItems(groupElements,groupElements2);
        print(mutualItems);
        printNumbersOfCoincidences(mutualItems);
    }



    private static StringBuilder findMutualItems(String[] array, String[] secondArray) {
        StringBuilder result=new StringBuilder();
        int j=0;
        for(int i=0;i<array.length;i++){
            if(array[i].equals(secondArray[j])) {
                result.append(array[i]);
                j++;
                if(j==secondArray.length){
                    break;
                }
            }
            if(Integer.parseInt(array[i])>Integer.parseInt(secondArray[j])) {
                j++;
                i--;
                if(j==secondArray.length){
                    break;
                }
            }
            if(Integer.parseInt(array[i])<Integer.parseInt(secondArray[j])) {
                continue;
            }
        }
        return result;
    }

    private static void print(StringBuilder array) {
            System.out.print(array);
        }

    private static void printNumbersOfCoincidences(StringBuilder array) {
        System.out.println("\n Количество совпадений равно: "+array.length());
    }
}
