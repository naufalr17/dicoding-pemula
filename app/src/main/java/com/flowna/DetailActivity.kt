package com.flowna

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bumptech.glide.Glide
import com.flowna.model.FlowerModel
import kotlinx.android.synthetic.main.activity_detail.*

class DetailActivity : AppCompatActivity() {

    var flowerModel : FlowerModel? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        flowerModel = intent.getParcelableExtra("flower")

        tvNameArray.text = flowerModel?.nama.toString()
        Glide.with(this).load(flowerModel?.gambar.toString()).into(ivFlower)
        tvKingdomArray.text = flowerModel?.kingdom.toString()
        tvDivisiArray.text = flowerModel?.divisi.toString()
        tvDescArray.text = flowerModel?.deskripsi.toString()

    }

    override fun onBackPressed() {
        startActivity(Intent(this, MainActivity::class.java))
        super.onBackPressed()
    }
}
