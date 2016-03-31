package net.murilocampos.fragmentstatic;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import net.murilocampos.fragmentstatic.TitulosFragmento.ListSelectionListener;

public class ViewerActivity extends Activity implements
        ListSelectionListener{

    public static String[] mTitleArray;
    public static String[] mQuoteArray;
    private CitacoesFragment mDetailsFragment;

    private static final String TAG = "ViewerActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //Pegar os arrays de string com os titulos e as citações
        mTitleArray = getResources().getStringArray(R.array.Titles);
        mQuoteArray = getResources().getStringArray(R.array.Quotes);

        setContentView(R.layout.activity_viewer);

        // pegar uma referência para CitacoesFragment
        mDetailsFragment = (CitacoesFragment) getFragmentManager()
                .findFragmentById(R.id.details);
    }

    //método chamado quando um usuário seleciona um item no TitulosFragmento
    @Override
    public void onListSelection(int index) {
        if (mDetailsFragment.getShownIndex() != index) {

            // Diz para a ViewrActivity para mostrar a string quote na posição index
            mDetailsFragment.showQuoteAtIndex(index);
        }
    }

    @Override
    protected void onDestroy() {
        Log.i(TAG, getClass().getSimpleName() + ":entered onDestroy()");
        super.onDestroy();
    }

    @Override
    protected void onPause() {
        Log.i(TAG, getClass().getSimpleName() + ":entered onPause()");
        super.onPause();
    }

    @Override
    protected void onRestart() {
        Log.i(TAG, getClass().getSimpleName() + ":entered onRestart()");
        super.onRestart();
    }

    @Override
    protected void onResume() {
        Log.i(TAG, getClass().getSimpleName() + ":entered onResume()");
        super.onResume();
    }

    @Override
    protected void onStart() {
        Log.i(TAG, getClass().getSimpleName() + ":entered onStart()");
        super.onStart();
    }

    @Override
    protected void onStop() {
        Log.i(TAG, getClass().getSimpleName() + ":entered onStop()");
        super.onStop();
    }
}
