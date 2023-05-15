package com.example.cookingapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.Spinner
import android.widget.Toast

class second_main : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second_main)
        // access the items of the list
        val languages = resources.getStringArray(R.array.Diffculty)
        var Next = findViewById<Button>(R.id.Next)

        // access the spinner
        val spinner = findViewById<Spinner>(R.id.spinner)
        if (spinner != null) {
            val adapter = ArrayAdapter(
                this,
                android.R.layout.simple_spinner_item, languages
            )
            spinner.adapter = adapter

            spinner.onItemSelectedListener = object :
                AdapterView.OnItemSelectedListener {
                override fun onItemSelected(
                    parent: AdapterView<*>,
                    view: View, position: Int, id: Long
                ) {
                    val item = null
                    Toast.makeText(
                        this@second_main,
                        getString(R.string.selected_item) + "Selected " +item,
                                "" + languages[position], Toast.LENGTH_SHORT
                    ).show()

                }
                }

                fun onNothingSelected(parent: AdapterView<*>) =
                    // write code to perform some action
               Next.setOnClickListener(View.OnClickListener { startActivity(Intent(this,third::class.java))})
            }
        }
    }
    }
