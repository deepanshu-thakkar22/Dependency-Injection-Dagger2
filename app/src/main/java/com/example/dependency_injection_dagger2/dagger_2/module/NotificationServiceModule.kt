package com.example.dependency_injection_dagger2.dagger_2.module

import com.example.dependency_injection_dagger2.service.EmailService
import com.example.dependency_injection_dagger2.service.MessageService
import com.example.dependency_injection_dagger2.service.NotificationService
import dagger.Module
import dagger.Provides
import javax.inject.Named
import javax.inject.Singleton

@Module
class NotificationServiceModule {

    @Named("email")
    @Provides
    fun getEmailService(emailService: EmailService):NotificationService{
        return emailService
    }

    @Named("message")
    @Provides
    fun getMessageService(retryCount:Int):NotificationService{
        return MessageService(retryCount)
    }

}