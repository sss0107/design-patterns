package com.sss.pattern.singleton.lazy;

/**
 * Created by Pactera on 2019/3/10.
 * descript:懒汉式，只有需要才会初始化，会被反射破坏
 */
public class LazySimpleSingleton {

    private static LazySimpleSingleton lazySimpleSingleton = null;

    private LazySimpleSingleton() {

    }

    //本身线程不安全，需要加锁控制
    //synchronized 方法对整个类加锁，影响性能
    public synchronized static LazySimpleSingleton getInstance() {
        if (lazySimpleSingleton == null) {
            lazySimpleSingleton = new LazySimpleSingleton();
        }
        return lazySimpleSingleton;
    }
}
