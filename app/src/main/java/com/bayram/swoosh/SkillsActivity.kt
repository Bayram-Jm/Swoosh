package com.bayram.swoosh

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import com.bayram.swoosh.databinding.ActivityLeagueBinding

class SkillsActivity : BaseActivity() {
    lateinit var binding: ActivityLeagueBinding
    var league = ""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLeagueBinding.inflate(LayoutInflater.from(this))
        setContentView(R.layout.activity_skills)

    }
}