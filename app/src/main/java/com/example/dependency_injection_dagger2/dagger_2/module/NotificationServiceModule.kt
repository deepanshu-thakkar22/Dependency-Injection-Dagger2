package com.example.dependency_injection_dagger2.dagger_2.module

import com.example.dependency_injection_dagger2.service.EmailService
import com.example.dependency_injection_dagger2.service.NotificationService
import dagger.Module
import dagger.Provides

@Module
class NotificationServiceModule {

    @Provides
    fun getEmailService(emailService: EmailService):NotificationService{
        return emailService
    }

}