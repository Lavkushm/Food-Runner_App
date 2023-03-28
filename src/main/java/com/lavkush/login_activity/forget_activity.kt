package com.lavkush.login_activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class forget_activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_forget)
    }

    override fun onStop() {
        super.onStop()
        finish()
    }
}