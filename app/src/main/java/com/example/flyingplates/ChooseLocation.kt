package com.example.flyingplates

import android.R
import android.os.Bundle
import android.renderscript.ScriptGroup.Binding
import android.widget.ArrayAdapter
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.flyingplates.databinding.ActivityChooseLocationBinding

class ChooseLocation : AppCompatActivity() {
    private val binding : ActivityChooseLocationBinding by lazy {
        ActivityChooseLocationBinding.inflate(layoutInflater)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        val locationList = arrayOf("DyalBagh","Taj Nagri", "Rambagh", "Bijlighar","Sikandra","Khandari","Bhagwan talkies")
        val adapter = ArrayAdapter(this, R.layout.simple_list_item_1,locationList)
        val autoCompleteTextView = binding.listOfLocation
        autoCompleteTextView.setAdapter(adapter)
    }
}