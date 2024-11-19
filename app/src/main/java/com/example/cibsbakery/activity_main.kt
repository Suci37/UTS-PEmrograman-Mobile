package com.example.cibsbakery

import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import android.widget.Toast

class activity_main : AppCompatActivity() {

    private lateinit var usernameInput: EditText
    private lateinit var passwordInput: EditText
    private lateinit var loginBtn: Button
    private lateinit var registerText: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
            usernameInput = findViewById(R.id.username_input)
            passwordInput = findViewById(R.id.password_input)
            loginBtn = findViewById(R.id.login_btn)
            registerText  = findViewById(R.id.register_text)

            loginBtn.setOnClickListener {
                val username = usernameInput.text.toString()
                val password = passwordInput.text.toString()
                Log.i("LoginActivity", "username : $username and password : $password")
                if (username.isEmpty()||password.isEmpty()){
                    Toast.makeText(this, "Username tidak boleh koksong", Toast.LENGTH_SHORT).show()}
                else{
                    Toast.makeText(this, "Login berhasil", Toast.LENGTH_SHORT).show()}
            }
            registerText.setOnClickListener{
                Toast.makeText(this, "Pindah ke halaman register", Toast.LENGTH_SHORT).show()
        }
    }
}

