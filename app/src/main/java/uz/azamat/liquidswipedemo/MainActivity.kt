package uz.azamat.liquidswipedemo

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import uz.azamat.liquidswipedemo.liquid_swipe.LiquidPager
import uz.azamat.liquidswipedemo.Adapter
import uz.azamat.liquidswipedemo.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val pager = findViewById<LiquidPager>(R.id.pager)
        pager.adapter = Adapter(supportFragmentManager)
    }
}
