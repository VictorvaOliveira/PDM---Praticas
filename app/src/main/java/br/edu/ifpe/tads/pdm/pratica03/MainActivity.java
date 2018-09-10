package br.edu.ifpe.tads.pdm.pratica03;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import static br.edu.ifpe.tads.pdm.pratica03.R.id.city_name;
import static br.edu.ifpe.tads.pdm.pratica03.R.id.parent;

public class MainActivity extends AppCompatActivity {

    private static final City[] cities = {
            new City("Recife", "Pernambuco"),
            new City("João Pessoa", "Paraíba"),
            new City("Salvador", "Bahia"),
            new City("Rio Branco", "Acre"),
            new City("Porto Alegre", "Rio Grande do Sul"),
            new City("Vitória","Espírito Santo"),
            new City("Belo Horizonte","Minas Gerias"),
            new City("Manaus","Amazonas"),
            new City("Pará","Belém"),
            new City("Maceió","Alagoas"),
            new City("Aracaju","Sergipe"),
            new City("Fortaleza","Ceará"),
            new City("Natal", "Rio Grande do Norte"),
            new City("São Paulo", "São Paulo"),
            new City("Rio de Janeiro", "Rio de Janeiro"),
            new City("Santa Catarina", "Florianópolis")
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listView = (ListView) findViewById(R.id.list_view);
        listView.setAdapter(new CityArrayListAdapter(this, R.layout.city_listitem, cities));

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, final View view, int position, long id) {
                Toast.makeText(adapterView.getContext(), "Cidade selecionada: "
                        + cities[position], Toast.LENGTH_LONG).show();
            }
        });
    }
}
