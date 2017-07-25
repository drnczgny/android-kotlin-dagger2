package com.adrian.kotlinwithdagger2.main

import android.content.SharedPreferences
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.adrian.kotlinwithdagger2.R
import com.adrian.kotlinwithdagger2.app.di.AppComponent
import com.adrian.kotlinwithdagger2.main.di.MainComponent
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var sharedPreferences: SharedPreferences

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        MainComponent.Injector.buildComponent(this).inject(this);

        sharedPreferences.toString()
    }
}
