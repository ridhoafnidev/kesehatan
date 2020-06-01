package com.example.layanankesehatan.models

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Pharmacy(
    @SerializedName("id_apotek") var id_apotek: String?,
    @SerializedName("nama_apotek") var nama_apotek: String?,
    @SerializedName("kecamatan") var kecamatan: String?,
    @SerializedName("kelurahan") var kelurahan: String?,
    @SerializedName("alamat") var alamat: String?,
    @SerializedName("nomor_telp") var nomor_telp: String?,
    @SerializedName("foto") var foto: String?,
    @SerializedName("fasilitas") var fasilitas: String?,
    @SerializedName("deskripsi") var deskripsi: String?,
    @SerializedName("latitude") var latitude: String?,
    @SerializedName("longitude") var longitude: String?
    ): Parcelable