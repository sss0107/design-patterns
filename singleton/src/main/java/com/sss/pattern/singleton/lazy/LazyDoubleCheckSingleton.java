package com.sss.pattern.singleton.lazy;

/**
 * Created by Pactera on 2019/3/10.
 * descript: 双重检查锁
 */
public class LazyDoubleCheckSingleton {
    private static volatile LazyDoubleCheckSingleton lazyDoubleCheckSingleton = null;

    private LazyDoubleCheckSingleton() {

    }

    public static LazyDoubleCheckSingleton getInstance() {
        if (lazyDoubleCheckSingleton == null) {
            synchronized (LazyDoubleCheckSingleton.class) {
                if (lazyDoubleCheckSingleton == null) {
                    lazyDoubleCheckSingleton = new LazyDoubleCheckSingleton();
                }
            }
        }
        return lazyDoubleCheckSingleton;
    }

}
