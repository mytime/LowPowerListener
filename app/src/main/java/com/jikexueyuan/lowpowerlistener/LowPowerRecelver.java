package com.jikexueyuan.lowpowerlistener;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/**
 * 监听电量状态
 * 电量低广播
 *  <intent-filter> *
 *      <action android:name="android.intent.action.BATTERY_LOW"/>
 *  </intent-filter>
 */

public class LowPowerRecelver extends BroadcastReceiver {
    public LowPowerRecelver() {
    }

    @Override
    public void onReceive(Context context, Intent intent) {
        System.out.println("low power");
    }
}
