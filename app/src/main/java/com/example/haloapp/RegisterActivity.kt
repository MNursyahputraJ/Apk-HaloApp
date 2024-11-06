package com.example.haloapp

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class RegisterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        val moveIntent = Intent (this@RegisterActivity, MainActivity::class.java )
        startActivity(moveIntent)
    }
}