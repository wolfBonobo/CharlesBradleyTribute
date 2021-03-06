package com.example.pedro.charlesbradleytribute;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class ListaCanciones extends AppCompatActivity {
    ListView listaCanciones;
    String [] nombreCanciones;
    String [] urlCanciones;
    ArrayAdapter<String> adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_canciones);

        final Disco obj = (Disco) getIntent().getExtras().getSerializable("objeto");
        listaCanciones=(ListView)findViewById(R.id.lvListaCanciones);
        nombreCanciones=obj.getListaCanciones();
        urlCanciones=obj.getListaCancionesURL();

        adapter=new ArrayAdapter<String>(this, android.R.layout.simple_selectable_list_item, nombreCanciones);
        listaCanciones.setAdapter(adapter);

        listaCanciones.setOnItemClickListener(new AdapterView.OnItemClickListener()
        {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                Intent intent = new Intent(getApplicationContext(), navegador.class);
                String url=urlCanciones[i];
                intent.putExtra("parametro", url);
                startActivity(intent);

            }

        });

    }

}
