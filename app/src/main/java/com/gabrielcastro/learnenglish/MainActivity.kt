package com.gabrielcastro.learnenglish

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager.widget.ViewPager
import com.gabrielcastro.learnenglish.fragment.AnimalsFragment
import com.gabrielcastro.learnenglish.fragment.NumbersFragment
import com.gabrielcastro.learnenglish.fragment.VowelsFragment
import com.ogaclejapan.smarttablayout.SmartTabLayout
import com.ogaclejapan.smarttablayout.utils.v4.FragmentPagerItem
import com.ogaclejapan.smarttablayout.utils.v4.FragmentPagerItemAdapter
import com.ogaclejapan.smarttablayout.utils.v4.FragmentPagerItems

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportActionBar?.elevation = 0F

        val smartTabLayout = findViewById<SmartTabLayout>(R.id.smartTabLayout)
        val viewPager = findViewById<ViewPager>(R.id.viewPager)

        val adapter = FragmentPagerItemAdapter(
            this.supportFragmentManager,
            FragmentPagerItems.with(this)
                .add(FragmentPagerItem.of("Animals", AnimalsFragment::class.java))
                .add(FragmentPagerItem.of("Numbers", NumbersFragment::class.java))
                .create()
        )

        viewPager.adapter = adapter
        smartTabLayout.setViewPager(viewPager)
    }
}