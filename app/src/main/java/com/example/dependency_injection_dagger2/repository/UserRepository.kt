package com.example.dependency_injection_dagger2.repository

import android.util.Log
import com.example.dependency_injection_dagger2.utils.Constants
import javax.inject.Inject

class UserRepository @Inject constructor() {

    fun saveUser(email:String,password:String){
        Log.d(Constants.TAG,"User Saved in DB")
    }

}