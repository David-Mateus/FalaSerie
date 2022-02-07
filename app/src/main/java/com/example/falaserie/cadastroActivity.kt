package com.example.falaserie

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class cadastroActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cadastro)

        val btnAbriCadastro = findViewById<Button>(R.id.btn_cadastrar)

        val listarSerie = findViewById<Button>(R.id.btn_pesquisar)

        listarSerie.setOnClickListener {
            val abrirlistaSerie = Intent(this,listaSerie::class.java )
            startActivity(abrirlistaSerie)
        }


        btnAbriCadastro.setOnClickListener {
            val abrirCadastro = Intent(this,cadastroActivity2::class.java)
            startActivity(abrirCadastro)
        }
    }
}