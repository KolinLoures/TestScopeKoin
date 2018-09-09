package com.example.kolin.testscopekoin

import org.koin.android.ext.koin.androidContext
import org.koin.dsl.module.module

val appModule = module {
    module("user") {
        scope("UserScope") { UserToaster(androidContext()) } bind Toaster::class
    }
    module("anon"){
        scope("AnonScope") { AnonToaster(androidContext()) } bind Toaster::class
    }
}