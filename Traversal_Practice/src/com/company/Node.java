package com.company;

/**
 * Created by jongrinkim on 2016-09-06.
 */
public class Node {
    Node left;
    Node right;
    String value;

    public Node(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }
}



