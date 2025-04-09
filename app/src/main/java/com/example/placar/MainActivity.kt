package com.example.placar

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.placar.databinding.ActivityMainBinding
import com.example.placar.databinding.ActivityPlayerBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        setUpExtras()

    }

    private fun setUpExtras() {
        binding.tvPlayerOneName.text = intent.getStringExtra("PLAYER1")
        binding.tvPlayerTwoName.text = intent.getStringExtra("PLAYER2")
    }
}