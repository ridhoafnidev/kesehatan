package com.example.layanankesehatan.features.clinic.clinicmap

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.example.layanankesehatan.R

/**
 * A simple [Fragment] subclass.
 */
class ClinicMapFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_clinic_map, container, false)
    }

}
