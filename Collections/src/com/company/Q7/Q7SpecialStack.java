package com.company.Q7;

//Design a Data Structure SpecialStack that supports all the stack operations like push(), pop(), isEmpty(),
// isFull() and an additional operation getMin() which should return minimum element from the SpecialStack.

public class Q7SpecialStack {

    Integer sizeOfStack;
    Integer[] stack;
    Integer top,minEle;

    public Q7SpecialStack(Integer sizeOfStack) {
        this.sizeOfStack = sizeOfStack;
        stack = new Integer[sizeOfStack];
        top=-1;
    }

    public Integer push(Integer element){
        if(top!=sizeOfStack-1) {
            if(isEmpty())
                minEle=element;
            top++;
            stack[top] = element;
            minEle=(stack[top]<minEle)?stack[top]:minEle;
            return 1;
        }
        return 0;
    }

    public Integer pop(){
        return stack[top--];
    }

    public Integer peek(){
        return stack[top];
    }

    public Boolean isEmpty(){
        return (top==-1);
    }

    public Boolean isFull(){
        return (top==sizeOfStack-1);
    }

    public Integer returnMinEle(){
        return minEle;
    }
}
