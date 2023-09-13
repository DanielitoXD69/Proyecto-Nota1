package com.example.proyecto_nota1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class Acceder extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio);
    }
    public void onClickSBC(View view){
        Intent intent = new Intent(this, SBC.class);
        startActivity(intent);

    }
    public void onClickCartas(View view){
        Intent intent = new Intent(this, Cartas.class);
        startActivity(intent);

    }
}
