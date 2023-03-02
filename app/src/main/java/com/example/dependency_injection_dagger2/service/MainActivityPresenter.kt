package com.example.dependency_injection_dagger2.service

import com.example.dependency_injection_dagger2.repository.UserRepository
import javax.inject.Inject
import javax.inject.Named

class MainActivityPresenter @Inject constructor(
    @Named("message") private val notificationService: NotificationService,
    private val userRepository: UserRepository
) {

    fun registerUser(email:String,password:String){
        userRepository.saveUser(email,password)
        notificationService.send(email,"deepanshu@gmail.com","User Registered")
    }

}