package com.aditiawinanda2021023210.edittextbutton;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.aditiawinanda2021023210.edittextbutton.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainBinding binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.btnOK.setOnClickListener(view -> {
            String nama = binding.inputNama.getText().toString();
            String pesan = "Hello, " + nama + "!";
            binding.tvInfo.setText(pesan);
        });
    }
}