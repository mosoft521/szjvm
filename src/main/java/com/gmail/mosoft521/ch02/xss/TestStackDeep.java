package com.gmail.mosoft521.ch02.xss;

/**
 * -Xss1m
 *
 * @author Administrator
 */
public class TestStackDeep {
    private static int count = 0;

    public static void recursion(long a, long b, long c) {
        long e = 1, f = 2, g = 3, h = 4, i = 5, k = 6, q = 7, x = 8, y = 9, z = 10;
        count++;
        recursion(a, b, c);
    }

    public static void recursion() {
        count++;
        recursion();
    }

    public static void main(String args[]) {
        try {
//			recursion(0L,0L,0L);//1
            recursion();//2
        } catch (Throwable e) {
            System.out.println("deep of calling = " + count);
            e.printStackTrace();
        }
    }
}
/*
1
-Xss128K
deep of calling = 298
java.lang.StackOverflowError

-Xss256K
deep of calling = 1929
java.lang.StackOverflowError

2
-Xss128K
deep of calling = 1822
java.lang.StackOverflowError

-Xss256K
deep of calling = 3432
java.lang.StackOverflowError
第二次运行：
java.lang.StackOverflowError
deep of calling = 3779
第三次运行：
deep of calling = 3186
java.lang.StackOverflowError
 */