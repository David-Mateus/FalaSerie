package com.example.falaserie


import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import com.example.falaserie.http.HttpHelper
import com.example.falaserie.model.series
import com.google.gson.Gson





class cadastroActivity2 : AppCompatActivity() {
    @SuppressLint("CutPasteId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cadastro2)

        val btnAbriCadastro = findViewById<Button>(R.id.btn_3)
        btnAbriCadastro.setOnClickListener {
            val serieCadastra = Intent(this,serieCadastrada::class.java)
            startActivity(serieCadastra)
        }

        val buttonCadas = findViewById<Button>(R.id.btn_3)
        val buttonImage = findViewById<Button>(R.id.button)
        val editTextNome = findViewById<EditText>(R.id.editTextTextPersonName)
        val et_Description = findViewById<EditText>(R.id.editTextTextMultiLine2)

        buttonCadas.setOnClickListener {
            //Criar um objeto seire

            val serie = series()
            serie.nome = editTextNome.text.toString()
            serie.descricao = et_Description.text.toString()
            serie.capa = buttonImage.text.toString()

            // converter a serie em json
            val gson = Gson()
            val serieJson = gson.toJson(serie)

//             doAsyn {
//                val http = HttpHelper()
//                http.post(serieJson)
//            }

        }
    }
}