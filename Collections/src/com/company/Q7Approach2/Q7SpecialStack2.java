package com.company.Q7Approach2;

import java.util.*;

public class Q7SpecialStack2 {
    Integer sizeOfStack;
    Integer[] stack;
    List<Integer> minArray;
    Integer top;

    public Q7SpecialStack2(Integer sizeOfStack) {
        this.sizeOfStack = sizeOfStack;
        stack = new Integer[sizeOfStack];
        minArray = new ArrayList(sizeOfStack);
        top = -1;
    }

    public Integer push(Integer element) {
        if (top != sizeOfStack - 1) {
            top++;
            minArray.add(top,element);
            Collections.sort(minArray);
            stack[top] = element;
            return 1;
        }
        return null;
    }

    public Integer pop() {
        if (isEmpty())
            return null;

        minArray.remove(stack[top]);
        return stack[top--];
    }

    public Integer peek() {
        if (isEmpty())
            return null;
        return stack[top];
    }

    public Boolean isEmpty() {
        return (top == -1);
    }

    public Boolean isFull() {
        return (top == sizeOfStack - 1);
    }

    public Integer returnMinEle() {
        return minArray.get(0);
    }

}
