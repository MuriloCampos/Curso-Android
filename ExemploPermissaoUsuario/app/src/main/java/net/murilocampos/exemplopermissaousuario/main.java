package net.murilocampos.exemplopermissaousuario;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class main extends Activity {

    // String usada para representar a operação perigosa
    public static final String ACTION_BOOM =
            "curso.exemplos.exemplopermissao.boom.boom_action";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button b = (Button)findViewById(R.id.button);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ACTION_BOOM));
            }
        });

    }
}
