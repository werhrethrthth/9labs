package com.example.laborotorn9

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.randomnum.R
import kotlin.random.Random

class RandomNum2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_random_num2)
        showRandomNumber()
    }
    fun showRandomNumber(){
        val random = Random.nextInt(0,500)
        val randomInt = Random.nextInt(0,random)
        val textViewRandom : TextView = findViewById(R.id.textView_random2)
        val textViewLabel : TextView = findViewById(R.id.textView_label)

        textViewRandom.text= randomInt.toString()
        textViewLabel.text= getString(R.string.textRandom2,random)
    }
}