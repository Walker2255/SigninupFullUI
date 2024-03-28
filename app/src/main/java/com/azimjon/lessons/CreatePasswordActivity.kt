package com.azimjon.lessons

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.azimjon.lessons.databinding.ActivityCreateAccountBinding
import com.azimjon.lessons.databinding.ActivityCreatePasswordBinding

class CreatePasswordActivity : AppCompatActivity() {
    private lateinit var binding: ActivityCreatePasswordBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityCreatePasswordBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.backbtn.setOnClickListener {
            var intent = Intent(this, EmailAdressActivity::class.java)
            startActivity(intent)
        }

        binding.button3.setOnClickListener {
            var intent = Intent(this, VerifyActivity::class.java)
            startActivity(intent)
        }

    }
}