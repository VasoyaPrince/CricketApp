package com.vp.cricketapp

import android.content.Intent
import android.content.SharedPreferences
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import com.vp.cricketapp.databinding.ActivitySlpashBinding

class SplashActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySlpashBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySlpashBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.lottieAnim.animate().translationY(1400f).setDuration(1000).startDelay = 4000

        Handler(Looper.getMainLooper()).postDelayed({
            startActivity(Intent(this@SplashActivity, MainActivity::class.java))
            finish()
        }, 3000)

    }

}