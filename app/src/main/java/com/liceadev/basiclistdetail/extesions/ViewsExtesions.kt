package com.liceadev.basiclistdetail.extesions

import android.widget.ImageView
import com.bumptech.glide.Glide
import com.liceadev.basiclistdetail.R

fun ImageView.loadImage(url: String) {
    Glide
        .with(this.context)
        .load(url)
        .centerCrop()
        .placeholder(R.drawable.loading_animation)
        .into(this)
}