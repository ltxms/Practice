package com.lsj.summary.core.application;

import android.app.Application;

/**
 * Created by lsj on 15/12/17.
 */
public class ClientApplication extends Application {
    private static ClientApplication clientApplication = new ClientApplication();


    public static ClientApplication getInstance(){
        return clientApplication;
    }
}
