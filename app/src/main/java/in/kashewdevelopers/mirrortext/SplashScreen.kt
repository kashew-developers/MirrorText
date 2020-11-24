package `in`.kashewdevelopers.mirrortext

import `in`.kashewdevelopers.mirrortext.databinding.ActivitySplashScreenBinding
import android.animation.AnimatorInflater
import android.animation.AnimatorSet
import android.content.Intent
import android.os.Bundle
import android.os.Handler
import androidx.appcompat.app.AppCompatActivity
import androidx.core.animation.addListener

class SplashScreen : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivitySplashScreenBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val animatorSet = AnimatorInflater
                .loadAnimator(this, R.animator.splash_screen_rotation_animation) as AnimatorSet
        animatorSet.setTarget(binding.appName)
        animatorSet.start()

        animatorSet.addListener({
            Handler().postDelayed(Runnable {
                startActivity(Intent(this@SplashScreen, MainActivity::class.java))
            }, 500)
        })
    }

}