package com.moringaschool.alienske.simplechat;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

/**
 * Created by USER on 03/08/2015.
 */
public class ChatApplication extends Application {
    public static final String YOUR_APPLICATION_ID = "wq2YY5tmDDoE2eDckw7IT03myKnLokI6ZOXQaFte";
    public static final String YOUR_CLIENT_KEY = "IIhqz2mqfrnlTsH80nGtMKYvXGF7qSH2yPwvfVL2";

    @Override
    public void onCreate() {
        super.onCreate();
        //Parse models registered here.
        Parse.enableLocalDatastore(this);
        //Initialisation occurs after all classes are registered
        Parse.initialize(this, YOUR_APPLICATION_ID, YOUR_CLIENT_KEY);
    }


}
