package com.gesticondv.fisi_2023_1_triburock_enanitosverdes_fe.ui.documentacion

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.appcompat.app.AlertDialog
import com.gesticondv.fisi_2023_1_triburock_enanitosverdes_fe.R

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [DocumentacionFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class DocumentacionFragment : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val rootView = inflater.inflate(R.layout.fragment_documentacion, container, false)

        val btnEstados: Button = rootView.findViewById(R.id.btnestados)
        btnEstados.setOnClickListener {
            showDownloadSuccessDialog()
        }
        val btnMorosos: Button = rootView.findViewById(R.id.btnmorosos)
        btnMorosos.setOnClickListener {
            showDownloadSuccessDialog()
        }

        return rootView
    }

    private fun showDownloadSuccessDialog() {
        val alertDialogBuilder = AlertDialog.Builder(requireContext())
        alertDialogBuilder.setTitle("Éxito")
        alertDialogBuilder.setMessage("Documento descargado exitosamente")
        alertDialogBuilder.setPositiveButton("Aceptar") { _, _ ->
        }
        alertDialogBuilder.create().show()
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment DocumentacionFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            DocumentacionFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}