package com.liceadev.basiclistdetail

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.liceadev.basiclistdetail.databinding.ListFragmentBinding
import com.liceadev.basiclistdetail.ui.ImageAdapter

class ListFragment : Fragment() {

    private val mImageAdapter = ImageAdapter()

    companion object {
        fun newInstance() = ListFragment()
    }

    private lateinit var viewModel: ListViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = ListFragmentBinding.inflate(layoutInflater)
        mImageAdapter.values = listOf("1", "2", "3")
        binding.rvImages.adapter = mImageAdapter
        viewModel = ViewModelProvider(this).get(ListViewModel::class.java)
        return binding.root
    }
}