package com.gesticondv.fisi_2023_1_triburock_enanitosverdes_fe.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageButton
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import com.gesticondv.fisi_2023_1_triburock_enanitosverdes_fe.R
import com.gesticondv.fisi_2023_1_triburock_enanitosverdes_fe.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {

    private var _binding: FragmentHomeBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val homeViewModel =
            ViewModelProvider(this).get(HomeViewModel::class.java)

        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        val root: View = binding.root

//        val textView: TextView = binding.textHome
//        homeViewModel.text.observe(viewLifecycleOwner) {
//            textView.text = it
//        }
        return root
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val btnPagare = requireView().findViewById<Button>(R.id.btnPagar)
        val btnDocumentare =requireView().findViewById<Button>(R.id.btnDocumentacion)
        val btnCuentae = requireView().findViewById<Button>(R.id.appCompatButton)
        val btnNotificacionese = requireView().findViewById<ImageButton>(R.id.btnNotificaciones)
        val btnSoportee = requireView().findViewById<ImageButton>(R.id.viewSoporte)


        btnSoportee.setOnClickListener {
            val navController = findNavController()
            if (navController.currentDestination?.id !=R.id.navigation_preguntasfc){
                navController.navigate(R.id.action_navigation_home_to_navigation_preguntasfc)
            }
        }

        btnNotificacionese.setOnClickListener {
            val navController = findNavController()
            if (navController.currentDestination?.id !=R.id.navigation_notificaciones){
                navController.navigate(R.id.action_navigation_home_to_navigation_notificaciones)
            }
        }
//
        btnCuentae.setOnClickListener {
            val navController = findNavController()
            if (navController.currentDestination?.id !=R.id.navigation_cuenta){
                navController.navigate(R.id.action_navigation_home_to_navigation_cuenta)
            }
        }

        btnDocumentare.setOnClickListener {
            val navController = findNavController()
            if (navController.currentDestination?.id !=R.id.navigation_documentacion){
                navController.navigate(R.id.action_navigation_home_to_navigation_documentacion)
            }
        }

        btnPagare.setOnClickListener {
            val navController = findNavController()
            if (navController.currentDestination?.id !=R.id.navigation_pagos){
                navController.navigate(R.id.action_navigation_home_to_navigation_pagos)
            }
        }
    }




    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}