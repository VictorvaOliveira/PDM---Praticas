package br.edu.ifpe.tads.pdm.pratica04;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout);
    }

    public void onClick() {

    }

    public void buttonInsertClick(View view) {
        String name = ((EditText) findViewById(R.id.edit_name)).getText().toString();
        String grade = ((EditText) findViewById(R.id.edit_grade)).getText().toString();

        SharedPreferences preferences = getPreferences(Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = preferences.edit();
        editor.putString(name, grade);
        editor.apply();

        Toast.makeText(this, "Salvo: " + name, Toast.LENGTH_SHORT).show();
    }

    public void buttonQueryClick(View view) {
        String name = ((EditText) findViewById(R.id.edit_name)).getText().toString();
        SharedPreferences preferences = getPreferences(Context.MODE_PRIVATE);
        String grade = preferences.getString(name, "[Não encontrado]");
        ((EditText) findViewById(R.id.edit_grade)).setText(grade);
    }

    public void buttonDeleteClick(View view) {
        String name = ((EditText) findViewById(R.id.edit_name)).getText().toString();
        SharedPreferences preferences = getPreferences(Context.MODE_PRIVATE);
        //String apagar = preferences.getString(name, "[Não encontrado]");
        SharedPreferences.Editor editor = preferences.edit();
        editor.remove(name);
        editor.apply();

        Toast.makeText(this, "Removido: " + name, Toast.LENGTH_SHORT).show();
    }
}
