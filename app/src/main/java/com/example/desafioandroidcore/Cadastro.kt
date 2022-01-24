package com.example.desafioandroidcore

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class Cadastro: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.cadastro_main)

        val nomeDoUsuario = findViewById<EditText>(R.id.et_nomeUser).text
        val sobrenomeDoUsuario = findViewById<EditText>(R.id.et_sobrenome).text
        val telefoneDoUsuario = findViewById<EditText>(R.id.et_telefone).text
        val emailDoUsuario = findViewById<EditText>(R.id.et_email).text


        val btnCadastrar = findViewById<Button>(R.id.btn_cadastrar)
        btnCadastrar.setOnClickListener {

            validacaoCadastro(nomeDoUsuario.toString(),  sobrenomeDoUsuario.toString(),
                    telefoneDoUsuario.toString(), emailDoUsuario.toString())

        }


    }

    private fun validacaoCadastro(nome: String, sobrenome: String, telefone: String, email: String) : Boolean {
        val nomeError = findViewById<EditText>(R.id.et_nomeUser)
        val sobrenomeError = findViewById<EditText>(R.id.et_sobrenome)
        val telefoneError = findViewById<EditText>(R.id.et_telefone)
        val emailError = findViewById<EditText>(R.id.et_email)

        when {
            nome.isEmpty() -> {
                Toast.makeText(this, "Nome invalido", Toast.LENGTH_SHORT).show()
                nomeError.error = "Campo obrigatório"
                return false

            }
            sobrenome.isEmpty() -> {
                Toast.makeText(this, "Sobrenome invalido", Toast.LENGTH_SHORT).show()
                sobrenomeError.error = "Campo obrigatório"
                return false

            }
            telefone.isEmpty() -> {
            Toast.makeText(this, "Telefone invalido", Toast.LENGTH_SHORT).show()
            telefoneError.error = "Campo obrigatório"
            return false

        }
            email.isEmpty() -> {
                Toast.makeText(this, "Email invalido", Toast.LENGTH_SHORT).show()
                emailError.error = "Campo obrigatório"
                return false

            } else -> {

            Toast.makeText(this, "Usuário cadastrado", Toast.LENGTH_SHORT).show()
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)

                return true



            }
        }

    }

}
