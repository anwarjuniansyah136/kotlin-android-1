package com.example.myapplication

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {
//    var angkaBulat:Int = 1
//
//    fun hitung(){
//        angkaBulat++
//    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
//        val textView:TextView = findViewById(R.id.text_view)
//        val btnHitung: Button = findViewById(R.id.btn_hitung)
//
//        btnHitung.setOnClickListener{
//            hitung()
//            textView.text = angkaBulat.toString()
//        }
        val mainLayout: ConstraintLayout = findViewById(R.id.main_layout)
//        val editText: EditText = findViewById(R.id.edit_text)
        val btnClick : Button = findViewById(R.id.btn_click)
        val btnSecond : Button = findViewById(R.id.btn_second)

        btnClick.setOnClickListener{
//            EXPLICIT INTENT
            val intent = Intent(this,SecondActivity::class.java)
            intent.putExtra("text","ini adalah data text saya")
            startActivity(intent)
//            val teks:String = editText.text.toString()
//            val builder = AlertDialog.Builder(this)
//            builder.setTitle("MyApp")
//            builder.setMessage(teks)
//            builder.setPositiveButton("Tutup"){
//                dialog,which ->
//                dialog.dismiss()
//            }
//            val dialog = builder.create()
//            dialog.show()
//            Snackbar.make(mainLayout,teks,Snackbar.LENGTH_LONG).show()
//            Toast.makeText(applicationContext,teks,Toast.LENGTH_SHORT).show()
        }
//        btnSecond.setOnClickListener{
//            IMPLICIT INTENT
//            val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://trisnasejati.com"))
//            if(intent.resolveActivity(packageManager) != null){
//                startActivity(intent)
//            }
//            else{
//                Toast.makeText(applicationContext,"Tidak ada aplikasi yg support",Toast.LENGTH_SHORT).show()
//            }
//        }
        btnSecond.setOnClickListener{
            val intent = Intent().apply {
                action = Intent.ACTION_SEND
                type = "text/plain"
            }
            intent.putExtra(Intent.EXTRA_TEXT,"Hai,ini adalah kiriman")
            if(intent.resolveActivity(packageManager) != null){
                startActivity(intent)
            }
            else{
                Toast.makeText(applicationContext,"Tidak ada aplikasi yg support",Toast.LENGTH_SHORT).show()
            }
        }
    }
}