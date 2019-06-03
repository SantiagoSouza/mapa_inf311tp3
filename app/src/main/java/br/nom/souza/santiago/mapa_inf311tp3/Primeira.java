package br.nom.souza.santiago.mapa_inf311tp3;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.Toast;

import java.time.Instant;

public class Primeira extends Activity {
    private Bundle ponte;
    private Intent tela_mapa;
    private ListView listItemView;

    // Define string array.
    String[] listItemsValue = new String[] { "Minha casa na Cidade Natal", "Minha casa em Viçosa", "Meu departamento", "Fechar aplicativo" };



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_primeira);

        listItemView = (ListView) findViewById(R.id.menuPrincipal);
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, listItemsValue);
        listItemView.setAdapter(adapter);
        // ListView setOnItemClickListener function apply here.


        listItemView.setOnItemClickListener(new OnItemClickListener()
        {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String texto ="";
              //  ponte = new Bundle();
                switch (position) {
                    case 0:
                        // Minha casa na Cidade Natal
                        /*ponte = new Bundle();
                        ponte.putDouble("S",-19.921522);
                        ponte.putDouble("w",-44.473072);
                        tela_mapa.putExtras(ponte);*/
                        texto = listItemsValue[0];
                    break;
                    case 1:
                        // Minha casa em Viçosa
                        /*ponte = new Bundle();
                        ponte.putDouble("S",-20.763050);
                        ponte.putDouble("w",-42.869203);
                        tela_mapa.putExtras(ponte);*/
                        texto = listItemsValue[1];
                    break;
                    case 2:
                        // Meu departamento
                        /*ponte = new Bundle();
                        ponte.putDouble("S",-19.884576);
                        ponte.putDouble("w",-44.418111);
                        tela_mapa.putExtras(ponte);*/
                        texto = listItemsValue[2];
                    break;
                    case 3:
                        // Fechar aplicativo
                        finish();
                    break;
                }

             //   tela_mapa = new Intent(getBaseContext(), Mapa.class);
               // startActivity(tela_mapa);
                // TODO Auto-generated method stub
                Toast.makeText(Primeira.this, Integer.toString(position) , Toast.LENGTH_SHORT).show();

            }
        });


    }



}
