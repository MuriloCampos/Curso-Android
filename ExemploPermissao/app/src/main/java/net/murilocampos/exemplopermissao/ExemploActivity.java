package net.murilocampos.exemplopermissao;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class ExemploActivity extends AppCompatActivity {

    // String usada para representar a operação perigosa
    public static final String ACTION_BOOM =
            "curso.exemplos.exemplopermissao.boom.boom_action";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exemplo);
    }
}
