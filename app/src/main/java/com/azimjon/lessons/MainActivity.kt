package com.azimjon.lessons

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import android.widget.ToggleButton
import androidx.appcompat.widget.SwitchCompat
import com.azimjon.lessons.databinding.ActivityMainBinding
import com.bumptech.glide.Glide
import com.google.android.material.slider.RangeSlider
import com.google.android.material.slider.Slider

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.textView6.setOnClickListener {
            var intent = Intent(this, CreateAccountActivity::class.java)
            startActivity(intent)
        }
    }
}