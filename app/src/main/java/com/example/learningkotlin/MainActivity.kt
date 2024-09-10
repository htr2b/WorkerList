package com.example.learningkotlin

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val Onur = Worker("Onur",20000,"Backend",21)
        val Ali = Worker("Ali",20000,"Sale",21)
        val Burak = Worker("Burak",20000,"Finance",21)
        val Adnan = Worker("Adnan",20000,"Backend",21)
        val Salih = Worker("Salih",20000,"Sale",32)
        val Meric = Worker("Meriç",20000,"Finance",33)
        val Arif = Worker("Arif",20000,"Sale",43)
        val Mert = Worker("Mert",20000,"Backend",24)
        val Bulent = Worker("Bülent",20000,"Finance",55)
        val workers = arrayListOf(Onur,Ali,Burak,Adnan,Salih,Meric,Arif,Mert,Bulent)
        val question7 = workers.filter { it.age < 25 }.map { it.name }
        question7.forEach{println(it)}
        println("---------------")
        val question6 = workers.filter { it.age >30 }.filter { it.department == "Finance" }.map { it.name }
        question6.forEach{println(it)}

    }
}