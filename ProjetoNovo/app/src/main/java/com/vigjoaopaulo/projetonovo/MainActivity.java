package com.vigjoaopaulo.projetonovo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.vigjoaopaulo.projetonovo.ACTIVITYS.Painel_Empresa;
import com.vigjoaopaulo.projetonovo.ACTIVITYS.Painel_Usuario;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void usuario(View view) {
        Intent intent = new Intent(MainActivity.this, Painel_Usuario.class);
        startActivity(intent);
    }

    public void empresa(View view) {
        Intent intent = new Intent(MainActivity.this, Painel_Empresa.class);
        startActivity(intent);
    }
}