package br.nom.souza.santiago.mapa_inf311tp3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Primeira extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_primeira);

        ListView listview = (ListView) findViewById(R.id.menuPrincipal);
        String[] dados = new String[] { "Minha casa na Cidade Natal", "Minha casa em Viçosa", "Meu departamento", "Fechar aplicativo" };
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, dados);
        listview.setAdapter(adapter);
    }
}
