package com.company.Q4;

import com.company.Q4.Q4Employee;

import java.util.Comparator;

public class Q4SalaryComparator implements Comparator<Q4Employee> {

    @Override
    public int compare(Q4Employee q4Employee1, Q4Employee q4Employee2) {
        if(q4Employee1.getSalary()<q4Employee2.getSalary())
            return -1;
        else if(q4Employee1.getSalary()>q4Employee2.getSalary())
            return 1;
        else
            return 0;
    }
}
