package com.faizal.shadab.timerapp

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import com.faizal.shadab.timerapp.util.NotificationUtil
import com.faizal.shadab.timerapp.util.PrefUtil

class TimerExpiredReceiver : BroadcastReceiver() {

    override fun onReceive(context: Context, intent: Intent) {
        NotificationUtil.showTimerExpired(context)

        PrefUtil.setTimerState(TimerActivity.TimerState.Stopped, context)
        PrefUtil.setAlarmSetTime(0, context)
    }
}
