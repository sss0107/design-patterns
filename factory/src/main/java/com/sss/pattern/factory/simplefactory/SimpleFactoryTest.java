package com.sss.pattern.factory.simplefactory;

import com.sss.pattern.factory.IJob;
import com.sss.pattern.factory.Operation;

/**
 * Created by Pactera on 2019/3/10.
 */
public class SimpleFactoryTest {
    public static void main(String[] args) {
        JobFactory jobFactory = new JobFactory();
        IJob job =  jobFactory.create(Operation.class);
        job.doJob();
    }
}
