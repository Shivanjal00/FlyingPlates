package com.example.flyingplates.Fragment

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.flyingplates.CongratsBottomSheet
import com.example.flyingplates.PayOutActivity
import com.example.flyingplates.R
import com.example.flyingplates.adapter.CartAdapter
import com.example.flyingplates.databinding.FragmentCartBinding

class CartFragment : Fragment() {

    private lateinit var binding: FragmentCartBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentCartBinding.inflate(inflater, container, false)

        val cartFoodName = listOf("Herbal Pancake",
            "Fruit Salad",
            "Green Noodle",
            "Herbal Pancake",
            "Green Noodle")

        val cartItemPrice = listOf("$7", "$5", "$15", "$7", "$15")
        val cartImage = listOf(
            R.drawable.pancack,
            R.drawable.fruitsalad,
            R.drawable.greennoodle,
            R.drawable.pancack,
            R.drawable.greennoodle
        )
        val adapter = CartAdapter(ArrayList(cartFoodName),ArrayList(cartItemPrice),ArrayList(cartImage))
        binding.cartRecyclerView.layoutManager = LinearLayoutManager(requireContext())
        binding.cartRecyclerView.adapter = adapter

        binding.ProceesButton.setOnClickListener {
            val intent = Intent(requireContext(),PayOutActivity::class.java)
            startActivity(intent)
        }


        return binding.root
    }

    companion object {

    }
}