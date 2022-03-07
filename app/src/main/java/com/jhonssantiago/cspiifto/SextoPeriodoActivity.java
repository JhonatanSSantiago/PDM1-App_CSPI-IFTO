package com.jhonssantiago.cspiifto;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ListView;

import java.util.ArrayList;

public class SextoPeriodoActivity extends AppCompatActivity {
    private ListView listView_itens;
    private MyAdapter meuAdapter;
    private ArrayList<Disciplina> disciplinas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sexto_periodo);

        Toolbar toolbar = findViewById(R.id.my_toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        listView_itens = findViewById(R.id.listView_itens);
        criarLista();
        meuAdapter = new MyAdapter(getApplicationContext(), disciplinas);
        listView_itens.setAdapter(meuAdapter);
    }

    private void criarLista(){
        disciplinas = new ArrayList<>();
        Disciplina d1 = new Disciplina("Novas Tecnologias em Desenvolvimento para Web", "72 horas");
        Disciplina d2 = new Disciplina("Gerência de Configuração", "72 horas");
        Disciplina d3 = new Disciplina("Padrões de Projeto", "72 horas");
        Disciplina d4 = new Disciplina("Programação para Dispositivos Móveis II", "72 horas");

        disciplinas.add(d1);
        disciplinas.add(d2);
        disciplinas.add(d3);
        disciplinas.add(d4);


    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case android.R.id.home:
                finish();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        } //switch

    }
}