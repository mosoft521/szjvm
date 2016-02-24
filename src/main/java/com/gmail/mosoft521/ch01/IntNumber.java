package com.gmail.mosoft521.ch01;

public class IntNumber {
    public static void main(String[] args) {
        int a = -10;
        for (int i = 0; i < 32; i++) {
            int t = (a & 0x80000000 >>> i) >>> (31 - i);
            System.out.print(t);
        }
        System.out.println();
        System.out.println(Integer.toBinaryString(a));
    }
}
/*
11111111111111111111111111110110
11111111111111111111111111110110
 */