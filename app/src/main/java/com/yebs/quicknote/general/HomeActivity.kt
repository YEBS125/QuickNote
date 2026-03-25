package com.yebs.quicknote.general

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.yebs.quicknote.R
import com.yebs.quicknote.authentication.SignInActivity
import com.yebs.quicknote.create.CreateListActivity
import com.yebs.quicknote.create.CreateNoteActivity

class HomeActivity : AppCompatActivity() {
    private lateinit var m_btnCreateList : Button;
    private lateinit var m_btnCreateNote : Button;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.home_activity)

        // Getting Controllers
        m_btnCreateList = findViewById<Button>(R.id.btnCreateList)
        m_btnCreateNote = findViewById<Button>(R.id.btnCreateNote)

        // Setting Up Controllers Methods
        m_btnCreateList.setOnClickListener {
            val intent = Intent(this, CreateListActivity::class.java)
            startActivity(intent)
        }

        m_btnCreateNote.setOnClickListener {
            val intent = Intent(this, CreateNoteActivity::class.java)
            startActivity(intent)
        }
    }
}