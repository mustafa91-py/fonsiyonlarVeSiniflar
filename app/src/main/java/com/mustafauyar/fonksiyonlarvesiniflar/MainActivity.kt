package com.mustafauyar.fonksiyonlarvesiniflar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun cikarma(x:Int,y:Int){
        println("ilk fonksiyon çalıştı")
    }
}