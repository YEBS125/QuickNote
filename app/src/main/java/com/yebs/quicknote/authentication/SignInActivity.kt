package com.yebs.quicknote.authentication

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.yebs.quicknote.R
import com.yebs.quicknote.general.HomeActivity

class SignInActivity : AppCompatActivity() {
    private lateinit var m_btnSignIn: Button;
    private lateinit var m_btnSignUp: Button;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.sign_in_activity)

        // Getting Controllers
        m_btnSignIn = findViewById<Button>(R.id.btnSignIn)
        m_btnSignUp = findViewById<Button>(R.id.btnSignUp)

        // Setting Up Controllers Methods
        m_btnSignIn.setOnClickListener {
            val intent = Intent(this, HomeActivity::class.java)
            startActivity(intent)
            finish()
        }

        m_btnSignUp.setOnClickListener {
            val intent = Intent(this, SignUpActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}