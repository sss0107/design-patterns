package com.sss.pattern.proxy.staticproxy;

import com.sss.pattern.proxy.Person;

/**
 * Created by Pactera on 2019/3/14.
 */
public class Wife implements Person {
    public void buy() {
        System.out.println("需要买：水果");
    }
}
