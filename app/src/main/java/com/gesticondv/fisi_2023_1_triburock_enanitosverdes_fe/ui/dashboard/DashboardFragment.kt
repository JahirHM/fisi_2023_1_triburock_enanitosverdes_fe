package com.gesticondv.fisi_2023_1_triburock_enanitosverdes_fe.ui.dashboard

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AlertDialog
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.gesticondv.fisi_2023_1_triburock_enanitosverdes_fe.databinding.FragmentDashboardBinding

class DashboardFragment : Fragment() {

    private var _binding: FragmentDashboardBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val dashboardViewModel =
            ViewModelProvider(this).get(DashboardViewModel::class.java)

        _binding = FragmentDashboardBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val btnAsignar: Button = binding.btnAsignarAV
        val editAsignar: EditText = binding.editAsignar

        btnAsignar.setOnClickListener {
            val monto = editAsignar.text.toString().trim()
            if (monto.isNotEmpty()) {
                showAssignSuccessDialog(monto)
            }
        }


        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
    private fun showAssignSuccessDialog(monto: String) {
        val alertDialogBuilder = AlertDialog.Builder(requireContext())
        alertDialogBuilder.setTitle("Éxito")
        alertDialogBuilder.setMessage("S/. $monto asignado correctamente")
        alertDialogBuilder.setPositiveButton("Aceptar") { _, _ ->
        }
        alertDialogBuilder.create().show()
    }
}