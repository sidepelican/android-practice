package junktown.side.gmail.com.myslideshow

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private val resources = listOf(
            R.drawable.slide00, R.drawable.slide01,
            R.drawable.slide02, R.drawable.slide03,
            R.drawable.slide04, R.drawable.slide05,
            R.drawable.slide06, R.drawable.slide07,
            R.drawable.slide08, R.drawable.slide09
            )

    private var position: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        imageSwitcher.setFactory {
            ImageView(this)
        }
        imageSwitcher.setImageResource(resources.first())

        prevButton.setOnClickListener {
            imageSwitcher.setInAnimation(this, android.R.anim.fade_in)
            imageSwitcher.setOutAnimation(this, android.R.anim.fade_out)
            movePosition(-1)
        }
        nextButton.setOnClickListener {
            imageSwitcher.setInAnimation(this, android.R.anim.slide_in_left)
            imageSwitcher.setOutAnimation(this, android.R.anim.slide_out_right)
            movePosition(1)
        }
    }

    private fun movePosition(move: Int) {
        position += move
        if (position >= resources.size) {
            position = 0
        } else if (position < 0) {
            position = resources.size - 1
        }
        imageSwitcher.setImageResource(resources[position])
    }
}
