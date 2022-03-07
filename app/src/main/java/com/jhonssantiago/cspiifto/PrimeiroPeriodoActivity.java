package com.jhonssantiago.cspiifto;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class PrimeiroPeriodoActivity extends AppCompatActivity {
    private ListView listView_itens;
    private MyAdapter meuAdapter;
    private ArrayList<Disciplina> disciplinas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_primeiro_periodo);

        listView_itens = findViewById(R.id.listView_itens);
        criarLista();
        meuAdapter = new MyAdapter(getApplicationContext(), disciplinas);
        listView_itens.setAdapter(meuAdapter);


    }

    private void criarLista(){
        disciplinas = new ArrayList<>();
        Disciplina d1 = new Disciplina("Fundamentos de Redes de Computadores", "72 horas");
        Disciplina d2 = new Disciplina("Tendências Tecnológicas para o Mercado de TI", "36 horas");
        Disciplina d3 = new Disciplina("Introdução a Computação", "66 horas");
        Disciplina d4 = new Disciplina("Informática Instrumental", "72 horas");
        Disciplina d5 = new Disciplina("Introdução à Lógica", "72 horas");
        Disciplina d6 = new Disciplina("Inglês Técnico", "30 horas");

        disciplinas.add(d1);
        disciplinas.add(d2);
        disciplinas.add(d3);
        disciplinas.add(d4);
        disciplinas.add(d5);
        disciplinas.add(d6);

    }
}