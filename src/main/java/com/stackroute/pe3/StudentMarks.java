//program with a  class called StudentMarks, which prompts user for the number of students, reads it
//from the keyboard, and saves it in an int variable called numOfStudents. It then prompts user for the
//grades of each of the students and saves them in an int array called stuGrades. Program shall
//check that the grade is between 0 and 100 else has to trow an error message.
package com.stackroute.pe3;

import java.util.Scanner;

public class StudentMarks {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the number of students");
        int numOfStudents = input.nextInt();//read the number of students
        StudentMarks average = new StudentMarks();
        average.gradeAverage(numOfStudents);
    }

    public void gradeAverage(int numOfStudents) {

        int[] grades = new int[numOfStudents];
        for (int i = 0; i < numOfStudents; i++) {
            System.out.println("enter the grade for students");
            Scanner input = new Scanner(System.in);
            grades[i] = input.nextInt();//read grades to an array
            if (grades[i] < 0 || grades[i] > 100) {//check garde less than 0 or greater than 100
                System.out.println("error");
            }


        }


    }

}
