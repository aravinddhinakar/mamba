package com.evalvon.helloworld;

import com.parse.Parse;

/**
 * Created by Aravindhan on 2/10/2016.
 */
public class MyApplication extends android.app.Application {
    @Override
    public void onCreate() {
        super.onCreate();

        //This will only be called once in your app's entire lifecycle.
        Parse.enableLocalDatastore(this);
        Parse.initialize(this);

    }

}
