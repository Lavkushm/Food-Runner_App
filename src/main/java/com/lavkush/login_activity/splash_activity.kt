package com.lavkush.login_activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class splash_activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        Handler().postDelayed({
            val intent=Intent(this@splash_activity,MainActivity::class.java)
            startActivity(intent)
        },2000)
    }

    override fun onStop() {
        super.onStop()
        finish()
    }
}