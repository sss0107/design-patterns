package com.sss.pattern.factory.abstractfactory;

import com.sss.pattern.factory.IJob;
import com.sss.pattern.factory.Operation;

/**
 * Created by Pactera on 2019/3/10.
 */
public class OperationJobFactory implements IWorkFactory {
    public IJob createJob() {
        return new Operation();
    }

    public IRest createRest() {
        return new OperationRest();
    }
}
