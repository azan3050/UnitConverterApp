package com.example.unitconverter

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val kilos: EditText = findViewById(R.id.editText)
        val convert: Button = findViewById(R.id.button)
        val result: TextView = findViewById(R.id.textView)

        convert.setOnClickListener {
            val kilo = kilos.text.toString().toDouble()
            result.text = ""+convertToPounds(kilo)
        }
    }

    private fun convertToPounds(kilos: Double): Double {
        return kilos * 2.20462
    }
}