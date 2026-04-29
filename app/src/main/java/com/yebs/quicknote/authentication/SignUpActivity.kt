package com.yebs.quicknote.authentication

import android.content.ContentValues
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.yebs.quicknote.DataBaseHelper
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

            val txtUserName = findViewById<EditText>(R.id.txtUser)
            val txtEmail = findViewById<EditText>(R.id.txtEmail)
            val txtPassword = findViewById<EditText>(R.id.txtPassword)
            val txtConfirmPassword = findViewById<EditText>(R.id.txtConfirmPassword)

            val user_name = txtUserName.text.toString()
            val email = txtEmail.text.toString()
            val password = txtPassword.text.toString()
            val confirm_password = txtConfirmPassword.text.toString()

            if (user_name.isNotEmpty() && email.isNotEmpty() && password.isNotEmpty() && confirm_password.isNotEmpty())
            {
                if (password == confirm_password)
                {
                    val db = DataBaseHelper(context = this).writableDatabase
                    val register = ContentValues()

                    register.put ("user_name", user_name)
                    register.put ("email", email)
                    register.put ("password", password)

                    val res = db.insert("Users", null, register)

                    if (res != -1L)
                    {
                        Toast.makeText(this, "Registro completado", Toast.LENGTH_SHORT).show()
                        txtUserName.text.clear()
                        txtEmail.text.clear()
                        txtPassword.text.clear()
                        txtConfirmPassword.text.clear()
                    }

                    //db.close()
                }
                else
                    Toast.makeText(this, "Las contraseñas no coinciden", Toast.LENGTH_SHORT).show()
            }
            else
                Toast.makeText(this, "Todos los campos son obligatorios", Toast.LENGTH_SHORT).show()

            //val intent = Intent(this, HomeActivity::class.java)
            //startActivity(intent)
            //finish()
        }

        m_btnSignIn.setOnClickListener {
            val intent = Intent(this, SignInActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}