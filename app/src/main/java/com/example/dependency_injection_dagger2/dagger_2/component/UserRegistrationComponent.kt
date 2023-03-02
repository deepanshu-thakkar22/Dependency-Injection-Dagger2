package com.example.dependency_injection_dagger2.dagger_2.component

import com.example.dependency_injection_dagger2.MainActivity
import com.example.dependency_injection_dagger2.dagger_2.module.NotificationServiceModule
import com.example.dependency_injection_dagger2.dagger_2.module.UserRepositoryModule
import dagger.Component

@Component(modules = [NotificationServiceModule::class,UserRepositoryModule::class])
interface UserRegistrationComponent {

    fun inject(mainActivity: MainActivity)

}