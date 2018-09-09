package com.example.kolin.testscopekoin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import org.koin.android.ext.android.getKoin
import org.koin.android.ext.android.inject

class MainActivity : AppCompatActivity() {

    private val toaster: Toaster by inject(scope = getKoin().getScope("AnonScope"))

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        actionButton.setOnClickListener { toaster.showToast() }
    }
}
