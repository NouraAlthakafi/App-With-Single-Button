package com.example.appwithsinglebutton

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    lateinit var etEmail: EditText
    lateinit var buttonC: Button
    lateinit var tvEmail: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        etEmail = findViewById(R.id.etEmail)
        buttonC = findViewById(R.id.button)
        tvEmail = findViewById(R.id.tvEmail)

        buttonC.setOnClickListener{
            val userE = etEmail.text.toString()
            tvEmail.text = userE
            etEmail.text.clear()
            etEmail.clearFocus()
        }
    }
}
