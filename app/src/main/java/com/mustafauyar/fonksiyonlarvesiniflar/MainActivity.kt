package com.mustafauyar.fonksiyonlarvesiniflar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        cikarma(10,20)
        var topla = toplama(18,17)
        textView4().textSize = 24.0f//ekrana sığması için boyutu değiştir
        textView4().text = "toplama sunucu : $topla"//toplamanın sonucunu emülatörde göster

    }
    fun textView4():TextView{
        // sürekli aynı widget i çağırmak için oluşturulan textView fonskiyoyunu ekrana yazdırmak için
        val textView: TextView = findViewById(R.id.textView4)
        return textView
    }
    fun cikarma(x: Int, y: Int) {
        val myText = textView4()

        myText.text = "sonuç : ${x-y}"
        println("ilk fonksiyon çalıştı")
    }
    fun toplama(x:Int,y:Int):Int{
        return x+y
    }
}
