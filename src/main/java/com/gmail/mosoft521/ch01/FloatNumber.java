package com.gmail.mosoft521.ch01;

import com.google.common.base.Strings;

public class FloatNumber {
    public static void main(String[] args) {
        float f = -5;
        System.out.println(f);
//        System.out.println(Integer.toBinaryString(Float.floatToRawIntBits(f)));
        System.out.println(Strings.padStart(Integer.toBinaryString(Float.floatToRawIntBits(f)),32, '0'));
    }
}
/*
//5
5.0
01000000101000000000000000000000
//-5
-5.0
11000000101000000000000000000000
 */