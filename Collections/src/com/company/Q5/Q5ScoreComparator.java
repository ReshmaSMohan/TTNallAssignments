package com.company.Q5;

import java.util.Comparator;

public class Q5ScoreComparator implements Comparator<Q5Student> {

    Q5NameComparator q5NameComparator = new Q5NameComparator();
    @Override
    public int compare(Q5Student q5Student1, Q5Student q5Student2) {
        if(q5Student1.getScore()<q5Student2.getScore())
            return -1;
        else if(q5Student1.getScore()>q5Student2.getScore())
            return 1;
        else
            return q5NameComparator.compare(q5Student1,q5Student2);
    }
}
