package com.conamobile.photoactivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var photoActivity = findViewById<Button>(R.id.photo_activity_intent)
        photoActivity.setOnClickListener {
            startActivity(Intent(this, PhotoActivity::class.java))
        }
    }
}