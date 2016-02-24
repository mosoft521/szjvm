package com.gmail.mosoft521.ch02.heap;

public class SimpleHeap {
    private int id;

    public SimpleHeap(int id) {
        this.id = id;
    }

    public static void main(String[] args) {
        SimpleHeap s1 = new SimpleHeap(1);
        SimpleHeap s2 = new SimpleHeap(2);
        s1.show();
        s2.show();
    }

    public void show() {
        System.out.println("My ID is " + id);
    }
}
/*
My ID is 1
My ID is 2
 */