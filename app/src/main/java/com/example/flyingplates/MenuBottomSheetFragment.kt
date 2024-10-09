package com.example.flyingplates

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.flyingplates.adapter.MenuAdapter
import com.example.flyingplates.databinding.FragmentMenuBottomSheetBinding
import com.google.android.material.bottomsheet.BottomSheetDialogFragment

class MenuBottomSheetFragment : BottomSheetDialogFragment() {

    private lateinit var binding: FragmentMenuBottomSheetBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentMenuBottomSheetBinding.inflate(inflater, container, false)

        binding.buttonBack.setOnClickListener {
            dismiss()
        }

        val menuFoodName = listOf(
            "Herbal Pancake",
            "Fruit Salad",
            "Green Noodle",
            "Herbal Pancake",
            "Green Noodle",
            "Herbal Pancake",
            "Fruit Salad",
            "Green Noodle",
            "Herbal Pancake",
            "Green Noodle"
        )

        val menuItemPrice = listOf("$7", "$5", "$15", "$7", "$15", "$7", "$5", "$15", "$7", "$15")
        val menuImage = listOf(
            R.drawable.pancack,
            R.drawable.fruitsalad,
            R.drawable.greennoodle,
            R.drawable.pancack,
            R.drawable.greennoodle,
            R.drawable.pancack,
            R.drawable.fruitsalad,
            R.drawable.greennoodle,
            R.drawable.pancack,
            R.drawable.greennoodle
        )
        val adapter =
            MenuAdapter(ArrayList(menuFoodName), ArrayList(menuItemPrice), ArrayList(menuImage))
        binding.menuRecyclerView.layoutManager = LinearLayoutManager(requireContext())
        binding.menuRecyclerView.adapter = adapter

        return binding.root
    }

    companion object {
    }
}