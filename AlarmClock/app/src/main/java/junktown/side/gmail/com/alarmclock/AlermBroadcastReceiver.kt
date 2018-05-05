package junktown.side.gmail.com.alarmclock

import android.app.Fragment
import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.widget.Toast

class AlermBroadcastReceiver: BroadcastReceiver() {
    override fun onReceive(context: Context?, intent: Intent?) {
        val intent = Intent(context, MainActivity::class.java)
            .putExtra("onReceive", true)
            .addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
        context?.startActivity(intent)
    }
}