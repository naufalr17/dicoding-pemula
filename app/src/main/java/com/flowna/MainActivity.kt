package com.flowna

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import com.flowna.model.FlowerItem
import com.flowna.model.FlowerModel
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var flowerList: ArrayList<FlowerModel>? = arrayListOf()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rvFlowna.setHasFixedSize(true)
        flowerList?.addAll(FlowerItem.listFlowerArray)

        showRv()

        ivAboutMe.setOnClickListener(View.OnClickListener {
            startActivity(Intent(this, AboutActivity::class.java))
        })
    }

    private fun showRv() {
        rvFlowna.layoutManager = LinearLayoutManager(this)
        val mAdapter = FlowerRvAdapter(this, flowerList)
        rvFlowna.adapter = mAdapter
    }
}
