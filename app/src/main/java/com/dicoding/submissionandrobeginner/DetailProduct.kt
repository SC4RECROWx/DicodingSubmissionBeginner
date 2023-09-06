package com.dicoding.submissionandrobeginner

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class DetailProduct(
    var namedetail: String,
    var descdetail: String,
    var photodetail: Int
): Parcelable