package com.sss.pattern.strategy;

import com.sss.pattern.strategy.IMonitor;
/**
 * Created by Pactera on 2019/3/16.
 */
public class MonitorListener {

    private IMonitor monitor;

    public MonitorListener(IMonitor monitor) {
        this.monitor = monitor;
    }

    public void excute() {
        monitor.doMonitor();
    }
}
