package com.company;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

//Write a method that takes a string and print the number of occurrence of each character characters in the string.
public class Q3 {
    public static void main(String[] args) {
        noOfchars("reshma s a");
    }

    public static void noOfchars(String string) {
        string = string.toLowerCase();

        HashMap<Character, Integer> hashMap = new HashMap<>();

        for (int i = 0; i < string.length(); i++) {
            char ch = string.charAt(i);
            if (ch != ' ') {
                if(hashMap.containsKey(ch))
                    hashMap.put(ch,hashMap.get(ch)+1);
                else
                    hashMap.put(ch,1);
            }
        }

        for (HashMap.Entry entry :
                hashMap.entrySet()) {
            System.out.println(entry.getKey()+" : "+entry.getValue());
        }
    }
}
