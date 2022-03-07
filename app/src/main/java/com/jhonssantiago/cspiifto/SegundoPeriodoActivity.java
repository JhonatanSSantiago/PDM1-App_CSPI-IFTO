package com.jhonssantiago.cspiifto;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class SegundoPeriodoActivity extends AppCompatActivity {
    private ListView listView_itens;
    private MyAdapter meuAdapter;
    private ArrayList<Disciplina> disciplinas;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segundo_periodo);

        listView_itens = findViewById(R.id.listView_itens);
        criarLista();
        meuAdapter = new MyAdapter(getApplicationContext(), disciplinas);
        listView_itens.setAdapter(meuAdapter);
    }

    private void criarLista(){
        disciplinas = new ArrayList<>();
        Disciplina d1 = new Disciplina("Fundamentos e Projeto de Banco de Dados", "72 horas");
        Disciplina d2 = new Disciplina("Análise de Sistemas", "72 horas");
        Disciplina d3 = new Disciplina("Introdução à Programação", "80 horas");
        Disciplina d4 = new Disciplina("Programação Orientada a Objetos", "72 horas");
        Disciplina d5 = new Disciplina("Programação Básica para Web", "72 horas");

        disciplinas.add(d1);
        disciplinas.add(d2);
        disciplinas.add(d3);
        disciplinas.add(d4);
        disciplinas.add(d5);

    }
}