package com.example.desafioandroidcore

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class Cardapio : AppCompatActivity() {

    val recycler by lazy { findViewById<RecyclerView>(R.id.recycler_view) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.cardapio01)

        val cardapios = adicionarItens()

        recycler.layoutManager = LinearLayoutManager(this)

        val adapter = CardapioAdapter(cardapios as MutableList<Restaurante>)

        recycler.adapter = adapter

    }

    private fun adicionarItens(): List<Restaurante> {
        val listaCardapio = mutableListOf<Restaurante>()

        listaCardapio.add(Restaurante("Restaurante João Dias", "Fecha as 22:00", R.drawable.restaurante, "Avenida João Dias, 1050"))
        listaCardapio.add(Restaurante("McDonald's", "Fecha as 00:00", R.drawable.mcdonalds, "Avenida das Nações Unidas, 686"))
        listaCardapio.add(Restaurante("Subway", "Fecha as 23:00", R.drawable.subway, "Marginal Pinheiros, 2387"))
        listaCardapio.add(Restaurante("Burger King", "Fecha as 00:00", R.drawable.burgerking, "Rua Carmo do Rio Verde, 240"))
        listaCardapio.add(Restaurante("KFC", "Fecha as 00:00", R.drawable.kfcok, "Rua Coronel L. Barroso, 80"))

        return listaCardapio

    }

}

