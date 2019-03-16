package com.sss.pattern.proxy.staticproxy;

import com.sss.pattern.proxy.Person;

/**
 * Created by Pactera on 2019/3/14.
 */
public class Husband implements Person {

    private Wife wife;

    public Husband(Wife wife) {
        this.wife = wife;
    }

    public void buy() {
        System.out.println("给媳妇儿买东西");
        this.wife.buy();
        System.out.println("买完回家");
    }
}
