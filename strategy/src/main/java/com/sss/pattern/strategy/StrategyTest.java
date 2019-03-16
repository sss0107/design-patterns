package com.sss.pattern.strategy;

/**
 * Created by Pactera on 2019/3/16.
 */
public class StrategyTest {

    public static void main(String[] args) {
        MonitorListener listener = new MonitorListener(MonitorFactory.getInstance("screen"));
        listener.excute();
    }
}
