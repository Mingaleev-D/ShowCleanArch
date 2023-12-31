package com.example.showcleanarch.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupActionBarWithNavController
import com.example.showcleanarch.R
import com.example.showcleanarch.databinding.ActivityMainBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
   private val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }
   private lateinit var navController: NavController

   override fun onCreate(savedInstanceState: Bundle?) {
      super.onCreate(savedInstanceState)
      setContentView(binding.root)

      val navHostFragment =
          supportFragmentManager.findFragmentById(R.id.fragmentContainerView) as NavHostFragment
      navController = navHostFragment.navController
      
   }
}
