package com.example.dependency_injection_dagger2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.dependency_injection_dagger2.dagger_2.component.DaggerUserRegistrationComponent
import com.example.dependency_injection_dagger2.service.MainActivityPresenter
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var mainActivityPresenter: MainActivityPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val component = DaggerUserRegistrationComponent.builder().build()
        component.inject(this)
        mainActivityPresenter.registerUser("deepanshu@gmail.com","12345678")

    }
}