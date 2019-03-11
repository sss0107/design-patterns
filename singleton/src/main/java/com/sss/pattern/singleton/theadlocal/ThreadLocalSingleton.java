package com.sss.pattern.singleton.theadlocal;

/**
 * Created by Pactera on 2019/3/11.
 * descript：线程间安全，多线程的话会创建多个实例
 */
public class ThreadLocalSingleton {
    private static final ThreadLocal<ThreadLocalSingleton> threadLocal =
            new ThreadLocal<ThreadLocalSingleton>() {
                @Override
                protected ThreadLocalSingleton initialValue() {
                    return new ThreadLocalSingleton();
                }
            };

    private ThreadLocalSingleton() {

    }

    public static ThreadLocalSingleton getInstance() {
        return threadLocal.get();
    }

}
