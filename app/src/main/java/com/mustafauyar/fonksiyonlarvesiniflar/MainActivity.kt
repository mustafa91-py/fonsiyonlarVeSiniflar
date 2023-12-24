package com.mustafauyar.fonksiyonlarvesiniflar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        cikarma(10,20)

    }

    fun cikarma(x: Int, y: Int) {
        val textView: TextView = findViewById(R.id.textView4)
        textView.text = "sonuç : ${x-y}"
        println("ilk fonksiyon çalıştı")
    }
}
