package com.example.falaserie.model

class series {
    var nome = ""
    var descricao = ""
    var capa = ""
    override fun toString(): String {
        return "series(nome='$nome', descricao='$descricao', capa='$capa')"
    }

}