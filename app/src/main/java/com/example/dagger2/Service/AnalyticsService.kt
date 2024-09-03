package com.example.dagger2.Service

import android.util.Log
import javax.inject.Singleton

interface AnalyticsService {

    fun trackEvent(eventName:String,eventType:String)
}

@Singleton
class MixPanel:AnalyticsService{
    override fun trackEvent(eventName: String, eventType: String) {
        Log.d("KOTLIN","MixPanel - $eventName-$eventType")
    }

}

@Singleton
class FirebaseAnalytics:AnalyticsService{
    override fun trackEvent(eventName: String, eventType: String) {
        Log.d("KOTLIN","Firebase - $eventName-$eventType")
    }

}