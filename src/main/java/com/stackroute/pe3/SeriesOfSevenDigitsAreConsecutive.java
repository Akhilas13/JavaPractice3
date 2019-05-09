// program to find out if a series of 7 digits are consecutive numbers
// assume the digits are a ​ string​ and use split()

package com.stackroute.pe3;

import java.util.Scanner;

public class SeriesOfSevenDigitsAreConsecutive {

    public static void main(String[] args) {
        int flag = 1;

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the digits:   ");
        String input = scan.nextLine();//read the string

        String[] inputArray = input.split(",");//split using comma assign to string array
        int[] inputArrayInteger = new int[4];

        for (int i = 0; i < inputArray.length; i++) {
            inputArrayInteger[i] = Integer.parseInt(inputArray[i]);

        }

        for (int i = 0; i < inputArray.length; i++) {
            int number = inputArrayInteger[i];
            if (inputArrayInteger[i + 1] == (number + 1) || inputArrayInteger[i + 1] == (number - 1)) {//checks for consecutive
                i++;
                flag = 0;//if consective set flag as 0
            } else {
                break;
            }
        }

        if (flag == 0) {
            System.out.println("consecutive");
        } else {
            System.out.println("not");
        }
    }
}

