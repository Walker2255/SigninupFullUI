package com.azimjon.lessons

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.azimjon.lessons.databinding.ActivityEmailBinding

class EmailAdressActivity : AppCompatActivity() {
    private lateinit var binding: ActivityEmailBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityEmailBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.backbtn.setOnClickListener {
            var intent = Intent(this, CreateAccountActivity::class.java)
            startActivity(intent)
        }

        binding.button3.setOnClickListener {
            var intent = Intent(this, CreatePasswordActivity::class.java)
            startActivity(intent)
        }
    }
}