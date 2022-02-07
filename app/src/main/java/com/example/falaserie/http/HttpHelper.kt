package com.example.falaserie.http

import okhttp3.MediaType
import okhttp3.OkHttpClient
import okhttp3.Request
import okhttp3.RequestBody

class HttpHelper {
    fun post( json: String) : String{

        //Post URL
        val URL = "http://192.168.1.8:series.audax.mobi/api/series"

        //Definir o cabeçalho
        val headerHttp = MediaType.parse("application/json; charset = utf-8")

        //Criar uma serie que vai disparar a requisição
        val serie = OkHttpClient()

        //Criar o body da requisição
        val body = RequestBody.create(headerHttp, json)

        //Construir a requisição POST http para o servidor
        var request = Request.Builder().url(URL).post(body).build()

        //Utilizar serie para fazer a requicição e receber a resposta
        val response = serie.newCall(request).execute()

        return  response.body().toString()

    }

    fun gent(){
        //URL do servidor
        val URL = "http://192.168.1.8:series.audax.mobi/api/series"
        //cliente
        val serie = OkHttpClient()

        //criar uma requisição get
        val request = Request.Builder().url(URL).get().build()

        // enivar a requisição para o servidor
        val response = serie.newCall(request).execute()

        // extrar a resposta da requisição
        val responseBody = response.body()

        // exibir o body da requisição
        if(responseBody != null){
            val json = responseBody.string()
        }
    }

}