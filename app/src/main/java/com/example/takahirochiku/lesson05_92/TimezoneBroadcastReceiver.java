package com.example.takahirochiku.lesson05_92;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.widget.Toast;

public class TimezoneBroadcastReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        Toast.makeText(context, "タイムゾーンが変化しました", Toast.LENGTH_LONG).show();
    }
}
