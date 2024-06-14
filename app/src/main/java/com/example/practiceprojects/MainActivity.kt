package com.example.practiceprojects

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.NavController
import androidx.navigation.findNavController
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val NavController=findNavController(R.id.fragmentContainerView)
        val bottomNav=findViewById<BottomNavigationView>(R.id.bottom_nav)
        bottomNav.setupWithNavController(NavController)
    }
}