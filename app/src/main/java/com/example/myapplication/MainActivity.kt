package com.example.myapplication

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout)

        val alasField = findViewById<EditText>(R.id.alasField)
        val tinggiField = findViewById<EditText>(R.id.tinggiField)
        val hasilField = findViewById<EditText>(R.id.hasilField)
        val hitungButton = findViewById<Button>(R.id.hitungButton)

        hitungButton.setOnClickListener {
            val alasText = alasField.text.toString()
            val tinggiText = tinggiField.text.toString()

            if (alasText.isEmpty() || tinggiText.isEmpty()) {
                Toast.makeText(this, "Silakan masukkan nilai alas dan tinggi", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            val alas = alasText.toDoubleOrNull()
            val tinggi = tinggiText.toDoubleOrNull()

            if (alas != null && tinggi != null) {
                val luas = 0.5 * alas * tinggi
                hasilField.setText(luas.toString())
            } else {
                Toast.makeText(this, "Input tidak valid", Toast.LENGTH_SHORT).show()
            }
        }
    }
}
