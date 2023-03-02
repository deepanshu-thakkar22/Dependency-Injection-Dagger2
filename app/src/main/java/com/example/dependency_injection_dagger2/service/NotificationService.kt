package com.example.dependency_injection_dagger2.service

import android.util.Log
import com.example.dependency_injection_dagger2.utils.Constants
import javax.inject.Inject


interface NotificationService{
    fun send(to:String,from:String,body:String)
}

class EmailService @Inject constructor() : NotificationService{
    override fun send(to: String, from: String, body: String) {
        Log.d(Constants.TAG,"Email Sent")
    }
}

class MessageService : NotificationService{
    override fun send(to: String, from: String, body: String) {
        Log.d(Constants.TAG,"Message Sent")
    }

}