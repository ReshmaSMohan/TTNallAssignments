package com.company.Q4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//Write a program to sort Employee objects based on highest salary using Comparator.
// Employee class{ Double Age; Double Salary; String Name
public class Q4 {

    public static void main(String[] args) {
        Q4Employee employee1=new Q4Employee("reshma",13000.70,24.00);
        Q4Employee employee2=new Q4Employee("pooja",24000.34,24.00);
        Q4Employee employee3=new Q4Employee("mahima",10000.00,24.00);
        Q4Employee employee4=new Q4Employee("anushka",15000.00,24.00);
        Q4Employee employee5=new Q4Employee("reshmi",8000.45,24.00);

        List<Q4Employee> employeeList = new ArrayList<>();
        employeeList.add(employee1);
        employeeList.add(employee2);
        employeeList.add(employee3);
        employeeList.add(employee4);
        employeeList.add(employee5);

        Q4SalaryComparator salaryComparator = new Q4SalaryComparator();
        Collections.sort(employeeList,salaryComparator);

        for (Q4Employee employee :
                employeeList) {
            System.out.println(employee.getName()+" : "+employee.getSalary());
        }

    }

}
