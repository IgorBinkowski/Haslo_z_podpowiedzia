package com.nkodem.haslozpodpowiedzi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.Sprawdź).setOnClickListener {
            var password = findViewById<TextInputEditText>(R.id.Hasło).text.toString()
            var potwierdź = findViewById<TextInputEditText>(R.id.Potwierdź).text.toString()
            if (password == potwierdź){
                findViewById<TextView>(R.id.textView).text = "Hasła: Zgodne"}
            else {
                findViewById<TextView>(R.id.textView).text = " Hasła: Niezgodne"}
        }
    }
    }
}