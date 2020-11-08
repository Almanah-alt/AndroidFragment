package com.example.fragmentlab

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.fragmentlab.fragment.HomeFragment
import com.example.fragmentlab.fragment.SearchFragment
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val homeFragment = HomeFragment()
        val searchFragment = SearchFragment()

        supportFragmentManager.beginTransaction().apply {
            replace(R.id.frame_layout_fragment, homeFragment)
            addToBackStack(null)
            commit()
        }

        home_menu.setOnClickListener {
            home_menu.setImageResource(R.drawable.ic_baseline_home_24)
            search_menu.setImageResource(R.drawable.ic_outline_search_24)
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.frame_layout_fragment, homeFragment)
                addToBackStack(null)
                commit()
            }

        }

        search_menu.setOnClickListener {
            home_menu.setImageResource(R.drawable.ic_outline_home_24)
            search_menu.setImageResource(R.drawable.ic_baseline_search_24)
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.frame_layout_fragment, searchFragment)
                addToBackStack(null)
                commit()
            }
        }

    }
}