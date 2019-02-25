package com.company;

//Print the elements of an array in the decreasing frequency
// if 2 numbers have same frequency then print the one which came first.

import java.util.*;

public class Q6 {
    public static void main(String[] args) {
        Integer[] array = new Integer[]{1, 5,5,5,2, 5, 2, 1, 1, 3, 3, 4, 4};

        LinkedHashMap<Integer, Integer> linkedHashMap = new LinkedHashMap();
        for (Integer arr : array) {
            if (linkedHashMap.containsKey(arr))
                linkedHashMap.put(arr, linkedHashMap.get(arr) + 1);
            else
                linkedHashMap.put(arr, 1);
        }

        List<Map.Entry<Integer, Integer>> mylist = new ArrayList<>(linkedHashMap.entrySet());
 //       System.out.println(mylist);

        Collections.sort(mylist, new Comparator<Map.Entry<Integer, Integer>>() {
            public int compare(Map.Entry<Integer, Integer> o1,
                               Map.Entry<Integer, Integer> o2) {
                if(o1.getValue()>o2.getValue())
                    return -1;
                else
                    return 1;
            }
        });

 //       System.out.println(mylist);

        Iterator<Map.Entry<Integer, Integer>> iterator = mylist.iterator();
        while (iterator.hasNext()) {
                System.out.println(iterator.next().getKey());
        }

    }
}



