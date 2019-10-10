package com.flowna

import android.annotation.SuppressLint
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.flowna.model.FlowerModel
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.item_row_flowna.view.*
import org.jetbrains.anko.intentFor
import org.jetbrains.anko.sdk27.coroutines.onClick


class FlowerRvAdapter(val context: Context, val listFlower: ArrayList<FlowerModel>?) :
    RecyclerView.Adapter<FlowerRvAdapter.ViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_row_flowna, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(context, listFlower!!.get(position))
    }

    override fun getItemCount(): Int = listFlower!!.size

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        @SuppressLint("CheckResult")
        fun bind(context: Context, flower: FlowerModel){
            Glide.with(itemView.context)
                .load(flower?.gambar.toString())
                .apply(RequestOptions().override(55,55))
                .into(itemView.imgRounded)

            itemView.nama_bunga.text = flower?.nama.toString()
            itemView.item_desc.text = flower?.deskripsi.toString()

            itemView.onClick {
                val intent = itemView.context.intentFor<DetailActivity>("flower" to flower)
                itemView.context.startActivity(intent)
            }
        }
    }
}