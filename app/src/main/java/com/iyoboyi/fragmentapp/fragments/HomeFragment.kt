package com.iyoboyi.fragmentapp.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.commit
import androidx.fragment.app.replace
import androidx.navigation.findNavController
import com.iyoboyi.fragmentapp.R
import com.iyoboyi.fragmentapp.databinding.FragmentHomeBinding


class HomeFragment : Fragment() {
    private lateinit var binding: FragmentHomeBinding
    private lateinit var manager: FragmentManager

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentHomeBinding.inflate(inflater, container, false)
        manager = requireActivity().supportFragmentManager
        binding.apply {
            nextButton.setOnClickListener {
                openNextFragmentKt()
            }
        }
        return binding.root
    }


    private fun openNextFragmentKt() {
        val action = HomeFragmentDirections.actionHomeFragmentToNewFragment()
        requireActivity().findNavController(R.id.fragmentContainerView)
            .navigate(R.id.action_homeFragment_to_newFragment)
    }


}

