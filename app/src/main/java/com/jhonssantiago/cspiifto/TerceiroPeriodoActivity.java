package com.jhonssantiago.cspiifto;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ListView;

import java.util.ArrayList;

public class TerceiroPeriodoActivity extends AppCompatActivity {
    private ListView listView_itens;
    private MyAdapter meuAdapter;
    private ArrayList<Disciplina> disciplinas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_terceiro_periodo);

        Toolbar toolbar = findViewById(R.id.my_toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        listView_itens = findViewById(R.id.listView_itens);
        criarLista();
        meuAdapter = new MyAdapter(getApplicationContext(), disciplinas);
        listView_itens.setAdapter(meuAdapter);
    }

    private void criarLista() {
        disciplinas = new ArrayList<>();
        Disciplina d1 = new Disciplina("Introdução à Conectividade", "72 horas");
        Disciplina d2 = new Disciplina("Gerenciamento de Dados para Web", "72 horas");
        Disciplina d3 = new Disciplina("Programação para Banco de Dados", "72 horas");
        Disciplina d4 = new Disciplina("Administração de Sistemas Proprietários", "36 horas");
        Disciplina d5 = new Disciplina("Programação para Web Designers", "36 horas");
        Disciplina d6 = new Disciplina("Programação para Web I", "72 horas");

        disciplinas.add(d1);
        disciplinas.add(d2);
        disciplinas.add(d3);
        disciplinas.add(d4);
        disciplinas.add(d5);
        disciplinas.add(d6);

    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                finish();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        } //switch

    }
}