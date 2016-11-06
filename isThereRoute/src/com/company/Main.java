package com.company;

import java.util.Collection;
import java.util.TreeMap;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
import com.sun.corba.se.impl.orbutil.graph.Node;


import java.util.LinkedList;
import java.util.Queue;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Graph g = new Graph;
        g.add("hi");
//        System.out.print(g.getNodeData());
    }

    public enum State {
        UNVISITED,
        VISITED,
        VISITING
    }

    //Given a directed graph, design an algorithm to find out
    // whether there is a orute between two nodes
    public static boolean search(Graph<> g, Node start, Node end) {
        if(start == end) {
            return true;
        }

        Queue<Node> q = new LinkedList<>();

        for(Node n : g.getNodes()) {

        }


    }
}
