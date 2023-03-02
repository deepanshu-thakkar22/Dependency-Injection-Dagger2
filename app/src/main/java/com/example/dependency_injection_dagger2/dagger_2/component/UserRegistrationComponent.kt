package com.example.dependency_injection_dagger2.dagger_2.component

import com.example.dependency_injection_dagger2.MainActivity
import dagger.Component

@Component
interface UserRegistrationComponent {

    fun inject(mainActivity: MainActivity)

}