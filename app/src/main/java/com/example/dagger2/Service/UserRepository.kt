package com.example.dagger2.Service

import android.util.Log
import javax.inject.Inject
import javax.inject.Named

interface UserRepository {
    fun saveUser(email:String,password:String)
}

@Named("sql")
class SQL @Inject constructor(val analyticsService: AnalyticsService): UserRepository {
    override fun saveUser(email: String, password: String) {
        Log.d("KOTLIN","User Saved in DB")
        analyticsService.trackEvent("Save User","CREATE")
    }

}

class Firebase @Inject constructor(val analyticsService: AnalyticsService): UserRepository {
    override fun saveUser(email: String, password: String) {
        Log.d("KOTLIN","User Saved in FB")
        analyticsService.trackEvent("Save User","CREATE")
    }

}