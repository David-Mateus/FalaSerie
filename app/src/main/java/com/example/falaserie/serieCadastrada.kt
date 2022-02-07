package com.example.falaserie

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class serieCadastrada : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_serie_cadastrada)


        val btnAbriCadastro = findViewById<Button>(R.id.btn_go)
        btnAbriCadastro.setOnClickListener {
            val serieCadastra = Intent(this,cadastroActivity::class.java)
            startActivity(serieCadastra)
        }


    }
}