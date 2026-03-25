package com.yebs.quicknote.create

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.yebs.quicknote.R

class CreateListActivity : AppCompatActivity() {
    private lateinit var m_btnFinish: Button;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.create_list_activity)

        // Getting Controllers
        m_btnFinish = findViewById<Button>(R.id.btnFinish)

        // Setting Up Controllers Methods
        m_btnFinish.setOnClickListener {
            finish()
        }
    }
}