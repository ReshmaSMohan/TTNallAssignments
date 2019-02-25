package com.company.Q5;

import java.util.Comparator;

public class Q5NameComparator implements Comparator<Q5Student> {

    @Override
    public int compare(Q5Student q5Student1, Q5Student q5Student2) {

            return q5Student1.getName().compareTo(q5Student2.getName());

    }
}
