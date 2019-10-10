package com.flowna.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class FlowerModel(
    var nama : String? = null,

    var kingdom : String? = null,

    var divisi : String? = null,

    var deskripsi : String? = null,

    var gambar : String? = null
) : Parcelable