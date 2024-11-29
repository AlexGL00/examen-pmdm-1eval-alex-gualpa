package com.examalexgualpa.examenpmdm.fr.inicio;

import android.os.Bundle;
import android.view.inputmethod.InputBinding;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.viewpager.widget.ViewPager;

import com.examalexgualpa.examenpmdm.R;
import com.examalexgualpa.examenpmdm.databinding.ActivityMain2Binding;
import com.examalexgualpa.examenpmdm.ui.frmanager.Paginador;

public class Main2Activity extends AppCompatActivity {

    private ActivityMain2Binding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMain2Binding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        Paginador paginador = new Paginador(this, getSupportFragmentManager());
        ViewPager viewPager = binding.viewPager;
        viewPager.setAdapter(paginador);
    }

}