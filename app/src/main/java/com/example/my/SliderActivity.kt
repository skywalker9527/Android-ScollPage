package com.example.my
    import android.os.Bundle
    import androidx.appcompat.app.AppCompatActivity
    import androidx.viewpager.widget.ViewPager
    import com.example.my.R
    class SliderActivity : AppCompatActivity() {

        private lateinit var viewPager: ViewPager

        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_slider)

            // 初始化ViewPager
            viewPager = findViewById(R.id.viewPager)
            viewPager.adapter = SliderPagerAdapter(supportFragmentManager)
        }
    }

