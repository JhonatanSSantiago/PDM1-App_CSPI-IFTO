package com.jhonssantiago.cspiifto;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class MyAdapter extends BaseAdapter {
    private LayoutInflater inflater;
    private ArrayList<Disciplina> disciplinaArrayList;


    public MyAdapter(Context context, ArrayList<Disciplina> disciplinaArrayList) {
        this.disciplinaArrayList = disciplinaArrayList;
        inflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return disciplinaArrayList.size();
    }

    @Override
    public Object getItem(int position) {
        return disciplinaArrayList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View view, ViewGroup viewGroup) {
        Disciplina disciplina= disciplinaArrayList.get(position);

        view = inflater.inflate(R.layout.details, null); //view vazia

        TextView textViewDisciplina = view.findViewById(R.id.textView_NomeDisciplina); //preenchendo view
        textViewDisciplina.setText(disciplina.getNome());
        TextView textViewCargaHoraria = view.findViewById(R.id.textView_CargaHoraria);
        textViewCargaHoraria.setText(disciplina.getCarga_horaria());


        return view;
    }
}
