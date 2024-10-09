package com.example.telegram

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.fragment.findNavController
import com.example.telegram.databinding.FragmentHomeBinding
import com.example.telegram.databinding.FragmentLoginBinding


class LoginFragment : Fragment() {



    lateinit var binding: FragmentLoginBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = FragmentLoginBinding.inflate(layoutInflater,container,false)


        binding.logbtn.setOnClickListener {
            Toast.makeText(requireContext(), "Login Successful !", Toast.LENGTH_SHORT).show()
        }



        return binding.root
    }


}