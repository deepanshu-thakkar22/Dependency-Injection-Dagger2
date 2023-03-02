package com.example.dependency_injection_dagger2.dagger_2.module

import com.example.dependency_injection_dagger2.service.EmailService
import com.example.dependency_injection_dagger2.service.MessageService
import com.example.dependency_injection_dagger2.service.NotificationService
import dagger.Module
import dagger.Provides
import javax.inject.Named

@Module
class NotificationServiceModule {

    @Named("email")
    @Provides
    fun getEmailService(emailService: EmailService):NotificationService{
        return emailService
    }

    @Named("message")
    @Provides
    fun getMessageService(messageService: MessageService):NotificationService{
        return messageService
    }

}