package com.gmail.mosoft521.ch02.localvar;

public class LocalVar {
    public static void main(String[] args) {
    }

    public void localVar1() {
        int a = 0;
        System.out.println(a);
        int b = 0;
    }

    public void localVar2() {
        {
            int a = 0;
            System.out.println(a);
        }
        int b = 0;
    }
}
/*

 */