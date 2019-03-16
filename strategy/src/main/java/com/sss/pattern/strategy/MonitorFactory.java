package com.sss.pattern.strategy;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Pactera on 2019/3/16.
 */
public class MonitorFactory {

    private static Map<String, IMonitor> MONITOR_MAP = new HashMap<String, IMonitor>();

    static {
        MONITOR_MAP.put(MonitorType.SCREEN, new ScreenMonitor());
        MONITOR_MAP.put(MonitorType.APP, new AppMonitor());
        MONITOR_MAP.put(MonitorType.RULE, new RuleMonitor());
    }

    public MonitorFactory() {}

    public static IMonitor getInstance(String type) {

        System.out.println(MONITOR_MAP.get(type));
        return MONITOR_MAP.get(type);
    }

    private interface MonitorType{

        String SCREEN = "screen";
        String APP = "app";
        String RULE = "rule";
    }
}
