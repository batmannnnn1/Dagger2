package com.example.dagger2.Application

import android.app.Application
import com.example.dagger2.Component.AnalyticsComponent
import com.example.dagger2.Component.DaggerAnalyticsComponent
import com.example.dagger2.Component.UserRegistrationComponent

class MyApplications : Application() {
    lateinit var analyticsComponent: AnalyticsComponent
    override fun onCreate() {
        super.onCreate()
        analyticsComponent = DaggerAnalyticsComponent.builder().build()

    }

}

/*
now the component's scope becomes the application level
 */