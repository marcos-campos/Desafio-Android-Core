package com.example.desafioandroidcore

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class ListaRestauranteActivity : AppCompatActivity() {

    val recycler by lazy { findViewById<RecyclerView>(R.id.recycler_view) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.lista_restaurante_activity)

        val cardapios = adicionarItens()

        recycler.layoutManager = LinearLayoutManager(this)

        val adapter = CardapioAdapter(cardapios as MutableList<Restaurante>)

        recycler.adapter = adapter

    }

    private fun adicionarItens(): List<Restaurante> {
        val listaRestaurantes = mutableListOf<Restaurante>()

        listaRestaurantes.add(Restaurante("João Dias", "Fecha as 22:00", R.drawable.restauranteee, "Avenida João Dias, 1050", fazerMenu1()))
        listaRestaurantes.add(Restaurante("McDonald's", "Fecha as 00:00", R.drawable.mcdonalds, "Avenida das Nações Unidas, 686", fazerMenu2()))
        listaRestaurantes.add(Restaurante("Subway", "Fecha as 23:00", R.drawable.sub, "Marginal Pinheiros, 2387", fazerMenu3()))
        listaRestaurantes.add(Restaurante("Burger King", "Fecha as 00:00", R.drawable.bklogo, "Rua Carmo do Rio Verde, 240", fazerMenu4()))
        listaRestaurantes.add(Restaurante("KFC", "Fecha as 00:00", R.drawable.kfclogo, "Rua Coronel L. Barroso, 80", fazerMenu5()))

        return listaRestaurantes

    }

    private fun fazerMenu1(): ArrayList<Prato> {
        val listaPratos = arrayListOf<Prato>()

        listaPratos.add(Prato("Contra filé", R.drawable.prato1))
        listaPratos.add(Prato("Costelinha", R.drawable.prato2))
        listaPratos.add(Prato("Churrasco", R.drawable.prato3))
        listaPratos.add(Prato("Peixe e Bife", R.drawable.prato4))
        listaPratos.add(Prato("Feijoada", R.drawable.prato5))
        listaPratos.add(Prato("Bisteca", R.drawable.prato6))
        listaPratos.add(Prato("Vegetariano", R.drawable.prato7))
        listaPratos.add(Prato("Picanha", R.drawable.prato9))


        return listaPratos

    }

    private fun fazerMenu2(): ArrayList<Prato> {
        val listaPratos = arrayListOf<Prato>()

        listaPratos.add(Prato("Mc Humburger Duplo", R.drawable.mc10))
        listaPratos.add(Prato("Mc Egg Extra", R.drawable.mc2))
        listaPratos.add(Prato("Big Tasty", R.drawable.mc12))
        listaPratos.add(Prato("Mc Furios Chicken", R.drawable.mc4))
        listaPratos.add(Prato("Chicken Supremo", R.drawable.mc05))
        listaPratos.add(Prato("Extra Chicken", R.drawable.mc11))
        listaPratos.add(Prato("Mc Duplo Chicken", R.drawable.mc09))
        listaPratos.add(Prato("Big Tasty Turbo", R.drawable.mc08))

        return listaPratos

    }

    private fun fazerMenu3(): ArrayList<Prato> {
        val listaPratos = arrayListOf<Prato>()

        listaPratos.add(Prato("Carne Supreme", R.drawable.sub04))
        listaPratos.add(Prato("Carne Cream Cheese", R.drawable.sub05))
        listaPratos.add(Prato("B.M.T.® Italiano", R.drawable.sub001))
        listaPratos.add(Prato("Vegetariano", R.drawable.sub003))
        listaPratos.add(Prato("Steak Cheddar", R.drawable.sub005))
        listaPratos.add(Prato("Sub Vegg", R.drawable.sub006))
        listaPratos.add(Prato("Frango Ranch", R.drawable.sub007))
        listaPratos.add(Prato("Frango Teriyaki", R.drawable.sub008))

        return listaPratos

    }

    private fun fazerMenu4(): ArrayList<Prato> {
        val listaPratos = arrayListOf<Prato>()

        listaPratos.add(Prato("Combo Saudável", R.drawable.bk10))
        listaPratos.add(Prato("Cheeseburger Duplo", R.drawable.bk2))
        listaPratos.add(Prato("Chicken Chrisp", R.drawable.bk001))
        listaPratos.add(Prato("Steack Duplo", R.drawable.bk9))
        listaPratos.add(Prato("Big King", R.drawable.bk14))
        listaPratos.add(Prato("Whopper Furioso", R.drawable.bk15))
        listaPratos.add(Prato("Mega Stacker", R.drawable.bk011))
        listaPratos.add(Prato("Whopper Rodeio", R.drawable.bk015))

        return listaPratos

    }

    private fun fazerMenu5(): ArrayList<Prato> {
        val listaPratos = arrayListOf<Prato>()

        listaPratos.add(Prato("Gran Catupiry Bacon", R.drawable.kfc001))
        listaPratos.add(Prato("Gran BBQ Bacon", R.drawable.kfc002))
        listaPratos.add(Prato("Double Crunch", R.drawable.kfc003))
        listaPratos.add(Prato("Kentucky Chicken", R.drawable.kfc004))
        listaPratos.add(Prato("Crocante", R.drawable.kfc005))
        listaPratos.add(Prato("Cheddar Melt", R.drawable.kfc006))
        listaPratos.add(Prato("Double Crunch BBQ", R.drawable.kfc007))
        listaPratos.add(Prato("Double Crunch Bacon", R.drawable.kfc008))

        return listaPratos

    }







}

