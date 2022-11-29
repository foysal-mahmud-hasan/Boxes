package com.foysal.practice.colormyviews

import android.annotation.SuppressLint
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.core.content.ContextCompat
import androidx.databinding.DataBindingUtil
import com.foysal.practice.colormyviews.R.layout.activity_main
import com.foysal.practice.colormyviews.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, activity_main)

        setListeners()
    }

    private fun setListeners() {

        val clickableViews : List<View> =
            listOf(binding.boxOneText, binding.boxTwoText, binding.boxThreeText, binding.boxFourText,
            binding.boxFiveText, binding.layout, binding.redBtn, binding.yellowBtn, binding.greenBtn)
        for (item in clickableViews){

            item.setOnClickListener{makeColored(item)}

        }

    }


    private fun makeColored(view: View?) {

        when (view?.id) {

            binding.boxOneText.id -> view?.setBackgroundColor(Color.DKGRAY)
            binding.boxTwoText.id -> view?.setBackgroundColor(Color.GRAY)

            binding.boxThreeText.id -> view?.setBackgroundColor(getResources().getColor(android.R.color.holo_blue_dark))
            binding.boxFourText.id -> view?.setBackgroundColor(getResources().getColor(android.R.color.holo_blue_dark))
            binding.boxFiveText.id -> view?.setBackgroundColor(getResources().getColor(android.R.color.holo_blue_dark))

            binding.redBtn.id -> binding.boxThreeText.setBackgroundColor(ContextCompat.getColor(this,
            R.color.red))
            binding.yellowBtn.id -> binding.boxFourText.setBackgroundColor(ContextCompat.getColor(this,
            android.R.color.holo_purple))
            binding.greenBtn.id -> binding.boxFiveText.setBackgroundColor(ContextCompat.getColor(this,
            R.color.green))


            else -> binding.layout.setBackgroundColor(getResources().getColor(android.R.color.darker_gray))

        }


    }
}