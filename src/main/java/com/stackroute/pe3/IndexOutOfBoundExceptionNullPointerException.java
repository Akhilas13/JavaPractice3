// program that will generate ​ exceptions​ of type NegativeArraySizeException,
//IndexOutOfBoundsException, NullPointerException. Record the catching of each exception by
//displaying the message stored in the exception object.

package com.stackroute.pe3;

public class IndexOutOfBoundExceptionNullPointerException {
    public static void main(String[] args) {

        int[] array = new int[4];
        try {
            int i = array[4];
            String name = null;
            int length = name.length();
            int[] arrays = new int[-7];

            System.out.println("Inside try block");
        } catch (ArrayIndexOutOfBoundsException e) //catch array index out of bounds
        {
            System.out.println("Exception caught in Catch block");
        } catch (NullPointerException e) //catch  null pointer exception
        {
            System.out.println("Exception caught");
        } catch (NegativeArraySizeException e) { //catch negative array size
            System.out.println("EXception caught");
        }


        System.out.println("Outside try-catch block");
    }
}


