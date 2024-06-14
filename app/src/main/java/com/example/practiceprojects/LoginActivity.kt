package com.example.practiceprojects

import android.content.Intent
import android.graphics.drawable.AnimationDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.LinearLayout
import android.widget.RelativeLayout
import android.widget.TextView
import android.widget.Toast

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        val btnLogin=findViewById<Button>(R.id.btnLogin)
        val tvSignup=findViewById<TextView>(R.id.tvSignUp)
        val tvForgot=findViewById<TextView>(R.id.tvForgot)


      tvSignup.setOnClickListener {
          Toast.makeText(this, "SignUp Clicked...", Toast.LENGTH_SHORT).show()
      }

        tvForgot.setOnClickListener {
            Toast.makeText(this, "Forgot Clicked...", Toast.LENGTH_SHORT).show()
        }

        btnLogin.setOnClickListener(){
            startActivity(Intent(this,MainActivity::class.java))
        }
    }
}