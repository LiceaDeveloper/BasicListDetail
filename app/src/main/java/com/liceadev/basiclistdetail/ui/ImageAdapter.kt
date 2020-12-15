package com.liceadev.basiclistdetail.ui

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.liceadev.basiclistdetail.databinding.ItemImageBinding
import com.liceadev.basiclistdetail.extesions.loadImage

class ImageAdapter : RecyclerView.Adapter<ImageAdapter.CocktailViewHolder>() {
    var values: List<String> = ArrayList()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CocktailViewHolder {
        val binding = ItemImageBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return CocktailViewHolder(binding)
    }

    override fun onBindViewHolder(holder: CocktailViewHolder, position: Int) {
        val cocktail = values[position]
        holder.bind(cocktail)
    }

    override fun getItemCount(): Int = values.size

    class CocktailViewHolder(private val binding: ItemImageBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun bind(text: String) {
            binding.image.loadImage(text)
            binding.tvUrl.text = text
        }
    }
}