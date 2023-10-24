package com.example.appcashin;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toolbar;

import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FrameLayout transferencias =(FrameLayout) findViewById(R.id.transferencias);
        FrameLayout boletos =(FrameLayout) findViewById(R.id.boleto);
        FrameLayout qrcode =(FrameLayout) findViewById(R.id.qrcode);
        FrameLayout cupons =(FrameLayout) findViewById(R.id.cupom);
        FrameLayout cartao =(FrameLayout) findViewById(R.id.cartao);
        FrameLayout cashins =(FrameLayout) findViewById(R.id.transferenciascashin);
        ImageView hamburguer = (ImageView) findViewById(R.id.hamburgerIcon);



        transferencias.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Cupom.class);
                startActivity(intent);
            }
        });

        boletos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Cupom.class);
                startActivity(intent);
            }
        });

        qrcode.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Cupom.class);
                startActivity(intent);
            }
        });

        cupons.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Cupom.class);
                startActivity(intent);
            }
        });

        cartao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Cupom.class);
                startActivity(intent);
            }
        });
        cashins.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Cupom.class);
                startActivity(intent);
            }
        });

        hamburguer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Drawer.class);
                startActivity(intent);




            }
        });
        }}
