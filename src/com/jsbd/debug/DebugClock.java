package com.jsbd.debug;


public class DebugClock {
    private long mStartTime;
    
    public DebugClock() {
        if (!DebugConstant.DEBUG) return;
        mStartTime = System.currentTimeMillis();
    }
    
    public DebugClock(long startTime) {
        if (!DebugConstant.DEBUG) return;
        this.mStartTime = startTime;
    }
    
    public void markFirstTime() {
        if (!DebugConstant.DEBUG) return;
        mStartTime = System.currentTimeMillis();
    }
    
    public long getTakingTime() {
        return System.currentTimeMillis() - mStartTime;
    }
    
    public void calculateTime(String tags, String runningInfo) {
        if (!DebugConstant.DEBUG) return;
        long takingTime = System.currentTimeMillis() - mStartTime;
        DebugLog.i(tags, runningInfo + " taking time: " + takingTime + "ms");
    }
}
