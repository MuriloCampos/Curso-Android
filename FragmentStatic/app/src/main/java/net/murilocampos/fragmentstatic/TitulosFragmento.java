package net.murilocampos.fragmentstatic;

import android.app.Activity;
import android.app.ListFragment;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class TitulosFragmento extends ListFragment {

    private ListSelectionListener mListener = null;
    private static final String TAG = "TitlesFragment";

    // Interface de Callback que permite a este fragmento notificar a ViewerActivity quando um usuário
    // seleciona em um item da lista
    public interface ListSelectionListener {
        public void onListSelection(int index);
    }

    // Chamado quando o usuario seleciona um item da lista
    @Override
    public void onListItemClick(ListView l, View v, int pos, long id) {

        // Indica que o item selecionado foi... selecionado
        getListView().setItemChecked(pos, true);

        // Informa a ViewerActivity que o item na posição "pos" foi selecionado
        mListener.onListSelection(pos);
    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        try {

            // Configura o ListSelectionListener para se comunicar com a ViewerActivity
            mListener = (ListSelectionListener) activity;

        } catch (ClassCastException e) {
            throw new ClassCastException(activity.toString()
                    + " must implement OnArticleSelectedListener");
        }
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        Log.i(TAG, getClass().getSimpleName() + ":entered onCreate()");
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        Log.i(TAG, getClass().getSimpleName() + ":entered onCreate()");
        return super.onCreateView(inflater, container, savedInstanceState);
    }

    @Override
    public void onActivityCreated(Bundle savedState) {
        super.onActivityCreated(savedState);

        // Configurar o tipo de escolha da lista para permitir apenas uma seleção por vez
        getListView().setChoiceMode(ListView.CHOICE_MODE_SINGLE);

        // Configura o Adapter de listas para a ListView
        // Será discutido nas aulas de interface de usuário
        setListAdapter(new ArrayAdapter<String>(getActivity(),
                R.layout.activity_titulos_fragmento, ViewerActivity.mTitleArray));
    }

    @Override
    public void onStart() {
        Log.i(TAG, getClass().getSimpleName() + ":entered onStart()");
        super.onStart();
    }

    @Override
    public void onResume() {
        Log.i(TAG, getClass().getSimpleName() + ":entered onResume()");
        super.onResume();
    }

    @Override
    public void onPause() {
        Log.i(TAG, getClass().getSimpleName() + ":entered onPause()");
        super.onPause();
    }

    @Override
    public void onStop() {
        Log.i(TAG, getClass().getSimpleName() + ":entered onStop()");
        super.onStop();
    }

    @Override
    public void onDetach() {
        Log.i(TAG, getClass().getSimpleName() + ":entered onDetach()");
        super.onDetach();
    }

    @Override
    public void onDestroy() {
        Log.i(TAG, getClass().getSimpleName() + ":entered onDestroy()");
        super.onDestroy();
    }

    @Override
    public void onDestroyView() {
        Log.i(TAG, getClass().getSimpleName() + ":entered onDestroyView()");
        super.onDestroyView();
    }
}
