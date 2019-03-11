package com.sss.pattern.factory.factorymethod;

import com.sss.pattern.factory.Develop;
import com.sss.pattern.factory.IJob;


/**
 * Created by Pactera on 2019/3/10.
 */
public class DevelopFacttory implements IJobFactory {

    public IJob create() {
        return new Develop();
    }
}
