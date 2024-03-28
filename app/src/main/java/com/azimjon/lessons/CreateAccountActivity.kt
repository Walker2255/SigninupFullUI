package com.azimjon.lessons

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.azimjon.lessons.databinding.ActivityCreateAccountBinding

class CreateAccountActivity : AppCompatActivity() {
    private lateinit var binding: ActivityCreateAccountBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCreateAccountBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.backbtn.setOnClickListener {
            var intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
        binding.button.setOnClickListener {
            var intent = Intent(this, EmailAdressActivity::class.java)
            startActivity(intent)
        }

    }
}