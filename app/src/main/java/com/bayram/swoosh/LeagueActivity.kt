package com.bayram.swoosh

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import com.bayram.swoosh.databinding.ActivityLeagueBinding


class LeagueActivity : BaseActivity() {
    lateinit var binding: ActivityLeagueBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLeagueBinding.inflate(LayoutInflater.from(this))
        setContentView(R.layout.activity_league)

        fun leagueNextClicked(view: View) {
             val skillActivity = Intent(this, SkillsActivity::class.java)
            startActivity(skillActivity)
            

        }

    }

}