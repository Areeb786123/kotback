package com.example.kotback

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_new_activitty.*

class newActivitty : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_new_activitty)

        cal.setOnClickListener {

            val a : Float  = value1.text.toString().toFloat()
            val  b : Float = value2.text.toString().toFloat()

            val res : Float  = a + b
             ans.text  = res.toString()

        }



    }
}