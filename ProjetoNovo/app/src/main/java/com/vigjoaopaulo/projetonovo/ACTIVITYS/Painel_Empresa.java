package com.vigjoaopaulo.projetonovo.ACTIVITYS;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import com.vigjoaopaulo.projetonovo.ADAPTERS.AnuncioAdapter;
import com.vigjoaopaulo.projetonovo.MODEL.Anuncios;
import com.vigjoaopaulo.projetonovo.R;

import java.util.ArrayList;

public class Painel_Empresa extends AppCompatActivity {
    private ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_painel_empresa);
        listView = (ListView) findViewById(R.id.listViewEmpresa);
        listView.setAdapter(new AnuncioAdapter(Painel_Empresa.this, R.layout.modelo, getPProduto()));
        TextView nota = (TextView) findViewById(R.id.txtNota);


        int count = listView.getAdapter().getCount();

        Log.e("Qtd_lista" , String.valueOf(count));


    }

    private ArrayList<Anuncios> getPProduto(){
        ArrayList<Anuncios> anuncios = new ArrayList<>();

        Anuncios a = new Anuncios(1, "Posto São Carlos","Gasolina",
                5.999, "Centro", "161", "Sao Carlos","SP", 3);
        anuncios.add(a);

        a = new Anuncios(2, "Posto Ibate","Alcool",
                5.999, "Distrito Industrial", "161", "Ibaté","SP", 2);
        anuncios.add(a);

        a = new Anuncios(3, "Posto Araraquara","Diesel",
                5.999, "Araraquara", "161", "Ibaté","SP", 1);
        anuncios.add(a);

        return anuncios;
    }
}