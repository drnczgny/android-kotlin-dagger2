package com.adrian.kotlinwithdagger2.app.di

import android.content.SharedPreferences
import com.adrian.kotlinwithdagger2.app.MyApplication
import dagger.Component
import javax.inject.Singleton

/**
 * Created by cadri on 2017. 07. 25..
 */

@Singleton
@Component(modules = arrayOf(AppModule::class))
interface AppComponent {

    fun inject(myApplication: MyApplication)

    fun sharedPreferences(): SharedPreferences

    object Injector {

        var component: AppComponent? = null
            private set

        fun inject(myApplication: MyApplication) {
            component = DaggerAppComponent.builder()
                    .appModule(AppModule(myApplication))
                    .build()
            component!!.inject(myApplication)
        }
    }
}