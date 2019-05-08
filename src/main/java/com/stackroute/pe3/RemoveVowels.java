//a program to set up an array of places, Loop round and remove the vowels
// Display the new words in console
package com.stackroute.pe3;

import java.util.Scanner;

public class RemoveVowels {
    public static void main(String[] args) {
        String[] strings1 = new String[20];
        System.out.println("enter the limit");
        Scanner input = new Scanner(System.in);
        int limit = input.nextInt();//read the limit
        System.out.println("enter the country names");
        for (int i = 0; i <= limit; i++) {
            strings1[i] = input.nextLine();//read the country names to a string array

        }
        RemoveVowels r = new RemoveVowels();
        r.remove(strings1, limit);

    }

    public void remove(String[] strings1, int limit) {
        String[] strings2 = new String[20];
        for (int i = 0; i <= limit; i++) {
            strings2[i] = strings1[i].replaceAll("[aeiou]", "");//replace all lowercase vowels

        }
        for (int i = 0; i <= limit; i++) {
            System.out.println(strings2[i]);
        }


    }

}
