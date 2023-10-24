package com.example.appcashin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;

public class Drawer extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drawer);

        Button transferencias1 =(Button) findViewById(R.id.btnTransferencias);
        Button inicio =(Button) findViewById(R.id.btnInicio);
        Button extrato =(Button) findViewById(R.id.btnExtrato);
        Button cfisico =(Button) findViewById(R.id.btnCFisico);
        Button boletinho =(Button) findViewById(R.id.btnBoleto);
        Button cvirtual =(Button) findViewById(R.id.btnCVirtual);
        Button cuponsitos =(Button) findViewById(R.id.btnCupons);
        Button tcashin =(Button) findViewById(R.id.btnTCashin);





        transferencias1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Drawer.this, Cupom.class);
                startActivity(intent);
            }
        });

        boletinho.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Drawer.this, Cupom.class);
                startActivity(intent);
            }
        });

        cfisico.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Drawer.this, Cupom.class);
                startActivity(intent);
            }
        });

        cvirtual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Drawer.this, Cupom.class);
                startActivity(intent);
            }
        });

        extrato.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Drawer.this, Cupom.class);
                startActivity(intent);
            }
        });
        cuponsitos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Drawer.this, Cupom.class);
                startActivity(intent);
            }
        });

        tcashin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Drawer.this, MainActivity.class);
                startActivity(intent);

            }
        });

        inicio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Drawer.this, MainActivity.class);
                startActivity(intent);

            }
        });


    }
}