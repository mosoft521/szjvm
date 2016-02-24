package com.gmail.mosoft521.ch05;

/**
 * 有了一个慢的finalize()会导致无法回收
 * <p/>
 * -Xmx10m -Xms10m -XX:+PrintGCDetails -XX:+HeapDumpOnOutOfMemoryError -XX:HeapDumpPath="D:/f.dump"
 *
 * @author Administrator
 */
public class LongFinalize {
    public static void main(String[] args) throws InterruptedException {
        long b = System.currentTimeMillis();
        for (int i = 0; i < 50000; i++) {
            LF f = new LF();
            Thread.sleep(1);
        }
        long e = System.currentTimeMillis();
        System.out.println(e - b);
    }

    public static class LF {
        private byte[] content = new byte[512];

        @Override
        protected void finalize() {
            try {
                System.out.println(Thread.currentThread().getId());
                Thread.sleep(1000);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}