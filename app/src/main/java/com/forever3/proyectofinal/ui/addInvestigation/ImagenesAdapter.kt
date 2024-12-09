package com.forever3.proyectofinal.ui.home

import android.content.Context
import android.net.Uri
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.forever3.proyectofinal.R

class ImagenesAdapter(
    private val context: Context,
    private val imagenes: List<String>
) : RecyclerView.Adapter<ImagenesAdapter.ImagenViewHolder>() {

    class ImagenViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val imageView: ImageView = view.findViewById(R.id.imageView)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ImagenViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.item_imagen, parent, false)
        return ImagenViewHolder(view)
    }

    override fun onBindViewHolder(holder: ImagenViewHolder, position: Int) {
        val imageUrl = imagenes[position]
        Glide.with(holder.itemView.context).load(Uri.parse(imageUrl)).into(holder.imageView)
    }

    override fun getItemCount(): Int {
        return imagenes.size
    }
}

