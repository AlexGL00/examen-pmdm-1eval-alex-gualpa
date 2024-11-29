package com.examalexgualpa.examenpmdm;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.resource.drawable.DrawableTransitionOptions;

public class SplashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        launchMain();

        Animation gradientColor = AnimationUtils.loadAnimation(this, R.anim.gradient_color);
        ImageView logoExamen = findViewById(R.id.LogoExamen);
        TextView splashscreen = findViewById(R.id.SplashscreenAppname);
        logoExamen.startAnimation(gradientColor);
        splashscreen.startAnimation(gradientColor);

        ImageView LideBackground = findViewById(R.id.backgroundFondo);

        Glide.with(this)
                .load("https://d17umfmk0e27oh.cloudfront.net/articulos/articulos-692523.jpg")
                .transition(DrawableTransitionOptions.withCrossFade(5000))
                .centerCrop()
                .into(LideBackground);
        }
        public void launchMain(){
            new Handler(Looper.getMainLooper()).postDelayed(new Runnable() {
                @Override
                public void run() {
                    Intent intent = new Intent(SplashScreen.this, Login.class);
                    intent.addFlags(intent.FLAG_ACTIVITY_CLEAR_TASK);
                    intent.addFlags(intent.FLAG_ACTIVITY_NEW_TASK);
                    startActivity(intent);
                }
            }, 3000);

        }
}