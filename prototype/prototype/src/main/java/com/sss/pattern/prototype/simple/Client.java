package com.sss.pattern.prototype.simple;

/**
 * Created by Pactera on 2019/3/14.
 */
public class Client {
    private Prototype prototype;

    public Client(Prototype prototype) {
        this.prototype = prototype;
    }

    public Prototype startClone(Prototype originalPrototype) {
        return originalPrototype.clone();
    }
}
