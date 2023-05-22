package com.example.pagertablayout

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView


class CatVPAdater(private val photoUrls: List<Int>) :
    RecyclerView.Adapter<CatVPAdater.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.cat_item, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        val photoDrawableResId = photoUrls[position]
        holder.photoImageView.setImageResource(photoDrawableResId)
    }

    override fun getItemCount(): Int {
        return photoUrls.size
    }

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val photoImageView: ImageView = itemView.findViewById(R.id.cat_area)
    }
}
