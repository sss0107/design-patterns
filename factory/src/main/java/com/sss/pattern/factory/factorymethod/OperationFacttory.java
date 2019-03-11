package com.sss.pattern.factory.factorymethod;

import com.sss.pattern.factory.IJob;
import com.sss.pattern.factory.Operation;

/**
 * Created by Pactera on 2019/3/10.
 */
public class OperationFacttory implements IJobFactory {

    public IJob create() {
        return new Operation();
    }
}
