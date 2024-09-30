package com.example.attendance_register_sytem

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class AccountPage : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_account_page)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.account)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val cancelbtn = findViewById<Button>(R.id.cancelbtn)

        cancelbtn.setOnClickListener{
            val intent1 = Intent(this, MainActivity::class.java)
            startActivity(intent1)
        }

        val nextbtn = findViewById<Button>(R.id.nextbtn)
        nextbtn.setOnClickListener{
            val intent2 = Intent(this, ComfirmPassword::class.java)
            startActivity(intent2)
        }

    }
}