package com.gmail.mosoft521.ch01;

import com.google.common.base.Strings;

public class IntNumber {
    public static void main(String[] args) {
        int a = 10;
        for (int i = 0; i < 32; i++) {
            int t = (a & 0x80000000 >>> i) >>> (31 - i);
            System.out.print(t);
        }
        System.out.println();
//        System.out.println(Integer.toBinaryString(a));
        System.out.println(Strings.padStart(Integer.toBinaryString(a), 32, '0'));
    }
}
/*
第一次：-10
11111111111111111111111111110110
11111111111111111111111111110110
第二次：10
00000000000000000000000000001010
1010
第三次：10（使用Guava）
00000000000000000000000000001010
00000000000000000000000000001010
 */