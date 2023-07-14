package com.gesticondv.fisi_2023_1_triburock_enanitosverdes_fe.ui.pagos

import android.app.AlertDialog
import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.gesticondv.fisi_2023_1_triburock_enanitosverdes_fe.databinding.FragmentPagosBinding
import com.gesticondv.fisi_2023_1_triburock_enanitosverdes_fe.ui.mercadopago.MercadopagoActivity
import com.gesticondv.fisi_2023_1_triburock_enanitosverdes_fe.ui.qr.QrActivity

class PagosFragment : Fragment() {

    private var _binding: FragmentPagosBinding? = null
    private val binding get() = _binding!!
    private lateinit var btnPagarpp: Button

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        _binding = FragmentPagosBinding.inflate(inflater, container, false)
        val root: View = binding.root

        btnPagarpp = binding.btnPagarpp
        btnPagarpp.setOnClickListener {
            showPaymentOptionsDialog()
        }

        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    private fun showPaymentOptionsDialog() {
        val paymentOptions = arrayOf("Yape", "Mercado Pago")

        val alertDialogBuilder = AlertDialog.Builder(requireContext())
        alertDialogBuilder.setTitle("Selecciona una opción de pago")
        alertDialogBuilder.setItems(paymentOptions) { _, index ->
            val selectedOption = paymentOptions[index]
            Toast.makeText(requireContext(), "Opción seleccionada: $selectedOption", Toast.LENGTH_SHORT).show()

            when (selectedOption) {
                "Yape" -> {
                    val intent = Intent(requireContext(), QrActivity::class.java)
                    startActivity(intent)
                }
                "Mercado Pago" -> {
                    val intent = Intent(requireContext(), MercadopagoActivity::class.java)
                    startActivity(intent)
                }
            }
        }

        alertDialogBuilder.create().show()
    }
}