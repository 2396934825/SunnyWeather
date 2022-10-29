package com.example.sunnyweather

import android.annotation.SuppressLint
import android.app.Application
import android.content.Context
import android.media.session.MediaSession

class SunnyWeatherApplication : Application(){
    companion object{
        const val TOKEN = "XtPgegEvmvwv8Cyt"//申请到的令牌值

        @SuppressLint("StaticFieldLeak")
        lateinit var context: Context

    }

    override fun onCreate() {
        super.onCreate()
        context = applicationContext
    }
}