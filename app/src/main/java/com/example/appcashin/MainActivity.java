package com.example.appcashin;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toolbar;

import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button=findViewById(R.id.btnTransferencias);

  /*      View drawerLayout = findViewById(R.id.drawer_layout);
        View navigationView = findViewById(R.id.nav_view);

            // Configurar a Toolbar como a barra de ação
            Toolbar toolbar = findViewById(R.id.toolbar);
            setSupportActionBar(toolbar);

            // Adicionar ícone de menu hamburguer à Toolbar para abrir o Drawer
            ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, drawerLayout, toolbar,
                    R.string.navigation_drawer_open, R.string.navigation_drawer_close);
            drawerLayout.addDrawerListener(toggle);
            toggle.syncState();

            // Configurar manipulador de clique para os itens de menu do NavigationView
            navigationView.setOnContextClickListener(new NavigationView.OnNavigationItemSelectedListener() {
                @Override
                public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                    // Fecha o Drawer quando um item de menu é selecionado
                    drawerLayout.closeDrawer(GravityCompat.START);

                    // Ação a ser executada com base no item de menu selecionado
                    switch (menuItem.getItemId()) {
                        case R.id.:
                            // Navegar para a tela "Início"
                            // Exemplo: startActivity(new Intent(MainActivity.this, InicioActivity.class));
                            break;
                        case R.id.nav_item_extrato:
                            // Navegar para a tela "Extrato"
                            // Exemplo: startActivity(new Intent(MainActivity.this, ExtratoActivity.class));
                            break;
                        case R.id.nav_item_transferencias:
                            // Navegar para a tela "Transferências"
                            // Exemplo: startActivity(new Intent(MainActivity.this, TransferenciasActivity.class));
                            break;
                        // Adicione mais casos para outros itens de menu, se necessário
                    }

                    return true;
                }
            });
        }

        @Override
        public void onBackPressed() {
            // Fecha o Drawer se estiver aberto ao pressionar o botão "Voltar"
            if (drawerLayout.isDrawerOpen(GravityCompat.START)) {
                drawerLayout.closeDrawer(GravityCompat.START);
            } else {
                super.onBackPressed();*/
            }
 //       }
    //}
            // }
}