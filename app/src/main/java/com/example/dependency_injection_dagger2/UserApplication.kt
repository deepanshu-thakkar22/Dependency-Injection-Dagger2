package com.example.dependency_injection_dagger2

import android.app.Application
import com.example.dependency_injection_dagger2.dagger_2.component.DaggerUserRegistrationComponent
import com.example.dependency_injection_dagger2.dagger_2.component.UserRegistrationComponent

class UserApplication:Application() {

    lateinit var userRegistrationComponent: UserRegistrationComponent

    override fun onCreate() {
        super.onCreate()
        userRegistrationComponent = DaggerUserRegistrationComponent.factory().create(3)
    }

}