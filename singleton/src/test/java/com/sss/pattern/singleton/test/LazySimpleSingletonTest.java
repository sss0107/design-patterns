package com.sss.pattern.singleton.test;

/**
 * Created by Pactera on 2019/3/10.
 */
public class LazySimpleSingletonTest {
    public static void main(String[] args) {
        Thread t1 = new Thread(new ExectorThread());
        Thread t2 = new Thread(new ExectorThread());
        t1.start();
        t2.start();
    }
}
