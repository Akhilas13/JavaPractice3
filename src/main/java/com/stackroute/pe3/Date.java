
//program to calculate first and last date of a week
package com.stackroute.pe3;


import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Date {
    public static void main(String[] args) {
        // Get calendar set to current date and time
        Calendar c = Calendar.getInstance();

        // Set the calendar to monday of the current week
        c.set(Calendar.DAY_OF_WEEK, Calendar.MONDAY);

        System.out.println();

        // Print dates of the current week that starts on Monday
        DateFormat d = new SimpleDateFormat("EEE dd/MM/yyyy");
        System.out.println(d.format(c.getTime()));
        c.add(Calendar.DATE, 6);
        System.out.println(d.format(c.getTime()));
        System.out.println();
    }
}
