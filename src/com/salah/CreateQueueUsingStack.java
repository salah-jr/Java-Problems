package com.salah;

import java.util.Stack;

public class CreateQueueUsingStack {
    Stack<Integer> stackIn, stackOut;

    public CreateQueueUsingStack() {
        stackIn = new Stack<>();
        stackOut = new Stack<>();
    }

    public void push(int x) {
        stackIn.push(x);
    }

    public int pop() {
        while(!stackIn.isEmpty()){
            stackOut.push(stackIn.pop());
        }

        int x = stackOut.pop();

        while(!stackOut.isEmpty()){
            stackIn.push(stackOut.pop());
        }

        return x;
    }

    public int peek() {
        while(!stackIn.isEmpty()){
            stackOut.push(stackIn.pop());
        }

        int x = stackOut.peek();

        while(!stackOut.isEmpty()){
            stackIn.push(stackOut.pop());
        }

        return x;
    }

    public boolean empty() {
        while(!stackIn.isEmpty()){
            stackOut.push(stackIn.pop());
        }

        return stackOut.empty();
    }
}
