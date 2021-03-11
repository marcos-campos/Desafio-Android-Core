package com.example.desafioandroidcore

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class ItemCardapioDetalhadoAdapter(val listaDePratos: MutableList<Prato>) : RecyclerView.Adapter<DetalheItemCardapioViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DetalheItemCardapioViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.detalhe_card_ultimo, parent, false)
        return DetalheItemCardapioViewHolder(view)

    }

    override fun getItemCount(): Int = listaDePratos.size


    override fun onBindViewHolder(holder: DetalheItemCardapioViewHolder, position: Int) {

        val nameDoPrato = holder.nameDoPrato
        nameDoPrato.text = listaDePratos[position].nomeDoPrato

        val imagemDoPratoOk = holder.imageItemPrato1
        imagemDoPratoOk.setImageResource(listaDePratos[position].imagemDoPrato)

//        val imagemDoPrato2Ok = holder.imageItemPrato2
//        imagemDoPrato2Ok.setImageResource(listaDePratos[position+1].imagemDoPrato)
//
//        val nameDoPrato2 = holder.nameDoPrato2
//        nameDoPrato2.text = listaDePratos[position+1].nomeDoPrato

    }

}

