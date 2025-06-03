package com.demirkol.foodlyze;

import android.content.Intent;
import android.os.Binder;
import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.demirkol.foodlyze.databinding.ActivityAnasayfaBinding;
import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.constants.ScaleTypes;
import com.denzcoskun.imageslider.models.SlideModel;

import java.util.ArrayList;

public class Anasayfa extends AppCompatActivity {
    private ActivityAnasayfaBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
      binding=ActivityAnasayfaBinding.inflate(getLayoutInflater());
      setContentView(binding.getRoot());
        ArrayList<SlideModel> slideModels= new ArrayList<>();
        slideModels.add(new SlideModel(R.drawable.reklam, ScaleTypes.FIT));
        slideModels.add(new SlideModel(R.drawable.foodlyzelogo, ScaleTypes.FIT));
        slideModels.add(new SlideModel(R.drawable.foodlyzlogo2, ScaleTypes.FIT));

        binding.imageslider.setImageList(slideModels,ScaleTypes.FIT);


       binding.yemektarifiButton.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               Intent intent= new Intent(Anasayfa.this, Yemektarifilayaout.class);
               startActivity(intent);
           }
       });


        binding.scanButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Anasayfa.this, Barkodsayfasi.class);
                startActivity(intent);
            }
        });

    }
}