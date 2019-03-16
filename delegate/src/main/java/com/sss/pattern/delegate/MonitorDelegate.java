package com.sss.pattern.delegate;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Pactera on 2019/3/16.
 */
public class MonitorDelegate implements IMonitor {

    private Map<String,IMonitor> targets = new HashMap<String,IMonitor>();

    public MonitorDelegate() {
        targets.put("app", new AppMonitor());
        targets.put("screen", new ScreenMonitor());
        targets.put("rule", new RuleMonitor());
    }

    public void doMonitor(String type) {
        targets.get(type).doMonitor(type);
    }
}
