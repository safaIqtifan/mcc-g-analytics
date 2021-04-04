package com.example.googleanalytics;

import android.app.Application;
import android.os.Bundle;

import com.google.firebase.analytics.FirebaseAnalytics;


public class RootApplication extends Application {

    private static RootApplication rootApplication;
    public static FirebaseAnalytics firebaseAnalytics;
    public static long firstOpenTime;

    public static synchronized RootApplication getInstance() {
        return rootApplication;
    }

    @Override
    public void onCreate() {
        super.onCreate();

        firebaseAnalytics = FirebaseAnalytics.getInstance(this);
        firebaseAnalytics.setAnalyticsCollectionEnabled(true);
        rootApplication = this;

    }

    public static void appOpen(String id, String name) {

        Bundle bundle = new Bundle();
        bundle.putString(FirebaseAnalytics.Param.ITEM_ID, id);
        bundle.putString(FirebaseAnalytics.Param.ITEM_NAME, name);
        RootApplication.firebaseAnalytics.logEvent(FirebaseAnalytics.Event.APP_OPEN, bundle);

    }

    public static void buttonClicked(String id, String name) {

        Bundle bundle = new Bundle();
        bundle.putString(FirebaseAnalytics.Param.ITEM_ID, id);
        bundle.putString(FirebaseAnalytics.Param.ITEM_NAME, name);
        RootApplication.firebaseAnalytics.logEvent(FirebaseAnalytics.Event.SELECT_CONTENT, bundle);

    }

    public static void screenView(String id, String name) {

        Bundle bundle = new Bundle();
        bundle.putString(FirebaseAnalytics.Param.SCREEN_CLASS, id);
        bundle.putString(FirebaseAnalytics.Param.ITEM_NAME, name);
        RootApplication.firebaseAnalytics.logEvent(FirebaseAnalytics.Event.SCREEN_VIEW, bundle);

    }

}
