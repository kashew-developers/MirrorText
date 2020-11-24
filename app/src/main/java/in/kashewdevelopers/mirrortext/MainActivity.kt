package `in`.kashewdevelopers.mirrortext

import `in`.kashewdevelopers.mirrortext.databinding.ActivityMainBinding
import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        super.onCreateOptionsMenu(menu)
        menuInflater.inflate(R.menu.menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.about -> {
                startActivity(Intent(this, About::class.java))
                return true
            }

            R.id.horizontal -> {
                item.isChecked = !item.isChecked
                binding.input.rotationX = if (item.isChecked) 180f else 0f
                return true
            }

            R.id.vertical -> {
                item.isChecked = !item.isChecked
                binding.input.rotationY = if (item.isChecked) 180f else 0f
                return true
            }

            else -> return false
        }
    }

}
