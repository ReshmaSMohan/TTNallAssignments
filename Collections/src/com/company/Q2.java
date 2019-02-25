package com.company;

import java.util.HashSet;

//Write a method that takes a string and returns the number of unique characters in the string.
public class Q2 {

    public static void main(String[] args) {
        int uniqueNo = uniqueCharsNo("reshma s mohan");
        System.out.println("Unique number of characters in the string : "+uniqueNo);
    }

    public static int uniqueCharsNo(String string){
        int uniqueCharsNo=0;
        string=string.toLowerCase();
        HashSet hashSet = new HashSet();
        for(int i =0;i<string.length();i++){
            if(string.charAt(i)!=' ')
            hashSet.add(string.charAt(i));
        }
        uniqueCharsNo=hashSet.size();
        return uniqueCharsNo;
    }
}
