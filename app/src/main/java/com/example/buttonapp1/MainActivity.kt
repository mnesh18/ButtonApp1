 package com.example.buttonapp1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

 class MainActivity : AppCompatActivity() {

     lateinit var myText: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var myText = findViewById<TextView>(R.id.firstTV)
        myText.text = "Home Sweet Home"
        changText()
    }

     fun changText(){
         myText.text = "Back"
     }
}