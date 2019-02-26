package com.company;

//Write a program to display times in different country format.

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class Q9 {
    public static void main(String[] args) {
        Date date;
        Calendar calendar = Calendar.getInstance();
        date = calendar.getTime();

        Locale locale = new Locale("it","ch");

        DateFormat df = DateFormat.getDateInstance (DateFormat.FULL, locale);
        System.out.println(df.format(date));


        locale = new Locale("fr","FR");
        df = DateFormat.getDateInstance (DateFormat.FULL, locale);
        System.out.println(df.format(date));

        locale = new Locale("fi","ch");
        df = DateFormat.getDateInstance (DateFormat.FULL, locale);
        System.out.println(df.format(date));

        locale = new Locale("en", "US");
        df = DateFormat.getDateInstance (DateFormat.FULL, locale);
        System.out.println(df.format(date));
//
//        for(Locale local:Locale.getAvailableLocales())
//            System.out.println(local);
    }
}
