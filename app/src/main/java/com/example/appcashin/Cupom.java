package com.example.appcashin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Cupom extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cupom);

        final Button voltar = (Button) findViewById(R.id.btnVoltar);
        ImageView hamburguin = (ImageView) findViewById(R.id.hamburgerIcon);
        voltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Cupom.this, MainActivity.class);
                startActivity(intent);
            }
        });

        hamburguin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Cupom.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}