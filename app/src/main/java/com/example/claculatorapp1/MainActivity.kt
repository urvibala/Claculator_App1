package com.example.claculatorapp1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val btnPlus = findViewById<Button>(R.id.btnPlus)
        btnPlus.setOnClickListener{
            val input1 = findViewById<TextInputEditText>(R.id.input1).text.toString().toInt()
            val input2 = findViewById<TextInputEditText>(R.id.input2).text.toString().toInt()

            findViewById<TextView>(R.id.tvResult).text = (input1+input2).toString()

        }

        val btnMinus = findViewById<Button>(R.id.btnMinus)
        btnMinus.setOnClickListener{
            val input1 = findViewById<TextInputEditText>(R.id.input1).text.toString().toInt()
            val input2 = findViewById<TextInputEditText>(R.id.input2).text.toString().toInt()

            findViewById<TextView>(R.id.tvResult).text = (input1-input2).toString()

        }

        val btnMultiply = findViewById<Button>(R.id.btnMultiply)
        btnMultiply.setOnClickListener{
            val input1 = findViewById<TextInputEditText>(R.id.input1).text.toString().toInt()
            val input2 = findViewById<TextInputEditText>(R.id.input2).text.toString().toInt()

            findViewById<TextView>(R.id.tvResult).text = (input1*input2).toString()

        }

        val btnDivide = findViewById<Button>(R.id.btnDivide)
        btnDivide.setOnClickListener{
            val input1 = findViewById<TextInputEditText>(R.id.input1).text.toString().toInt()
            val input2 = findViewById<TextInputEditText>(R.id.input2).text.toString().toInt()

            findViewById<TextView>(R.id.tvResult).text = (input1/input2).toString()

        }
    }
}