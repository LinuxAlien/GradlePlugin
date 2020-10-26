package com.muradzeynalli.project

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



fun button(view : View) {

    }
           //degsiken
        println("-------degisken--------")
        var x = 5
        var y = 3
        //double,float
        var benimDouble =5.0
        var benimFloat : Float = 2.5f

        // string --metin
        println("-------String--------")

        val benimString = "murad"
        println( benimString.length)
        val ad = "Murad"
        val soyad = "Zeynalli"
        val adsoyad = ad + " " + soyad
        println(adsoyad)
        var benimBoolean = true
        benimBoolean = false
        println(5<4)
        // Veri tipi donushturme
        println("-------Veri Tipi Donusturme --------")
        val menimint = 10
        val intdenlonga = menimint.toLong()
        val kullaniciGirdisi = "10"
        val kullanicInt = kullaniciGirdisi.toInt()
        println(kullanicInt / 2 )
        // array dizi
        println("-------Array--------")
        val aile =4

        val arrayMeselen = arrayOf(aile,"Murad","Zabil","Xuraman","Ferid")
        // index
        println("-------Index--------")
        println( arrayMeselen [3] )
        println(arrayMeselen.get(4))
        arrayMeselen[2] = "ata"
        println(arrayMeselen.get(2))
        arrayMeselen.set(2,"miti" )
        println(arrayMeselen.get(2))
        val numaradizisi = arrayOf(1,3,5,7,9)
        println(numaradizisi.get(2))
        val karisikDizi = arrayOf("Murad",24,1.5,true,false)
        println(karisikDizi.get(2))
        // arraylist-listeler
        println("-------ArrayList--------")
        val isimListesi = arrayListOf("Murad" , "Zabil", "Xuraman" , "Ferid" )
        println(isimListesi.get(0))
        isimListesi.add("Miti")
        isimListesi.add("Piti")
        println (isimListesi.get(5))
     val karisikarraylist = arrayListOf<Any>("Murad","Canavar")
        println(karisikarraylist.get (1))
      val intarrayList = arrayListOf<Int>()
        intarrayList.add(20)
        println(intarrayList.get(0))
        //Set
        println("-------Set--------")
        val ornekDizi = arrayOf("Murad","Zabil","Ferid","Xuraman")
        println("Index 3 : ${ornekDizi.get(3)}")
        val benimSet = setOf<Int>(5,6,7,7,8)
            println(benimSet.size)




}
}

