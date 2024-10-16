package com.example.flyingplates

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.navigation.NavController
import androidx.navigation.findNavController
import androidx.navigation.ui.setupWithNavController
import com.example.flyingplates.databinding.ActivityLoginBinding
import com.example.flyingplates.databinding.ActivityMainBinding
import com.google.android.material.bottomnavigation.BottomNavigationView


class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        var NavController : NavController = findNavController(R.id.fragmentContainerView)
        var bottomnav = findViewById<BottomNavigationView>(R.id.bottomNavigationView4)
        bottomnav.setupWithNavController(NavController)


        if (intent.getBooleanExtra("openCart", false)) {
            // Navigate to CartFragment programmatically
            bottomnav.selectedItemId = R.id.cartFragment

            // Clear the flag so it won't trigger navigation again
            intent.removeExtra("openCart")
        }

        binding.notificationButton.setOnClickListener {
            val bottomSheetDialog = Notification_Bottom_Fragment()
            bottomSheetDialog.show(supportFragmentManager,"Test")
        }

    }
}