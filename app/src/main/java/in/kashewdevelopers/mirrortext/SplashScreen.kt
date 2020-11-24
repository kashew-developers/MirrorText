package `in`.kashewdevelopers.mirrortext

import `in`.kashewdevelopers.mirrortext.databinding.ActivitySplashScreenBinding
import android.animation.Animator
import android.animation.AnimatorInflater
import android.animation.AnimatorSet
import android.content.Intent
import android.os.Bundle
import android.os.Handler
import androidx.appcompat.app.AppCompatActivity

class SplashScreen : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivitySplashScreenBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val animatorSet = AnimatorInflater
                .loadAnimator(this, R.animator.splash_screen_rotation_animation) as AnimatorSet
        animatorSet.setTarget(binding.appName)
        animatorSet.start()

        animatorSet.addListener(object : Animator.AnimatorListener {
            override fun onAnimationStart(animation: Animator?) {
            }

            override fun onAnimationEnd(animation: Animator?) {
                Handler().postDelayed(Runnable {
                    startActivity(Intent(this@SplashScreen, MainActivity::class.java))
                }, 500)
            }

            override fun onAnimationCancel(animation: Animator?) {
            }

            override fun onAnimationRepeat(animation: Animator?) {
            }
        })
    }

}