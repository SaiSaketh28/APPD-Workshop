package com.example.saisakethtask_1

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btn:Button=findViewById(R.id.btn_submit)
        btn.setOnClickListener {
            Toast.makeText(this, "submitted", Toast.LENGTH_LONG).show()
        }

    }
}