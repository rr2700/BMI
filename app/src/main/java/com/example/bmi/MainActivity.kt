package com.example.bmi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button = findViewById<Button>(R.id.bt_calculate)
        val et_height = findViewById<EditText>(R.id.et_height)
        val et_weight = findViewById<EditText>(R.id.et_weight)
        val ans= findViewById<TextView>(R.id.tv_ans)
        button.setOnClickListener(){
            val h : Float = et_height.text.toString().toFloat()
            val w : Float = et_weight.text.toString().toFloat()

            val bmi : Float = w/(h*h)

            if(bmi>20){

            }

            ans.text=bmi.toString()


        }

    }
}

