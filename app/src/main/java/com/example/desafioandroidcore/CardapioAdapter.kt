package com.example.desafioandroidcore

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class CardapioAdapter(val listaCardapios: MutableList<Restaurante>) : RecyclerView.Adapter<CardapioViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardapioViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.card_restaurantes, parent, false)
        return  CardapioViewHolder(view)

    }

    override fun getItemCount(): Int = listaCardapios.size



    override fun onBindViewHolder(holder: CardapioViewHolder, position: Int) {

        val nameItemOk = holder.nameItem
        nameItemOk.text = listaCardapios[position].nomeDoRestaurante

        val valuerItemOk = holder.valuerItem
        valuerItemOk.text = listaCardapios[position].horarioFuncionamento

        val imageItemOk = holder.imageItem
        imageItemOk.setImageResource(listaCardapios[position].imagemDoRestaurante)

        val enderecoItemOk = holder.enderecoItem
        enderecoItemOk.text = listaCardapios[position].endereco


        holder.itemView.setOnClickListener {
            val intent = Intent(it.context, DetalheRestauranteActivity::class.java)

            intent.putExtra("RESTAURANTE", listaCardapios[position])
            it.context.startActivity(intent)


        }



    }


}