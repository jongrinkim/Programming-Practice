package com.company;

import java.util.EmptyStackException;

/**
 * Created by jongrinkim on 2016-09-24.
 */
public class Stack<T> {
    private static class StackNode<T> {
        private T data;
        private StackNode<T> next;

        public StackNode(T data) {
            this.data = data;
        }
    }

    private StackNode<T> top;

    public void push(T item) {
        StackNode<T> t = new StackNode<>(item);

        t.next = top;
        top = t;

    }

    public T pop() {
        if(top == null) throw new EmptyStackException();

        T item = top.data;
        top = top.next;
        return item;
    }

    public T peek() {
        if(top == null) throw new EmptyStackException();
        return top.data;
    }

    public boolean isEmpty() {
        return top == null;
    }

}
