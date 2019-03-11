package com.sss.pattern.factory.simplefactory;

import com.sss.pattern.factory.IJob;

/**
 * Created by Pactera on 2019/3/10.
 */
public class JobFactory {

    public IJob create(Class<? extends IJob> clazz) {
        try {
            if (null != clazz) {
                return clazz.newInstance();
            }
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return null;
    }
}
