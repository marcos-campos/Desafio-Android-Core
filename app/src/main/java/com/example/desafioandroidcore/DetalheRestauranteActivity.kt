package com.example.desafioandroidcore

import android.os.Bundle
import android.widget.GridLayout
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class DetalheRestauranteActivity : AppCompatActivity() {

    val recyclerDetalhe by lazy { findViewById<RecyclerView>(R.id.recycler_view_detalhe) }
    val nomeRest by lazy { findViewById<TextView>(R.id.tv_nomeRestaurante) }
    val imagemRest by lazy { findViewById<ImageView>(R.id.iv_imgDetalhe01) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.detalhe_restaurante_activity)

        val informacoes = intent.extras

        if (informacoes != null) {


            val restauranteRecebido = informacoes.getSerializable("RESTAURANTE") as Restaurante

            setRecyclerView(restauranteRecebido.menu)

            nomeRest.text = restauranteRecebido.nomeDoRestaurante
            imagemRest.setImageResource(restauranteRecebido.imagemDoRestaurante)


        }else{

            Toast.makeText(this, "Error", Toast.LENGTH_LONG).show()

        }

    }

    private fun setRecyclerView(listaPratos: ArrayList<Prato>) {


        recyclerDetalhe.layoutManager = GridLayoutManager(this, 2)

        val adapterOk = ItemCardapioDetalhadoAdapter(listaPratos as MutableList<Prato>)

        recyclerDetalhe.adapter = adapterOk

    }


}