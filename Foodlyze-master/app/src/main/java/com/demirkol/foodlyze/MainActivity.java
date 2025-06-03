package com.demirkol.foodlyze;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.demirkol.foodlyze.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;
    Handler handler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        binding.progressBar.setProgress(50);
        handler=new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                binding.progressBar.setProgress(100);
                Intent intent = new Intent(MainActivity.this, Anasayfa.class);
                startActivity(intent);
                finish();

            }
        },3000);



    }
}