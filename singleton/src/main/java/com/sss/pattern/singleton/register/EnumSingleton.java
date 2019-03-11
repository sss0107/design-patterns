package com.sss.pattern.singleton.register;

/**
 * Created by Pactera on 2019/3/11.
 * descript: 枚举类，常量，通常在通用API中使用
 */
public enum EnumSingleton {
    INSTANCE;

    private Object data;

    public Object getData() {
        return data;
    }

    public static EnumSingleton getInstance() {
        return INSTANCE;
    }
}
