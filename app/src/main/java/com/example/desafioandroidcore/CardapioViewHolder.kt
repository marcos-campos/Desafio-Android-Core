package com.example.desafioandroidcore

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView

class CardapioViewHolder(view: View) : RecyclerView.ViewHolder(view) {

    val nameItem by lazy { view.findViewById<TextView>(R.id.tv_descricao) }
    val valuerItem by lazy { view.findViewById<TextView>(R.id.tv_horario) }
    val cardView by lazy {view.findViewById<CardView>(R.id.card_view)}
    val imageItem by lazy {view.findViewById<ImageView>(R.id.iv_imagem)}
    val enderecoItem by lazy {view.findViewById<TextView>(R.id.tv_endereco)}


}