package com.nkodem.haslozpodpowiedzi

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.Sprawdź).setOnClickListener {
            var password = findViewById<TextInputEditText>(R.id.Hasło).text.toString()
            var potwierdź = findViewById<TextInputEditText>(R.id.Potwierdź).text.toString()

            if (password == potwierdź){
                findViewById<ImageView>(R.id.imageView).setImageResource(android.R.drawable.checkbox_on_background)
            }
                else{
                findViewById<ImageView>(R.id.imageView).setImageResource(android.R.drawable.checkbox_off_background)}
        }
    }
}