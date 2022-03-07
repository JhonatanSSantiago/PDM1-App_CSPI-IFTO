package com.jhonssantiago.cspiifto;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;

import java.util.ArrayList;

public class QuintoPeriodoActivity extends AppCompatActivity {
    private ListView listView_itens;
    private MyAdapter meuAdapter;
    private ArrayList<Disciplina> disciplinas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quinto_periodo);

        Toolbar toolbar = findViewById(R.id.my_toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        listView_itens = findViewById(R.id.listView_itens);
        criarLista();
        meuAdapter = new MyAdapter(getApplicationContext(), disciplinas);
        listView_itens.setAdapter(meuAdapter);
    }

    private void criarLista(){
        disciplinas = new ArrayList<>();
        Disciplina d1 = new Disciplina("Segurança de Sistemas", "36 horas");
        Disciplina d2 = new Disciplina("Infraestrutura para Sistemas Web", "36 horas");
        Disciplina d3 = new Disciplina("Administração de Banco de Dados", "72 horas");
        Disciplina d4 = new Disciplina("Novas Tecnologias em BD", "72 horas");
        Disciplina d5 = new Disciplina("Programação para Dispositivos Móveis I", "72 horas");
        Disciplina d6 = new Disciplina("Metodologias de Desenvolvimento", "36 horas");

        disciplinas.add(d1);
        disciplinas.add(d2);
        disciplinas.add(d3);
        disciplinas.add(d4);
        disciplinas.add(d5);
        disciplinas.add(d6);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) { //mostra menu
        getMenuInflater().inflate(R.menu.menu_toolbar, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        Intent it = null;
        switch (item.getItemId()){
            case R.id.primeiro_p:
                it = new Intent(getApplicationContext(), PrimeiroPeriodoActivity.class);
                startActivity(it);
                return true;

            case R.id.segundo_p:
                it = new Intent(getApplicationContext(), SegundoPeriodoActivity.class);
                startActivity(it);
                return true;

            case R.id.terceiro_p:
                it = new Intent(getApplicationContext(), TerceiroPeriodoActivity.class);
                startActivity(it);
                return true;

            case R.id.quarto_p:
                it = new Intent(getApplicationContext(), QuartoPeriodoActivity.class);
                startActivity(it);
                return true;

            case R.id.quinto_p:
                it = new Intent(getApplicationContext(), QuintoPeriodoActivity.class);
                startActivity(it);
                return true;

            case R.id.sexto_p:
                it = new Intent(getApplicationContext(), SextoPeriodoActivity.class);
                startActivity(it);
                return true;

            case android.R.id.home:
                finish();
                return true;

            default:
                return super.onOptionsItemSelected(item);
        } //switch

    }
}