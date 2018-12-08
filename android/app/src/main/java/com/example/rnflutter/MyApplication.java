package com.example.rnflutter;

import com.facebook.soloader.SoLoader;

import io.flutter.app.FlutterApplication;

public class MyApplication extends FlutterApplication {

    @Override
    public void onCreate() {
        super.onCreate();
        SoLoader.init(this, /* native exopackage */ false);
    }
}
