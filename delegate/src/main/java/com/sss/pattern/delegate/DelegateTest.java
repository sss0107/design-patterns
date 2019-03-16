package com.sss.pattern.delegate;

/**
 * Created by Pactera on 2019/3/16.
 */
public class DelegateTest {

    public static void main(String[] args) {
        MonitorListener monitorListener = new MonitorListener();
        monitorListener.doMonitor("rule",new MonitorDelegate());
    }
}
