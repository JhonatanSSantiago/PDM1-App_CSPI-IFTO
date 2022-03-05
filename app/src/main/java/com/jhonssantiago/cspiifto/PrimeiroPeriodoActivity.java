package com.jhonssantiago.cspiifto;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class PrimeiroPeriodoActivity extends AppCompatActivity {
    private TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_primeiro_periodo);

        textView = findViewById(R.id.textView_java);

        String msg = getIntent().getStringExtra("dados");
        textView.setText(msg);
    }
}