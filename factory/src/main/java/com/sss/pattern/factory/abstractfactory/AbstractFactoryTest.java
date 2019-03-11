package com.sss.pattern.factory.abstractfactory;

/**
 * Created by Pactera on 2019/3/10.
 */
public class AbstractFactoryTest {

    public static void main(String[] args) {
        IWorkFactory factory = new OperationJobFactory();
        factory.createJob().doJob();
        factory.createRest().doRest();
    }
}
