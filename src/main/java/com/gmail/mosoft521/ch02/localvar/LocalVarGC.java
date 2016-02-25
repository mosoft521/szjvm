package com.gmail.mosoft521.ch02.localvar;

// -XX:+PrintGC
public class LocalVarGC {
    public void localVarGc1() {
        byte[] a = new byte[6 * 1024 * 1024];
        System.gc();
    }

    public void localVarGc2() {
        byte[] a = new byte[6 * 1024 * 1024];
        a = null;
        System.gc();
    }

    public void localVarGc3() {
        {
            byte[] a = new byte[6 * 1024 * 1024];
        }
        System.gc();
    }

    public void localVarGc4() {
        {
            byte[] a = new byte[6 * 1024 * 1024];
        }
        int c = 10;
        System.gc();
    }

    public void localVarGc5() {
        localVarGc1();
        System.gc();
    }

    public static void main(String[] args) {
        LocalVarGC ins = new LocalVarGC();
        ins.localVarGc5();
    }
}
/*
1 无法回收
[GC (System.gc())  8110K->6880K(62976K), 0.0053615 secs]
[Full GC (System.gc())  6880K->6776K(62976K), 0.0085888 secs]
2 可以回收
[GC (System.gc())  8110K->720K(62976K), 0.0013561 secs]
[Full GC (System.gc())  720K->630K(62976K), 0.0086591 secs]
3 无法回收
[GC (System.gc())  8110K->6880K(62976K), 0.0043245 secs]
[Full GC (System.gc())  6880K->6777K(62976K), 0.0058498 secs]
4 可以回收
[GC (System.gc())  8110K->720K(62976K), 0.0013337 secs]
[Full GC (System.gc())  720K->632K(62976K), 0.0059000 secs]
5
[GC (System.gc())  8110K->6896K(62976K), 0.0043438 secs]
[Full GC (System.gc())  6896K->6774K(62976K), 0.0199998 secs]
[GC (System.gc())  7102K->6806K(62976K), 0.0004499 secs]
[Full GC (System.gc())  6806K->630K(62976K), 0.0064189 secs]
 */