package com.iyoboyi.fragmentapp.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.iyoboyi.fragmentapp.R
import com.iyoboyi.fragmentapp.databinding.FragmentHomeBinding


class HomeFragment : Fragment() {
        private lateinit var binding: FragmentHomeBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
       binding = FragmentHomeBinding.inflate(inflater, container, false)
        return binding.root
    }


}