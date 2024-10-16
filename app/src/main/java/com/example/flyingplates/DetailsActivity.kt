package com.example.flyingplates

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.flyingplates.Fragment.CartFragment
import com.example.flyingplates.databinding.ActivityDetailsBinding

class DetailsActivity : AppCompatActivity() {
    private lateinit var binding : ActivityDetailsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val foodName = intent.getStringExtra("MenuItemName")
        val foodImage = intent.getIntExtra("MenuItemImage",0)

        binding.detailFoodName.text = foodName
        binding.DeatailFoodImageView.setImageResource(foodImage)

        binding.imageButton.setOnClickListener {
            finish()
        }
        binding.addToCartButton.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            intent.putExtra("openCart", true)  // Pass the openCart flag to MainActivity
            startActivity(intent)
            finish()  // Close the DetailsActivity
        }

    }
}