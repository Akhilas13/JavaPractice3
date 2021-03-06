//program with a class with a main( ) that throws an object of class Exception inside a try block.
//a. Give the constructor for Exception a ​ String​ argument.
//b. Catch the exception inside a catch clause and print the ​ String​ argument.
//c. Add a finally clause and print a message to prove you were there.
package com.stackroute.pe3;

import javax.naming.LimitExceededException;

public class CatchExceptionInsideACatchClauseAddFinallyClause {

    private static String name;

    public CatchExceptionInsideACatchClauseAddFinallyClause(String name) {
        CatchExceptionInsideACatchClauseAddFinallyClause.name = name;
    }

    public static void main(String[] args) {
        try {
            CatchExceptionInsideACatchClauseAddFinallyClause catchExceptionInsideACatchClauseAddFinallyClause = new CatchExceptionInsideACatchClauseAddFinallyClause("Akhila");
            int length = catchExceptionInsideACatchClauseAddFinallyClause.getLength();//find the length of string


            if (length > 2)//if length greater than 2 limit exceeded exception occurs
                throw new LimitExceededException(name);//throw exception
            System.out.println("Inside try block");//limit not exceeded


        } catch (Exception LimitExceededException) {//catch exception
            System.out.println(name);
            System.out.println("Exception caught");
        } finally {
            System.out.println("finally block executed");
        }
    }

    public int getLength() throws LimitExceededException {
        int length = name.length();
        return length;
    }
}

