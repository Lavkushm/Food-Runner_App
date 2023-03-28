package com.lavkush.login_activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    lateinit var phoneNumber:EditText
    lateinit var enterdPassword:EditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val fgtPsd=findViewById<TextView>(R.id.tvForget)
        fgtPsd.setOnClickListener{
            val intent=Intent(this@MainActivity,forget_activity::class.java)
            startActivity(intent)
        }
        val regiter=findViewById<TextView>(R.id.tvRegister)
        regiter.setOnClickListener{
            val intent=Intent(this@MainActivity,Register_activity::class.java)
            startActivity(intent)
        }
    }

    override fun onStop() {
        super.onStop()
        finish()
    }
}