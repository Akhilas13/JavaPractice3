package com.stackroute.pe3;

import javax.naming.LimitExceededException;

public class ExceptionClass {

    private static String name;

    public ExceptionClass(String name) {
        this.name = name;
    }

    public int getLength() throws LimitExceededException
    {
        int length=name.length();
        return length;
    }

    public static void main(String[] args) {
        try{
            ExceptionClass ex=new ExceptionClass("Akhila");
            int length=ex.getLength();


            if(length>2)
                throw new LimitExceededException(name);
            System.out.println("Inside try block");


        } catch (Exception LimitExceededException)
        {
            System.out.println(name);
            System.out.println("Exception caught");
        }
        finally
        {
            System.out.println("finally block executed");
        }
    }
}

