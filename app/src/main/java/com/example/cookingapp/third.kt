package com.example.cookingapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class third : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_third)
        var muffin = findViewById<Button>(R.id.muffin )
        var chicken = findViewById<Button>(R.id.chicken)
        var pasta = findViewById<Button>(R.id.pasta)


        muffin.setOnClickListener(View.OnClickListener { startActivity(Intent(this,muffin::class.java))})
        chicken.setOnClickListener(View.OnClickListener { startActivity(Intent(this,Baked_chicken::class.java))})
        pasta.setOnClickListener(View.OnClickListener { startActivity(Intent(this,Pasta::class.java))})
    }

        }




