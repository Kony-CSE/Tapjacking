package com.kony.jacktap;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;

/**
 * Created by KH2195 on 14-Dec-18.
 */

public class MyTapJackingActivity extends KonyTapjacking {

    private static MyTapJackingActivity context;

    public void onCreate(Bundle savedInstanceState) {
        context = this;
        super.onCreate(savedInstanceState);
        Context ctx = (Context) context;
        if (ctx != null) {
//This will get the root layout of Main application activity
            View toplayout = ((Activity) ctx).getWindow().getDecorView().getRootView();
            Boolean disableBGTouches = true;
            if (disableBGTouches) {
                toplayout.setFilterTouchesWhenObscured(true);
// Workaround AOSP Issue 54193 :
// https://code.google.com/p/android/issues/detail?id=54193
                if (toplayout.getFilterTouchesWhenObscured() != true) {
                    toplayout.setFilterTouchesWhenObscured(!true);
                }
            }
        }

    }
}
