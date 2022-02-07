package com.example.falaserie

import android.os.AsyncTask
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.loader.content.AsyncTaskLoader
import com.example.falaserie.http.HttpHelper

class listaSerie : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lista_serie)

        //doAsync{
        //    val http = HttpHelper()
        //    http.get()
        //}
    }
}