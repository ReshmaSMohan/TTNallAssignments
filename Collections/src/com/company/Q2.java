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
            //approach1 - counting repeated characters once
            /*if(string.charAt(i)!=' ')
            hashSet.add(string.charAt(i));*/

            //approach2 - not at all counting repeated characters
            if(string.charAt(i)!=' '){
                if(hashSet.contains(string.charAt(i)))
                    hashSet.remove(string.charAt(i));
                else
                    hashSet.add(string.charAt(i));
            }
        }
        uniqueCharsNo=hashSet.size();
        return uniqueCharsNo;
    }
}
