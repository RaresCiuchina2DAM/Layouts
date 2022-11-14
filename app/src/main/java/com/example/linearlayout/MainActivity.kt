package com.example.linearlayout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

private lateinit var Botonlayout1: Button
private lateinit var Botonlayout2: Button
private lateinit var tablelayout1: Button
private lateinit var tablelayout2: Button
private lateinit var constraintlayout1: Button
private lateinit var constraintlayout2: Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Botonlayout1 = findViewById(R.id.layout01_button)
        Botonlayout2 = findViewById(R.id.layout02_button)
        tablelayout1 = findViewById(R.id.table01_button)
        tablelayout2 = findViewById(R.id.table02_button)
        constraintlayout1 = findViewById(R.id.constraint01_button)
        constraintlayout2 = findViewById(R.id.constraint02_button)


        Botonlayout1.setOnClickListener {
            setContentView(R.layout.linearlayout01)
        }

        Botonlayout2.setOnClickListener {
            setContentView(R.layout.linearlayout2)
        }

        tablelayout1.setOnClickListener {
            setContentView(R.layout.table_layout01)

        }

        tablelayout2.setOnClickListener {
            setContentView(R.layout.table_layout02)
        }

        constraintlayout1.setOnClickListener {
            setContentView(R.layout.constraint_layout01)
        }

        constraintlayout2.setOnClickListener {
            setContentView(R.layout.constraint_layout02)
        }



    }

}



