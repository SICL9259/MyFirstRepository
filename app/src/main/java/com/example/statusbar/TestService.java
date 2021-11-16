package com.example.statusbar;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;

import androidx.annotation.Nullable;

public class TestService extends Service {

    @Override
    public void onCreate() {
        super.onCreate();
    }

    private final MyBinder mMyBinder = new MyBinder();

    public static class MyBinder extends Binder {

    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        return super.onStartCommand(intent, flags, startId);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
    }

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return mMyBinder;
    }
}
