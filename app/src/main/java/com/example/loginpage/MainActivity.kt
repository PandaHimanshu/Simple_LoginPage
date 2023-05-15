package com.example.loginpage

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity() {

    lateinit var etName:TextInputEditText
    lateinit var etEmail:TextInputEditText
    lateinit var etPhone:TextInputEditText
    lateinit var signup:Button

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        etName=findViewById(R.id.edittextname)
        etEmail=findViewById(R.id.edittextEmail)
        etPhone=findViewById(R.id.edittextnumber)
        signup=findViewById(R.id.button)

        signup.setOnClickListener {
            val name=etName.text.toString()
            val email=etEmail.text.toString()
            val phone=etPhone.text.toString().toLong()

            val intent=Intent(this@MainActivity,secondActivity::class.java)
            intent.putExtra("name",name)
            intent.putExtra("email",email)
            intent.putExtra("phone",phone)

            startActivity(intent)
        }
    }
}