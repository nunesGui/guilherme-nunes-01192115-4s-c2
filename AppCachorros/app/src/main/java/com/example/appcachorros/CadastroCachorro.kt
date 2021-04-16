package com.example.appcachorros

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Switch
import com.example.appcachorros.conexoes.Api
import com.example.appcachorros.domain.Cachorro


class CadastroCachorro : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cadastro_c_achorro)
    }

    fun cadastrar(view: View) {
        val apiCachorro = Api.criar()

        val raca:EditText = findViewById(R.id.et_raca)
        val precoMedio:EditText = findViewById(R.id.et_preco)
        val indicavel:Switch = findViewById(R.id.sw_indicacao)

        val racaConvertida = raca.text.toString()
        val precoMedioConvertido = precoMedio.text.toString().toDouble()
        val indicavelConvertido = indicavel.text.toString().toBoolean()

        val cachorroNovo = Cachorro( racaConvertida, precoMedioConvertido, indicavelConvertido)



    }
}