package com.example.myapplication

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.myapplication.fragment.FirstFragment

class SecondActivity : AppCompatActivity() {
    private val dataString:String = "Hai ini adalah string"

    @SuppressLint("CommitTransaction")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        enableEdgeToEdge()
        setContentView(R.layout.activity_second)
//        val textView:TextView = findViewById(R.id.text)
//        if(intent.hasExtra("text")){
//            textView.text = intent.getStringExtra("text")
//        }else{
//            Toast.makeText(applicationContext,"Tidak ada Data",Toast.LENGTH_SHORT)
//        }
//        val transaction = supportFragmentManager.beginTransaction()
//        val firstFragment = FirstFragment.sendData(dataString)
//
//        transaction.replace(R.id.fragment_container,firstFragment)
//        transaction.commit()
    }
}