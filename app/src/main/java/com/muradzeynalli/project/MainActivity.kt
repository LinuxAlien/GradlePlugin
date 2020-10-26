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
             // For each - Her biri icin
         benimSet.forEach {
             println(it)
         }
        val digerSet = hashSetOf<String>()
        digerSet.add("Murad")
        digerSet.add("Murad")
        digerSet.forEach {
            println(it)
        }
           //Map
        println("-------Map--------")
        //Anahtar Kelime eslestirilmesi (Key-Value Pairing)
        val yemekDizisi= arrayOf("alma","et","toyuq")
        val kaloriDizisi = arrayOf(100,300,200)
       println("${yemekDizisi.get(0)}nin kalorisi:${kaloriDizisi.get(0)}")
val yemekKalorimap = hashMapOf<String, Int> ()
        yemekKalorimap.put("et",300)
        yemekKalorimap.put("alma",100)
        yemekKalorimap.put("toyuq",200)
        println(yemekKalorimap.get("et"))
        val yeniBirDizi = hashMapOf<String, Int>("deyer" to 40)   // hashMapOf () icine yazmaq isteyende  "to" ist olunur

      //Matematiksel Islemler
        println("-------Matematiksel islemler --------")
        var sayi = 10
        sayi ++
        
        println(sayi)
        var digerSayi = 100
  // && - ve , || -ve ya
        println(sayi<digerSayi && 2>3)
        println(sayi < digerSayi || 2>3)
        // Remainder Qalani tapmaq Qaliq
        println(10%3)
        println(20/6)
        println(20%6)

   // if kontrolleri
        println("-------If Statements (Eger Kontrolleri)--------")
        var score =0
        if (score<10) {
            println("Oyunu Kaybettin !")
        } else if (score <=10 && score<20){
            println("Skorun iyi Bele davam ele")
        } else if(score >= 20 && score<30) {
            println("Elasan Oyuna davam et,bacaracqsan")
        } else if(score==30) {
            println("Efsanesen !")
        } else println("Rekord Qirirsan !")

// When -Switch
        println("-------When--------")
        var notQiymeti = 3
        var notMetni = ""
        when (notQiymeti){
            0 -> notMetni="kesildin"
            1 -> notMetni="Kafi"
            2 -> notMetni=" Pis "
            3 -> notMetni="Qenaetbexsh"
            4 -> notMetni="Yaxshi"
            5 -> notMetni="Ela"
        }
             println(notMetni)

         var yeniWhen=10
         var yeniYazi= ""
         when (yeniWhen) {
             10 ->  yeniYazi = "Ela"
             5  -> yeniYazi = "Orta"
             0 -> yeniYazi = "Pis"
}
                  println(yeniYazi)
























}
}