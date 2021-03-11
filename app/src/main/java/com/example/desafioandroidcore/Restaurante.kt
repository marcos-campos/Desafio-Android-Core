package com.example.desafioandroidcore

import android.os.Parcelable
import java.io.Serializable


data class Restaurante (val nomeDoRestaurante: String?, val horarioFuncionamento: String?, val imagemDoRestaurante: Int,
                        val endereco: String?, val menu: ArrayList<Prato>): Serializable