package com.sss.pattern.factory.abstractfactory;

import com.sss.pattern.factory.IJob;

/**
 * Created by Pactera on 2019/3/10.
 * 所有子工厂会实现该工厂
 */
public interface IWorkFactory {

    IJob createJob();

    IRest createRest();

}
