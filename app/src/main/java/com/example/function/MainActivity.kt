package com.example.function

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var j = 1
        if (j == 0){
            ilkFonksiyon()
        } else {
            ikinciFonksiyon()
        }

    }
    fun ilkFonksiyon() {
        println("Ilk Function  Calistirildi! ")
    }
    fun ikinciFonksiyon(){
        println("Ikinci Function Calistirildi !")
    }


}