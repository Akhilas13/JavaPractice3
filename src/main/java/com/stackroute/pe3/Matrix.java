//a program to compute the addition of two matrix, Read the number of rows and columns
//as input, also the values of each matrix
package com.stackroute.pe3;

import java.util.Scanner;

public class Matrix {

    public static void main(String[] args) {
        System.out.println("enter the number of rows");
        Scanner input = new Scanner(System.in);
        int rows = input.nextInt();
        System.out.println("enter the number of coloumns");
        int coloumns = input.nextInt();
        Matrix m = new Matrix();
        m.matrixAddition(rows, coloumns);

    }

    public void matrixAddition(int rows, int coloumns) {
        int[][] array1 = new int[10][10];
        int[][] array2 = new int[10][10];
        int[][] array3 = new int[10][10];
        //read elements for first matrix
        System.out.println("enter the elements of first matrix");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < coloumns; j++) {
                Scanner input = new Scanner(System.in);
                array1[i][j] = input.nextInt();


            }
        }
        //read elements for second matrix
        System.out.println("enter the elements of second matrix");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < coloumns; j++) {
                Scanner input = new Scanner(System.in);
                array2[i][j] = input.nextInt();
            }
        }
        //add two matrices
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < coloumns; j++) {
                array3[i][j] = array1[i][j] + array2[i][j];
            }

        }
        System.out.println("the sum is");
        //print the output matrix
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < coloumns; j++) {
                System.out.println(array3[i][j]);

            }


        }
    }

}
