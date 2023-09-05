package com.dicoding.submissionandrobeginner

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Product(
    val name: String,
    val description: String,
    val photo: Int
) : Parcelable
