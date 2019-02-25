package com.company.Q5;

//Write a program to sort the Student objects based on Score ,
// if the score are same then sort on First Name .
// Class Student{ String Name; Double Score; Double Age

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Q5 {

    public static void main(String[] args) {
        Q5Student student1 = new Q5Student("Reshma Mohan",24.00,45.50);
        Q5Student student2 = new Q5Student("Pooja S",24.00,49.50);
        Q5Student student3 = new Q5Student("Mahima Gupta",24.00,22.50);
        Q5Student student4 = new Q5Student("Anushka Mittal",24.00,45.50);
        Q5Student student5 = new Q5Student("Reshmi Mohan",24.00,45.50);

        List<Q5Student> studentList = new ArrayList<>();
        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);
        studentList.add(student4);
        studentList.add(student5);

        Q5ScoreComparator q5ScoreComparator = new Q5ScoreComparator();
        Collections.sort(studentList,q5ScoreComparator);

        for (Q5Student student :
                studentList) {
            System.out.println(student.getScore()+" : "+student.getName());
        }

    }
}
