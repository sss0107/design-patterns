package com.sss.pattern.singleton.lazy;

/**
 * Created by Pactera on 2019/3/11.
 * descript: 静态内部类懒汉模式
 */
public class LazyInnerSingleton {
    private LazyInnerSingleton() {

    }

    public static LazyInnerSingleton getInstance() {
        return InstanceHolder.INSTANCE;
    }

    public static class InstanceHolder {
        private static final LazyInnerSingleton INSTANCE = new LazyInnerSingleton();
    }
}
