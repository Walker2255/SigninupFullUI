package com.azimjon.lessons

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.azimjon.lessons.databinding.ActivityVerifyBinding

class VerifyActivity : AppCompatActivity() {
    private lateinit var binding: ActivityVerifyBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityVerifyBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.backbtn.setOnClickListener {
            var intent = Intent(this, CreatePasswordActivity::class.java)
            startActivity(intent)
        }
    }
}