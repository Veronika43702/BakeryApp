package com.example.bakeryapp.activity

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.bakeryapp.R
import com.example.bakeryapp.databinding.FragmentCupcakeBinding
import com.example.bakeryapp.databinding.FragmentMenuBinding

class CupcakeFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val binding = FragmentCupcakeBinding.inflate(layoutInflater, container, false)
            binding.spongeMenu.setOnClickListener{
                //sponge_ingredient_table
            }
        return binding.root
    }
}