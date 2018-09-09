package com.example.kolin.testscopekoin

import android.app.Application
import org.koin.android.ext.android.getKoin
import org.koin.android.ext.android.startKoin

class App : Application() {

    override fun onCreate() {
        super.onCreate()

        startKoin(this, listOf(appModule))
        getKoin().getOrCreateScope("AnonScope")
    }
}