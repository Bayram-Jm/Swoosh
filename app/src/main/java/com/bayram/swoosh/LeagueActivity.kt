package com.bayram.swoosh

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.widget.Toast
import com.bayram.swoosh.databinding.ActivityLeagueBinding


class LeagueActivity : BaseActivity() {
    lateinit var binding: ActivityLeagueBinding
    var selectedLeague = ""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLeagueBinding.inflate(LayoutInflater.from(this))
        setContentView(R.layout.activity_league)

        fun onMensClicked(view: View) {
            binding.womensLeagueBtn.isChecked = false
            binding.coLeagueBtn.isChecked = false

            selectedLeague = "Erkekler"

        }

        fun onWomensClicked(view: View) {
            binding.mensLeugueBtn.isChecked = false
            binding.coLeagueBtn.isChecked = false

            selectedLeague = "Aýallar"

        }

        fun onCoClicked(view: View) {
            binding.mensLeugueBtn.isChecked = false
            binding.womensLeagueBtn.isChecked = false

            selectedLeague = "Garyşyk"

        }

        fun leagueNextClicked(view: View) {
            if (selectedLeague != "") {

                val skillActivity = Intent(this, SkillsActivity::class.java)
                skillActivity.putExtra(EXTRA_LEAGUE, selectedLeague)
                startActivity(skillActivity)
            } else {
                Toast.makeText(this, "Oýnamaly ligaňyzy saýlaň!", Toast.LENGTH_SHORT).show()
            }


        }

    }

}