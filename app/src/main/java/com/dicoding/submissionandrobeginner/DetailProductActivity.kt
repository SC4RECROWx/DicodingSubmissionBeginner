package com.dicoding.submissionandrobeginner

import android.content.res.Resources
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import com.dicoding.submissionandrobeginner.databinding.ActivityAboutBinding
import com.dicoding.submissionandrobeginner.databinding.ActivityDetailProductBinding

class DetailProductActivity : AppCompatActivity() {
    private lateinit var detailBinding: ActivityDetailProductBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        detailBinding = ActivityDetailProductBinding.inflate(layoutInflater)
        setContentView(detailBinding.root)

        val dataProduct = if (Build.VERSION.SDK_INT >= 33) {
            intent.getParcelableExtra<Product>("key_product", Product::class.java)
        } else {
            @Suppress("DEPRECATION")
            intent.getParcelableExtra<Product>("key_product")
        }?: return

        detailBinding.tvProductName.text = dataProduct!!.name
        detailBinding.tvProductDescription.text = dataProduct!!.description
        detailBinding.imgProductPhoto.setImageDrawable(resources.getDrawable(dataProduct.photo,null))
    }
}