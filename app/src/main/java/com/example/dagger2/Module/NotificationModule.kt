package com.example.dagger2.Module

import com.example.dagger2.Annontation.ActivityLevel
import com.example.dagger2.Service.EmailService
import com.example.dagger2.Service.MessageService
import com.example.dagger2.Service.NotificationService
import com.example.dagger2.Service.SQL
import dagger.Binds
import dagger.Module
import dagger.Provides
import javax.inject.Named
import javax.inject.Singleton

@Module
class NotificationModule  {

    @ActivityLevel
    @Named("message")
    @Provides
    fun getMessage():NotificationService{
        return MessageService()
    }

    @ActivityLevel
    @Named("message")
    @Provides
    fun getEmail(tryCount:Int):NotificationService{
        return EmailService(tryCount)
    }

}