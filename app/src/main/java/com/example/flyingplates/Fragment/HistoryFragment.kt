package com.example.flyingplates.Fragment

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.flyingplates.DetailsActivity
import com.example.flyingplates.R
import com.example.flyingplates.adapter.BuyAgainAdapter
import com.example.flyingplates.databinding.FragmentHistoryBinding

class HistoryFragment : Fragment() {

    private lateinit var binding : FragmentHistoryBinding
    private lateinit var buyAgainAdapter : BuyAgainAdapter


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentHistoryBinding.inflate(layoutInflater,container,false)
        setupRecyclerView()

        binding.cardView2.setOnClickListener {
            val intent = Intent(requireContext(), DetailsActivity::class.java)
            //Have to set the data like FoodName and FoodImage
            startActivity(intent)
        }

        return binding.root
    }

    private fun setupRecyclerView(){
        val buyAgainFoodName = arrayListOf("Food", "Food1", "Food2", "Food3", "Food4")
        val buyAgainFoodPrice = arrayListOf("$5", "$10", "$20", "$30", "$40")
        val buyAgainFoodImage = arrayListOf(R.drawable.pancack,R.drawable.greennoodle,R.drawable.fruitsalad,R.drawable.pancack,R.drawable.greennoodle)
        buyAgainAdapter = BuyAgainAdapter(buyAgainFoodName, buyAgainFoodPrice, buyAgainFoodImage)
        binding.BuyAgainRecyclerView.adapter = buyAgainAdapter
        binding.BuyAgainRecyclerView.layoutManager = LinearLayoutManager(requireContext())
    }

    companion object {
    }
}