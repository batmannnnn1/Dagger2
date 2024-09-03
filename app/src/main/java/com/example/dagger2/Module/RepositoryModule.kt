package com.example.dagger2.Module

import com.example.dagger2.Annontation.ActivityLevel
import com.example.dagger2.Service.AnalyticsService
import com.example.dagger2.Service.Firebase
import com.example.dagger2.Service.SQL
import com.example.dagger2.Service.UserRepository
import dagger.Module
import dagger.Provides
import javax.inject.Named

@Module
class RepositoryModule {

    @ActivityLevel
    @Named("Sql")
    @Provides
    fun getSql(analyticsService: AnalyticsService):UserRepository{
        return SQL(analyticsService)
    }

    @ActivityLevel
    @Named("Firebase")
    @Provides
    fun getFirebase(analyticsService: AnalyticsService):UserRepository{
        return Firebase(analyticsService)
    }

}