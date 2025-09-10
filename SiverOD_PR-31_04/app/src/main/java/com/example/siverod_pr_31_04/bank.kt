package com.example.siverod_pr_31_04

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class bank : AppCompatActivity() {
    private lateinit var login: EditText
    private lateinit var password: EditText
    private lateinit var button: Button
    private val name = "myPref"
    private val keyLogin = "myKeyLogin"
    private val keyPassword = "myKeyPassword"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.bank)

        login = findViewById(R.id.login)
        password = findViewById(R.id.password)
        button = findViewById(R.id.button)
    }

    fun enter(view: View) {
        val log = login.text.toString().trim()
        val pas = password.text.toString().trim()
        val prefs = getSharedPreferences(name, Context.MODE_PRIVATE)
        val saveLog = prefs.getString(keyLogin,null)
        val savePas = prefs.getString(keyPassword,null)
        if(saveLog == null || savePas == null){
            if(log.isEmpty() || pas.isEmpty()){
                Toast.makeText(this,"Введите логин и пароль", Toast.LENGTH_SHORT).show()
                return
            }
        }
    }
}