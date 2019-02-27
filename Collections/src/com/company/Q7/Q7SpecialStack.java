package com.company.Q7;

//Design a Data Structure SpecialStack that supports all the stack operations like push(), pop(), isEmpty(), isFull()
//and an additional operation getMin() which should return minimum element from the SpecialStack(Expected complexity ­ O(1))

public class Q7SpecialStack {

    Integer sizeOfStack;
    Integer[] stack;
    Integer top, minEle;

    public Q7SpecialStack(Integer sizeOfStack) {
        this.sizeOfStack = sizeOfStack;
        stack = new Integer[sizeOfStack];
        top = -1;
    }

    public Integer push(Integer element) {
        if (top != sizeOfStack - 1) {
            if (isEmpty())
                minEle = element;
            top++;
            stack[top] = element;
            minEle = (stack[top] < minEle) ? stack[top] : minEle;
            return 1;
        }
        return null;
    }

    public Integer pop() {

        if (isEmpty())
            return null;

        if (stack[top] == minEle && top != 0) {
            minEle = stack[0];
            for (int i = 0; i < top - 2; i++)
                minEle = (stack[i] < minEle) ? stack[i] : minEle;
        }

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
        if (isEmpty())
            return null;
        return minEle;
    }
}
