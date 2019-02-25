package com.company;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Q1. Write Java code to define List . Insert 5 floating point numbers in List,
// and using an iterator, find the sum of the numbers in List.

public class Main {

    public static void main(String[] args) {
	// write your code here
        float sum = 0;
        List<Float> mylist = new ArrayList<>();
        mylist.add(201.32f);
        mylist.add(101f);
        mylist.add(345.54f);
        mylist.add(95.32f);
        mylist.add(10.20f);

        Iterator<Float> iterator = mylist.iterator();
        while (iterator.hasNext()){
            sum+=iterator.next();
        }

        System.out.println("sum = "+sum);

    }
}
