package com.example.kotback

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_strprac.*

class strprac : AppCompatActivity() {
    val agerequired:Int = 18


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_strprac)

            veri.setOnClickListener {
                val userage:Int = age.text.toString().toInt()



                if (userage == agerequired){
                    able.text= "you are able".toString()
                    imagi.setImageResource(R.drawable.learning)

                }
                else if (userage > agerequired){
                    able.text= "u are able to rock sir ".toString()
                    imagi.setImageResource(R.drawable.drive)
                }

                else {
                    able.text = "u are under age for driving".toString()
                    imagi.setImageResource(R.drawable.bsdk)
                }


            }




    }
}