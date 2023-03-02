package com.example.dependency_injection_dagger2.dagger_2.module

import com.example.dependency_injection_dagger2.repository.SQLRepository
import com.example.dependency_injection_dagger2.repository.UserRepository
import dagger.Binds
import dagger.Module

@Module
abstract class UserRepositoryModule {

    @Binds
    abstract fun getSQLRepository(sqlRepository: SQLRepository): UserRepository

}