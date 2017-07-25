package com.adrian.kotlinwithdagger2.app

import android.app.Application
import com.adrian.kotlinwithdagger2.app.di.AppComponent
import com.adrian.kotlinwithdagger2.app.di.AppModule
import com.adrian.kotlinwithdagger2.app.di.DaggerAppComponent

/**
 * Created by cadri on 2017. 07. 25..
 */

class MyApplication : Application() {

    val appComponent: AppComponent by lazy {
        DaggerAppComponent.builder().appModule(AppModule(this)).build()
    }

    override fun onCreate() {
        super.onCreate()
        appComponent.inject(this)
    }
}
