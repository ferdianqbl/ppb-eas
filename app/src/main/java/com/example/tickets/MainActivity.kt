package com.example.tickets

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import android.widget.LinearLayout
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        supportActionBar?.hide()
        userListener()
        saldoListener()
        productListener()
    }

    private fun userListener() {
        val myButton = findViewById<ImageView>(R.id.botNavUser);
        myButton.setOnClickListener{
            startActivity(Intent(this, UserActivity::class.java))
        }
    }

    private fun saldoListener() {
        val myButton = findViewById<ImageView>(R.id.botNavSaldo);
        myButton.setOnClickListener{
            startActivity(Intent(this, SaldoActivity::class.java))
        }
    }

    private fun productListener() {
        val myButton = findViewById<LinearLayout>(R.id.product_1);
        myButton.setOnClickListener{
            startActivity(Intent(this, DetailProductActivity::class.java))
        }
    }
}