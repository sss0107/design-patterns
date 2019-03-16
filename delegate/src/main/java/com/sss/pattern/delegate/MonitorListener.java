package com.sss.pattern.delegate;

/**
 * Created by Pactera on 2019/3/16.
 */
public class MonitorListener {

    public void doMonitor(String type,MonitorDelegate monitorDelegate) {
        monitorDelegate.doMonitor(type);
    }
}
