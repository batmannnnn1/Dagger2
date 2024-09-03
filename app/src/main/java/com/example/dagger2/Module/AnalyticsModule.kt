package com.example.dagger2.Module

import com.example.dagger2.Service.AnalyticsService
import com.example.dagger2.Service.Firebase
import com.example.dagger2.Service.FirebaseAnalytics
import com.example.dagger2.Service.MixPanel
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class AnalyticsModule {

    @Singleton
    @Provides
    fun getMixPanel():AnalyticsService{
        return MixPanel()
    }

    @Singleton
    @Provides
    fun getFirebase():AnalyticsService{
        return FirebaseAnalytics()
    }
}