package com.example.desafioandroidcore

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView

class DetalheItemCardapioViewHolder(view: View) : RecyclerView.ViewHolder(view) {

    val nameDoPrato by lazy { view.findViewById<TextView>(R.id.tv_nome_do_prato01) }
    val cardViewPrato1 by lazy { view.findViewById<CardView>(R.id.card_view_prato01) }
    val cardViewPrato2 by lazy { view.findViewById<CardView>(R.id.card_view_prato02) }
    val imageItemPrato1 by lazy { view.findViewById<ImageView>(R.id.iv_imagem_do_prato01) }
    val imageItemPrato2 by lazy { view.findViewById<ImageView>(R.id.iv_imagem_do_prato_02) }
    val nameDoPrato2 by lazy { view.findViewById<TextView>(R.id.tv_nome_do_prato_02) }



}