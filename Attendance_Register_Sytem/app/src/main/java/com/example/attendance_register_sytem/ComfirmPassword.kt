package com.example.attendance_register_sytem

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class ComfirmPassword : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_comfim_password)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.backbutton)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val backbtn = findViewById<Button>(R.id.backbtn)

        backbtn.setOnClickListener{
            val intent3 = Intent(this, AccountPage::class.java)
            startActivity(intent3)
        }

    }
}