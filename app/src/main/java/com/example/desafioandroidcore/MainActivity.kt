package com.example.desafioandroidcore

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import java.util.regex.Matcher
import java.util.regex.Pattern

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnRegistrar = findViewById<Button>(R.id.button_register)
        btnRegistrar.setOnClickListener {
            val intent = Intent(this, Cadastro::class.java)
            startActivity(intent)
        }

        val etUser = findViewById<EditText>(R.id.et_user)
        val etPass = findViewById<EditText>(R.id.et_password)

        val btnLogin = findViewById<Button>(R.id.btn_login)

        btnLogin.setOnClickListener {


            if (validacao(etUser.text.toString(), etPass.text.toString())){

                val intent = Intent(this, ListaRestauranteActivity::class.java)
                startActivity(intent)

            } else {

            Toast.makeText(this, "A senha tem que ter letra maiuscula, minuscula, número e um caracter especial", Toast.LENGTH_LONG).show()
        }

        }
    }


    private fun validacao(nome: String, senha: String) : Boolean {

        val userError = findViewById<EditText>(R.id.et_user)
        val passError = findViewById<EditText>(R.id.et_password)

        when {
            nome.isEmpty() -> {
                Toast.makeText(this, "Email invalido", Toast.LENGTH_SHORT).show()
                userError.error = "Campo obrigatório"

                return false

            }
            senha.isEmpty() -> {
                Toast.makeText(this, "Senha invalida", Toast.LENGTH_SHORT).show()
                passError.error = "Campo obrigatório"
                return false

            }
            else -> {

                return passwordValidation(senha)

            }
        }

    }

    private fun passwordValidation(password: String): Boolean {
        return if (password.length > 1) {
            val letter: Pattern = Pattern.compile("[a-zA-z]")
            val digit: Pattern = Pattern.compile("[0-9]")
            val special: Pattern = Pattern.compile("[!@#$%&*()_+=|<>?{}\\[\\]~-]")
            val hasLetter: Matcher = letter.matcher(password)
            val hasDigit: Matcher = digit.matcher(password)
            val hasSpecial: Matcher = special.matcher(password)
            hasLetter.find() && hasDigit.find() && hasSpecial.find()
        } else false
    }

}