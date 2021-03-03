package com.example.myapplication;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        ParseObject.registerSubclass(Post.class);

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("tcRSjHJCkq4DczbqXvXoWLJo17guzYGUw18Mc06P")
                .clientKey("14okgQalTpJ98JVmzNoWqe2D0j3ZSQ4OppE4Sr95")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
