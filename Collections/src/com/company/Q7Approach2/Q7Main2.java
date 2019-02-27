package com.company.Q7Approach2;

public class Q7Main2 {

    public static void main(String[] args) {
        Q7SpecialStack2 mystack = new Q7SpecialStack2(5);
        mystack.push(3);
        mystack.push(15);
        mystack.push(32);
        mystack.push(2);
        mystack.push(1);

        System.out.println("Peek : "+mystack.peek());
        System.out.println("Is Empty : "+mystack.isEmpty());
        System.out.println("Is full : "+mystack.isFull());
        System.out.println("Minimum Element : "+mystack.returnMinEle());
        mystack.pop();
        System.out.println("Minimum Element : "+mystack.returnMinEle());

    }
}
