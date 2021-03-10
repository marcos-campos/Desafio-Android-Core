package com.example.desafioandroidcore

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class Detalhe01 : AppCompatActivity() {

    val recyclerDetalhe by lazy { findViewById<RecyclerView>(R.id.recycler_view_detalhe) }

    val nomeRest by lazy { findViewById<TextView>(R.id.tv_nomeRestaurante) }
    val imagemRest by lazy { findViewById<ImageView>(R.id.iv_imgDetalhe01) }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.detalhe_01)


        val detalheDosCardapios = adicionarItensDosCardapios()

        recyclerDetalhe.layoutManager = LinearLayoutManager(this)

        val adapterOk = ItemCardapioDetalhadoAdapter(detalheDosCardapios as MutableList<ItemCardapioDetalhado>)

        recyclerDetalhe.adapter = adapterOk


        val informacoes = intent.extras

        if (informacoes != null) {

            val nomeDoRestaurante = informacoes.getString("NOME")
            val imagemDoRestaurante = informacoes.getInt("IMAGEM")
            val restaurannteRecebido = Restaurante(nomeDoRestaurante, "", imagemDoRestaurante, "")

            nomeRest.text = restaurannteRecebido.nomeDoRestaurante
            imagemRest.setImageResource(imagemDoRestaurante)


        }else{

            Toast.makeText(this, "Error", Toast.LENGTH_LONG).show()

        }

    }


    private fun adicionarItensDosCardapios(): List<ItemCardapioDetalhado> {

        val listaPratosDoCardapio = mutableListOf<ItemCardapioDetalhado>()

        listaPratosDoCardapio.add(ItemCardapioDetalhado("Contra filé", R.drawable.prato1, R.drawable.prato2, "Filé de frango"))
        listaPratosDoCardapio.add(ItemCardapioDetalhado("Costelinha", R.drawable.prato3, R.drawable.prato4, "Feijoada"))
        listaPratosDoCardapio.add(ItemCardapioDetalhado("Churrasco", R.drawable.prato5, R.drawable.prato6, "Virada Paulista"))
        listaPratosDoCardapio.add(ItemCardapioDetalhado("Picanha", R.drawable.prato7, R.drawable.prato8, "Filé de Peixe"))


        return listaPratosDoCardapio

    }




}