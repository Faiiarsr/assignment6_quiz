package com.example.assignment6_quiz

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

var faii2 = "faii"
class MainActivity4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main4)
        button .setOnClickListener {
            val intent = Intent(this,MainActivity5::class.java)
            intent.putExtra(faii,"ผิดดดดด!!")
            startActivity(intent)
        }
        button2 .setOnClickListener {
            val intent = Intent(this,MainActivity2::class.java)
            intent.putExtra(faii,"ผิดดดดด!!")
            startActivity(intent)
        }
        button3 .setOnClickListener {
            val intent = Intent(this,MainActivity4::class.java)
            intent.putExtra(faii,"ผิดดดดด!!")
            startActivity(intent)
        }
        button4 .setOnClickListener {
            val intent = Intent(this,MainActivity5::class.java)
            intent.putExtra(faii,"ถูกกกกก!!")
            startActivity(intent)
        }
    }
}