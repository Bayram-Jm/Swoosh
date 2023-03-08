package com.bayram.swoosh

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import com.bayram.swoosh.databinding.ActivityMainBinding


class MainActivity : BaseActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(LayoutInflater.from(this))
        setContentView(binding.root)


        // Sahypa geçmek
    binding.buttonStart.setOnClickListener {
        val leagueIntent = Intent(this, LeagueActivity::class.java)
        startActivity(leagueIntent)
    }

    }






}