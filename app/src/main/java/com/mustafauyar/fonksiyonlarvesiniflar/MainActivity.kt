package com.mustafauyar.fonksiyonlarvesiniflar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        cikarma(10,20)
        var topla = toplama(18,17)
        var candleToButton2 = 0
        textView4().textSize = 24.0f//ekrana sığması için boyutu değiştir
        textView4().text = "toplama sunucu : $topla"//toplamanın sonucunu emülatörde göster
        button2Widget().setOnClickListener {
            if (candleToButton2 == 4){
                textView4().text = "mum kalmadı !"
            }
            else {
                textView4().text = "alltaki butonun\n"+
                        "$candleToButton2 mumdur ${candleToButton2+1} mumdur ..."

                candleToButton2 ++//mum sayısını arttır
            }

        }

    }
    fun textView4():TextView{
        // sürekli aynı widget i çağırmak için oluşturulan textView fonskiyoyunu ekrana yazdırmak için
        val textView: TextView = findViewById(R.id.textView4)
        return textView
    }
    fun buttonWidget():View{
        val button:View = findViewById(R.id.button)
        return button

    }
    fun button2Widget():View{
        val button2:View = findViewById(R.id.button2)
        return button2
    }
    fun cikarma(x: Int, y: Int) {
        val myText = textView4()

        myText.text = "sonuç : ${x-y}"
        println("ilk fonksiyon çalıştı")
    }
    fun toplama(x:Int,y:Int):Int{
        return x+y
    }
    fun degistir(view:View){
        val toplamaSonucu = toplama(50,10)
        textView4().text = "toplama sonucu : $toplamaSonucu"
        sinifCalismasi()
    }
    fun sinifCalismasi(){
        var superman = SuperKahraman()
        superman.isim = "süpermen"
        superman.meslek = "gazeteci"
        superman.yas = 49
        var batman = SuperKahraman()
        batman.isim = "batman"
        batman.meslek = "zengin"
        batman.yas = 45

        var outText = "${superman.isim} + ${batman.isim} = baydırman"
        textView4().text = outText
    }
}
