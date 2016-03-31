package com.example.reinaldo.aula1;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    int alturaEmCentimetros = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final TextView txt2 = (TextView)findViewById(R.id.txt2);
        final TextView txt3 = (TextView)findViewById(R.id.txt3);

        final SeekBar sk1 = (SeekBar)findViewById(R.id.sk1);
        sk1.setMax(230);
        sk1.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                alturaEmCentimetros = progress;
                String texto = formataValorComDoisDigitos (progress / 100.0);
                texto += "m.";
                txt2.setText(texto);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
                txt2.setText("pé(s): toque em converter");
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        final Button bt1 = (Button)findViewById(R.id.bt1);
        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double alturaEmPes = alturaEmCentimetros / 30.48;
                String texto = formataValorComDoisDigitos(alturaEmPes);
                texto += " pé(s)";
                txt3.setText(texto);
            }
        });
    }
    private String formataValorComDoisDigitos(double valor){
        return String.format(Locale.FRANCE, "%.2f", valor);
    }
}
