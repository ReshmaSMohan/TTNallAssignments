package com.company.Q7;

public class Q7Main {

    public static void main(String[] args) {
        Q7SpecialStack mystack = new Q7SpecialStack(5);
        mystack.push(2);
        mystack.push(15);
        mystack.push(32);
        mystack.push(9);
        mystack.push(1);
        mystack.pop();
        System.out.println("Peek : "+mystack.peek());
        System.out.println("Is Empty : "+mystack.isEmpty());
        System.out.println("Is full : "+mystack.isFull());
        System.out.println("Minimum Element : "+mystack.returnMinEle());

    }

}
