package com.lavkush.login_activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class Register_activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)
    }

    override fun onStop() {
        super.onStop()
        finish()
    }
}