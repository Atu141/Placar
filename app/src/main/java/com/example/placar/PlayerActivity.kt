package com.example.placar

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.placar.databinding.ActivityPlayerBinding
import com.example.placar.databinding.ActivitySplashBinding

class PlayerActivity : AppCompatActivity() {

    private lateinit var binding: ActivityPlayerBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        binding = ActivityPlayerBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btStart.setOnClickListener{
            val nextScreem = Intent(this, MainActivity::class.java)
            nextScreem.putExtra("PLAYER1", binding.etPlayer1.text.toString())
            nextScreem.putExtra("PLAYER2", binding.etPlayer2.text.toString())
            startActivity(nextScreem)
        }

    }
}