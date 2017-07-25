package com.adrian.kotlinwithdagger2.main.di

import com.adrian.kotlinwithdagger2.main.MainActivity
import dagger.Module
import dagger.Provides

/**
 * Created by cadri on 2017. 07. 25..
 */

@Module
class MainModule(val mainActivity: MainActivity) {

    @ActivityScope
    @Provides
    fun provideMainActivity() = mainActivity

}