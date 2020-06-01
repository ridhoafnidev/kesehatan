package com.example.layanankesehatan.features.main

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.layanankesehatan.R
import com.example.layanankesehatan.features.clinic.ClinicActivity
import com.example.layanankesehatan.features.clinic.MainClinicActivity
import com.example.layanankesehatan.features.doktorpractice.DoctorPracticeActivity
import com.example.layanankesehatan.features.hospital.HospitalActivity
import com.example.layanankesehatan.features.pharmacy.PharmacyActivity
import com.example.layanankesehatan.features.pubichealthcenter.PublicHealthCenterActivity
import kotlinx.android.synthetic.main.activity_main.*
import org.jetbrains.anko.clearTask
import org.jetbrains.anko.intentFor

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initUi()
    }

    private fun initUi() {
        ll_clinic.setOnClickListener {
            val intent = Intent(this, MainClinicActivity::class.java)
            startActivity(intent)
        }

        ll_doctor_practice.setOnClickListener {
            startActivity(intentFor<DoctorPracticeActivity>().clearTask())
        }

        ll_hospital.setOnClickListener {
            startActivity(intentFor<HospitalActivity>().clearTask())
        }

        ll_pharmacy.setOnClickListener {
            startActivity(intentFor<PharmacyActivity>().clearTask())
        }

        ll_phc.setOnClickListener {
            startActivity(intentFor<PublicHealthCenterActivity>().clearTask())
        }
    }
}
