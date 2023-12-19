package com.example.laborotorn9

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.randomnum.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun randomMe(view: View){
        val randomIntent = Intent(this,RandomNum2:: class.java)
        startActivity(randomIntent)
    }
}