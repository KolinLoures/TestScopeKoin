package com.example.kolin.testscopekoin

import android.content.Context
import android.widget.Toast

class AnonToaster(private val context: Context) : Toaster {
    override fun showToast() {
        Toast.makeText(context, "Hello from Anon Toaster!", Toast.LENGTH_LONG).show()
    }
}