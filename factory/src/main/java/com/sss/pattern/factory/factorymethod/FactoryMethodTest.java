package com.sss.pattern.factory.factorymethod;

import com.sss.pattern.factory.IJob;

/**
 * Created by Pactera on 2019/3/10.
 */
public class FactoryMethodTest {

    public static void main(String[] args) {
        IJobFactory factory = new OperationFacttory();
        IJob job = factory.create();
        job.doJob();

        factory = new DevelopFacttory();
        job = factory.create();
        job.doJob();
    }
}
