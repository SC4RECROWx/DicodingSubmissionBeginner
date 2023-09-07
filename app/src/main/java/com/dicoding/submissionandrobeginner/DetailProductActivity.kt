package com.dicoding.submissionandrobeginner

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class DetailProductActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_product)

        val product = intent.getParcelableExtra<Product>(MainActivity.INTENT_PARCELABLE)
        val nameProduct = findViewById<TextView>(R.id.tv_product_name)
        val descProduct = findViewById<TextView>(R.id.tv_product_description)
        val imgProduct = findViewById<ImageView>(R.id.img_product_photo)

        imgProduct.setImageResource(product?.photo!!)
        nameProduct.text = product.name
        descProduct.text = product.description
    }
}