package com.stackroute.pe3;

import java.util.Scanner;

public class StudentMarks {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter the number of students");
        int numOfStudents=input.nextInt();
        StudentMarks avg=new StudentMarks();
        avg.gradeAverage(numOfStudents);
    }
     public void gradeAverage(int numOfStudents){

         int[] grades=new int[numOfStudents];
         for(int i=0;i<numOfStudents;i++) {
            System.out.println("enter the grade for students");
             Scanner input=new Scanner(System.in);
            grades[i]=input.nextInt();
            if(grades[i]<0||grades[i]>100){
                System.out.println("error");
            }





        }




    }

}
