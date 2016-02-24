package com.gmail.mosoft521.ch03.trace;

import java.util.ArrayList;
import java.util.List;

/**
 * -verbose:gc
 * -XX:+PrintGC
 * -XX:+PrintGCDetails
 * -XX:+PrintGCTimeStamps
 * -XX:+PrintGCApplicationConcurrentTime
 * -XX:+PrintGCApplicationStoppedTime
 * <p/>
 * -XX:+PrintReferenceGC
 * <p/>
 * -XX:+PrintHeapAtGC
 * <p/>
 * -XX:+PrintVMOptions  -XX:+PrintCommandLineFlags
 * -XX:+PrintFlagsFinal  打印所有
 * <p/>
 * -Xloggc:log/gc.log
 *
 * @author geym
 */
public class SimpleGc {
    public static void main(String[] args) {
        List<byte[]> l = new ArrayList<byte[]>();
        for (int i = 0; i < 1000000; i++) {
            byte[] bytes = new byte[64];
            l.add(bytes);
            if (l.size() * 64 / 1024 / 1024 > 13) {
                l.clear();
            }
        }
    }
}