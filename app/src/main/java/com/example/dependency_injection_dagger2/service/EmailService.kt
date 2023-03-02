package com.example.dependency_injection_dagger2.service

import android.util.Log
import com.example.dependency_injection_dagger2.utils.Constants
import javax.inject.Inject

class EmailService @Inject constructor() {

    fun send(to:String,from:String,body:String){
        Log.d(Constants.TAG,"Email Sent")
    }

}