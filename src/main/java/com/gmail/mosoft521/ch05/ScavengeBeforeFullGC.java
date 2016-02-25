package com.gmail.mosoft521.ch05;

/**
 * -XX:+PrintGCDetails  -XX:-ScavengeBeforeFullGC -XX:+UseParallelOldGC
 * <p>
 * <p>
 * -XX:+PrintGCDetails -XX:+UseSerialGC
 *
 * @author geym
 */
public class ScavengeBeforeFullGC {
    public static void main(String args[]) {
        System.gc();
    }
}