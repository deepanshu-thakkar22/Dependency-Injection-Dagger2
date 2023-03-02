package com.example.dependency_injection_dagger2.repository

import android.util.Log
import com.example.dependency_injection_dagger2.utils.Constants
import javax.inject.Inject


interface UserRepository{
    fun saveUser(email:String,password:String)
}

class SQLRepository @Inject constructor() : UserRepository{
    override fun saveUser(email: String, password: String) {
        Log.d(Constants.TAG,"User Saved in DB")
    }
}

class FirebaseRepository : UserRepository{
    override fun saveUser(email: String, password: String) {
        Log.d(Constants.TAG,"User Saved in Firebase")
    }
}