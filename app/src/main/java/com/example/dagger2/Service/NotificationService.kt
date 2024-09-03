package com.example.dagger2.Service

import android.util.Log
import javax.inject.Inject

interface NotificationService {
    fun send(to:String,from:String,body:String?)
}


class EmailService @Inject constructor(val tryCount:Int): NotificationService {
    override fun send(to: String, from: String, body: String?) {
        Log.d("KOTLIN", "Mail Sent!-$tryCount")
    }
}

    class MessageService @Inject constructor(): NotificationService {
        override fun send(to: String, from: String, body: String?) {
            Log.d("KOTLIN","Message Sent!")
        }

    }
