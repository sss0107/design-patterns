package com.sss.pattern.delegate;

/**
 * Created by Pactera on 2019/3/16.
 */
public class RuleMonitor implements IMonitor {
    public void doMonitor(String type) {
        System.out.println("规则监控");
    }
}
