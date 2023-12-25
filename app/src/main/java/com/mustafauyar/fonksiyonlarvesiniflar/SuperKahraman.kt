package com.mustafauyar.fonksiyonlarvesiniflar

class SuperKahraman(var isim:String="",var meslek:String="",var yas:Int=0) {
    private var sacininRengi = "Sarı"
    fun testFunc(){
        println("test")
    }
    fun sacRengiAl():String{
        //pythonda getter gibi çalışır
        return this.sacininRengi
    }
    // Primary Constructor
    //Access Levels
    //private - protected - internal - public

    /*
    //Property
    var isim = ""
    var meslek = ""
    var yas:Int=0
    //Constructor
    constructor(isim_:String="",meslek_:String="",yas_:Int=0){
        isim = isim_;meslek=meslek_;yas=yas_
        this.isim = isim_
        this.yas = yas_
        this.meslek = meslek_//bu pythondaki self e benziyor this yapısı
    }
     */
}
fun main(){
    val s1 = SuperKahraman("superman","gazateci",55)
    println(s1.sacRengiAl())
    s1.testFunc()
}