package com.example.aulatemas

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        var btnEnviar:Button = findViewById(R.id.btnEnviar)
        var email:EditText = findViewById(R.id.editTxtEmail)
        var txtResultado:TextView = findViewById(R.id.txtResultado)

        btnEnviar.setOnClickListener{
            var emailUsuario:String = email.getText().toString()
            println("Email digitado: ${emailUsuario}")
            txtResultado.setText("Email digitado: ${emailUsuario}")
        }




    }
}