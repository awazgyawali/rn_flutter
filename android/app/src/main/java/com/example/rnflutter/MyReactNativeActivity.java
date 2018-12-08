package com.example.rnflutter;

import com.facebook.react.ReactActivity;
import com.facebook.react.ReactPackage;
import com.facebook.react.shell.MainReactPackage;

import java.util.Arrays;
import java.util.List;

public class MyReactNativeActivity extends ReactActivity {

    @Override
    protected String getMainComponentName() {
        return "rn_flutter";
    }


    @Override
    public boolean getUseDeveloperSupport() {
        return BuildConfig.DEBUG;
    }

    @Override
    protected List<ReactPackage> getPackages() {
        return Arrays.<ReactPackage>asList(
                new MainReactPackage()
        );
    }



    @Override
    protected String getJSMainModuleName() {
        return "index";
    }
}
