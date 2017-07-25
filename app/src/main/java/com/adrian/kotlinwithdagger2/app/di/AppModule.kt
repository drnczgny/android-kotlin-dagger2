package com.adrian.kotlinwithdagger2.app.di

import com.adrian.kotlinwithdagger2.app.MyApplication
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

/**
 * Created by cadri on 2017. 07. 25..
 */

@Module
class AppModule(val myApplication: MyApplication) {

    @Singleton
    @Provides
    fun providesApplication(): MyApplication {
        return myApplication
    }

}