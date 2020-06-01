package com.example.layanankesehatan.features.pubichealthcenter

import com.example.layanankesehatan.models.Pharmacy
import com.example.layanankesehatan.models.PublicHealthCenter

interface PublicHealthCenterContract {
    interface View {
        fun hideLoading()
        fun showLoading()
        fun displayPhc(phc: List<PublicHealthCenter>)
    }
    interface Presenter{
        fun getPhcData()
        fun onDestroyPresenter()
    }
}