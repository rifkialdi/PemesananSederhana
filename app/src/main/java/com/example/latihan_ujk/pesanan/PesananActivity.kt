package com.example.latihan_ujk.pesanan

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.view.View
import com.example.latihan_ujk.R
import com.example.latihan_ujk.databinding.ActivityPesananBinding
import com.example.latihan_ujk.key.Key

class PesananActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var binding: ActivityPesananBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPesananBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        supportActionBar?.title = "Pesanan"

        binding.idbtnLanjut.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when(v?.id) {
            R.id.idbtn_lanjut -> {
                val noMeja = binding.idedtNomermeja.text.toString()
                if (noMeja.isNotEmpty()) {
                    val intent = Intent(this, ListPesananActivity::class.java)
                    intent.putExtra(Key.KEY_NO_PLAT, noMeja)
                    startActivity(intent)
                } else {
                    binding.idedtNomermeja.error = "Tidak boleh kosong"
                }

            }
        }
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId) {
            android.R.id.home -> finish()
        }
        return super.onOptionsItemSelected(item)
    }
}