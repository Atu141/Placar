package com.example.placar

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.example.placar.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    private var playerOneScore = 0
    private var playerTwoScore = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        setUpExtras(savedInstanceState)
        setUpListeners()

    }

    private fun setUpListeners() {
        binding.btPlayerOneScore.setOnClickListener{
            playerOneScore++
            binding.tvPlayerOneScore.text = playerOneScore.toString()
        }

        binding.btPlayerTwoScore.setOnClickListener{
            playerTwoScore++
            binding.tvPlayerTwoScore.text = playerTwoScore.toString()
        }
    }

    private fun setUpExtras(savedInstanceState: Bundle?) {
        binding.tvPlayerOneName.text = intent.getStringExtra("PLAYER1")
        binding.tvPlayerTwoName.text = intent.getStringExtra("PLAYER2")

        if(savedInstanceState != null){
            playerOneScore = savedInstanceState.getInt("PLAYER_ONE_SCORE")
            playerTwoScore = savedInstanceState.getInt("PLAYER_TWO_SCORE")
            binding.tvPlayerOneScore.text = playerOneScore.toString()
            binding.tvPlayerTwoScore.text = playerTwoScore.toString()
        }
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putInt("PLAYER_ONE_SCORE",playerOneScore)
        outState.putInt("PLAYER_TWO_SCORE",playerTwoScore)
    }
}