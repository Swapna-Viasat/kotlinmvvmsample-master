package com.ms.kotlinmvvmsample.core

import android.app.Application
import android.content.Context

/**
 *
 * @author Swapna
 * @version 1.0
 * @since 22/11/18
 */
class WeatherApplication : Application() {

    override fun onCreate() {
        super.onCreate()

        mContext = applicationContext
    }

    companion object {
        var mContext: Context = WeatherApplication.mContext
    }
}