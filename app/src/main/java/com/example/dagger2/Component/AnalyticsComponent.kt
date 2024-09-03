package com.example.dagger2.Component

import com.example.dagger2.Module.AnalyticsModule
import com.example.dagger2.Service.AnalyticsService
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [AnalyticsModule::class])
interface AnalyticsComponent {


    fun getUserRegistrationComponent():UserRegistrationComponent.Factory
}