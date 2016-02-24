package com.gmail.mosoft521.ch06.hold;

public class HoldCPUMain {
    public static void main(String[] args) {
        new Thread(new HoldCPUTask()).start();
        new Thread(new LazyTask()).start();
        new Thread(new LazyTask()).start();
        new Thread(new LazyTask()).start();
    }

    public static class HoldCPUTask implements Runnable {
        @Override
        public void run() {
            while (true) {
                double a = Math.random() * Math.random();
            }
        }
    }

    public static class LazyTask implements Runnable {
        public void run() {
            try {
                while (true) {
                    Thread.sleep(1000);
                }
            } catch (Exception e) {

            }
        }
    }
}