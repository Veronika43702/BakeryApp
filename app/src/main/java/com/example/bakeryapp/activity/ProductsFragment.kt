package com.example.bakeryapp.activity

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.bakeryapp.databinding.FragmentGoodsBinding
import com.example.bakeryapp.databinding.FragmentProductsBinding

class ProductsFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val binding = FragmentProductsBinding.inflate(layoutInflater, container, false)
        return binding.root
    }
}