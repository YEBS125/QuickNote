package com.yebs.quicknote.authentication

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.yebs.quicknote.R
import com.yebs.quicknote.general.HomeActivity

class SignUpActivity : AppCompatActivity() {
    private lateinit var m_btnSignUp: Button;
    private lateinit var m_btnSignIn: Button;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.sign_up_activity)

        // Getting Controllers
        m_btnSignUp = findViewById<Button>(R.id.btnSignUp)
        m_btnSignIn = findViewById<Button>(R.id.btnSignIn)

        // Setting Up Controllers Methods
        m_btnSignUp.setOnClickListener {
            val intent = Intent(this, HomeActivity::class.java)
            startActivity(intent)
            finish()
        }

        m_btnSignIn.setOnClickListener {
            val intent = Intent(this, SignInActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}