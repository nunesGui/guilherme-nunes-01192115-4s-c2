package com.example.appcachorros

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun cadastro(view: View) {

        val telaCadastro = Intent(this, CadastroCachorro::class.java)
        startActivity(telaCadastro)

    }

    fun irTelaLista(view: View) {

        val telaLista = Intent(this, ListaCachorros::class.java)
        startActivity(telaLista)
    }
}