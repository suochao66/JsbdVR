package com.jsbd.debug;


import android.util.Log;

public class DebugLog {

    public static void d(String tags, String str) {
        if (!DebugConstant.DEBUG) return;
        Log.d(tags, str);
    }
    
    public static void e(String tags, String str) {
        Log.e(tags, str);
    }
    
    public static void v(String tags, String str) {
        if (!DebugConstant.DEBUG) return;
        Log.v(tags, str);
    }
    
    public static void w(String tags, String str) {
        if (!DebugConstant.DEBUG) return;
        Log.w(tags, str);
    }
    
    public static void i(String tags, String str) {
        if (!DebugConstant.DEBUG) return;
        Log.i(tags, str);
    }
    
    public static void d(String tags, Exception e) {
        if (!DebugConstant.DEBUG) return;
        Log.d(tags, Log.getStackTraceString(e));
    }
    
    public static void d(String str){
        if (!DebugConstant.DEBUG) return;
        Log.d(DebugConstant.DEBUG_Tag, str);
    }
    
    public static void d(Exception e){
        if (!DebugConstant.DEBUG) return;
        d(DebugConstant.DEBUG_Tag,  e);
    }
}
