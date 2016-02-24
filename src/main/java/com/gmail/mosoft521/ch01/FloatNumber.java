package com.gmail.mosoft521.ch01;

public class FloatNumber {
    public static void main(String[] args) {
        float a = -0;
        System.out.println(a);
        System.out.println(Integer.toBinaryString(Float.floatToRawIntBits(a)));
    }
}
/*
0.0
0
 */