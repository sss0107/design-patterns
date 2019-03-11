package com.sss.pattern.singleton.test;


import com.sss.pattern.singleton.lazy.LazySimpleSingleton;
import com.sss.pattern.singleton.theadlocal.ThreadLocalSingleton;

/**
 * Created by Tom.
 */
public class ExectorThread implements Runnable{
    @Override
    public void run() {
//        LazySimpleSingleton singleton = LazySimpleSingleton.getInstance();
        ThreadLocalSingleton singleton = ThreadLocalSingleton.getInstance();
        System.out.println(Thread.currentThread().getName() + ":" + singleton);
    }
}
