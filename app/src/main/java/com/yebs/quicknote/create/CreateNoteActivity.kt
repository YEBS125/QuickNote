package com.yebs.quicknote.create

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.yebs.quicknote.R

class CreateNoteActivity : AppCompatActivity() {
    private lateinit var m_btnFinish: Button;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.create_note_activity)

        // Getting Controllers
        m_btnFinish = findViewById<Button>(R.id.btnFinish)

        // Setting Up Controllers Methods
        m_btnFinish.setOnClickListener {
            finish()
        }
    }
}