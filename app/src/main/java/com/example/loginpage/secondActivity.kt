package com.example.loginpage

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.annotation.ColorRes

class secondActivity : AppCompatActivity() {

    lateinit var tvname:TextView
    lateinit var tvemail:TextView
    lateinit var tvphone:TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        tvname=findViewById(R.id.textViewname)
        tvemail=findViewById(R.id.textViewemail)
        tvphone=findViewById(R.id.textViewphone)

        val name=intent.getStringExtra("name")
        val email=intent.getStringExtra("email")
        val phone=intent.getLongExtra("phone",0)

        tvname.text="hello $name"
        tvemail.text="your email is $email"
        tvphone.text="and your phone number is $phone"

        tvname.setTextColor(Color.BLUE)
        tvemail.setTextColor(Color.BLUE)
        tvphone.setTextColor(Color.BLUE)

    }
}