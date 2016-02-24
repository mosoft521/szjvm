package com.gmail.mosoft521.ch04.ref;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/**
 * 不管当前内存空间足够与否，都会回收它的内存
 *
 * @author geym
 */
public class WeakRefQ {

    static ReferenceQueue<User> weakQueue = null;

    public static void main(String[] args) throws InterruptedException {
        Thread t = new CheckRefQueue();
        t.setDaemon(true);
        t.start();

        User u = new User(1, "geym");
        weakQueue = new ReferenceQueue<User>();
        UserWeakReference userWeakRef = new UserWeakReference(u, weakQueue);
        u = null;
        System.out.println(userWeakRef.get());
        System.gc();
        //不管当前内存空间足够与否，都会回收它的内存
        System.out.println("After GC:");
        System.out.println(userWeakRef.get());

        Thread.sleep(1000);
    }

    public static class User {
        public int id;
        public String name;

        public User(int id, String name) {
            this.id = id;
            this.name = name;
        }

        @Override
        public String toString() {
            return "[id=" + String.valueOf(id) + ",name=" + name + "]";
        }
    }

    public static class CheckRefQueue extends Thread {

        @Override
        public void run() {
            while (true) {
                if (weakQueue != null) {
                    UserWeakReference obj = null;
                    try {
                        obj = (UserWeakReference) weakQueue.remove();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    if (obj != null)
                        System.out.println("user id " + obj.uid + " is delete");

                }
            }
        }
    }

    public static class UserWeakReference extends WeakReference<User> {
        int uid;

        public UserWeakReference(User referent, ReferenceQueue<? super User> q) {
            super(referent, q);
            uid = referent.id;
        }
    }
}