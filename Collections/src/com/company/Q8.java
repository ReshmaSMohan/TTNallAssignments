package com.company;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

//Write a program to format date as example "21-March-2016"

public class Q8 {

    public static void main(String[] args) {

        Date date;
        Calendar calendar = Calendar.getInstance();
        date = calendar.getTime();
        SimpleDateFormat format = new SimpleDateFormat("dd-MMMMM-yyyy");
        System.out.println(format.format(date));
    }
}
