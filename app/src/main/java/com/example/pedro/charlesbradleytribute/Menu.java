package com.example.pedro.charlesbradleytribute;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;

import java.io.Serializable;
import java.util.ArrayList;

public class Menu extends AppCompatActivity  /*implements AdapterView.OnItemClickListener */{
    ArrayList<Disco> discos;
    ListView listaDiscos;
    discoAdaptador miAdaptador;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        listaDiscos=(ListView)findViewById(R.id.lvListaDiscos);
        discos=new ArrayList<Disco>();

//***********  DATOS DISCOS **********

        //NO TIME FOR DREAMING
        String [] ntfd={
                "The World (Is Going Up In Flames)" ,
                "The Telephone Song",
                "Golden Rule",
                "I Believe In Your Love",
                "Trouble In The Land",
                "Lovin' You, Baby",
                "No Time for Dreaming",
                "How Long",
                "In You (I Found a Love)",
                "Why Is It So Hard",
                "Since Our Last Goodbye",
                "Heartaches and Pain",
                "Heart of Gold",
                "Stay Away"
        };
        String [] ntfdURL={
                "https://youtu.be/q2CUnqOk0Rc",
                " https://youtu.be/bYSiJzu7qF8",
                "https://youtu.be/WzYzAcSjkao",
                "https://youtu.be/uf4nE-cx7aU",
                "https://youtu.be/yXcsrfUbTOQ",
                "https://youtu.be/6slbqEMiKsI",
                "https://youtu.be/IaA0fTbY3e4",
                "https://youtu.be/vZOwW-M9Z6c",
                "https://youtu.be/bicWlk967tc",
                "https://youtu.be/yBdTVmSVq14",
                "https://youtu.be/9_10_TNEK3Y",
                "https://youtu.be/7BEFY1SfQZI",
                "https://youtu.be/M48n14qBAgU",
                "https://youtu.be/XeTDOCUYvr4"
        };
        //VICTIM OF LOVE
        String [] vol={
                "Strictly Reserved for You",
                "You Put the Flame on It",
                "Let Love Stand a Chance",
                "Victim of Love",
                "Love Bug Blues",
                "Dusty Blue",
                "Confusion",
                "Where Do We Go from Here",
                "Crying in the Chapel",
                "Hurricane",
                "Through the Storm"
        };
        String [] volURL={
                "https://youtu.be/vXXbipaGDD8",
                "https://youtu.be/HpXavW7mqyM",
                "https://youtu.be/LFfv7v5R2f8",
                "https://youtu.be/gxFYkoAFZAY",
                "https://youtu.be/Yz32TrICo-A",
                "https://youtu.be/rRkGsh9f-pY",
                "https://youtu.be/LDADBUPHt3U",
                "https://youtu.be/LMuu4h6RdyQ",
                " https://youtu.be/enzO8qyf7YQ",
                "https://youtu.be/z-zTw7TWWws",
                "https://youtu.be/7ED_mwySAhM"

        };

        //CHANGES
        String [] chang={
                "God Bless America",
                "Good to Be Back Home",
                "Nobody But You",
                "Ain't Gonna Give It Up",
                "Changes",
                "Ain't It a Sin",
                "Things We Do For Love",
                "Crazy for Your Love",
                "You Think I Don't Know (But I Know)",
                "Change For the World",
                "Slow Love"
        };
        String [] chagURL={
                "https://youtu.be/fuaRC21fqSo",
                "https://youtu.be/mMl7QdMmMPg",
                "https://youtu.be/wXsDts01tp4",
                "https://youtu.be/cSaW6F721_g",
                "https://youtu.be/xi49yirJiEA",
                "https://youtu.be/UD1eaRDY-q4",
                "https://youtu.be/bSf5Q_w-WqU",
                "https://youtu.be/mu3BlmTnBAo",
                "https://youtu.be/Q5Ul7AkHu04",
                "https://youtu.be/Za-MIjJnzPM",
                "https://youtu.be/HXZ04feT1WY"

        };
        Disco noTimeForDreaming=new Disco(1,"No Time For Dreaming","2011",R.mipmap.ntfd,ntfd,ntfdURL);
        Disco victimOfLove=new Disco(2,"Victim of Love","2013",R.mipmap.vol,vol,volURL);
        Disco changes=new Disco(3,"Changes","2017",R.mipmap.changes,chang,chagURL);



        //***********  FINAL DATOS  **********


        discos.add(victimOfLove);
        discos.add(noTimeForDreaming);
        discos.add(changes);

        //
        miAdaptador=new discoAdaptador(this, discos);
        listaDiscos.setAdapter(miAdaptador);

        listaDiscos.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                //RECOJO UN COCHE DE LA POSICION DE LA LIST VIEW
                Disco coche = (Disco) adapterView.getItemAtPosition(i);

                //MANDO EL OBJETO SELECCIONADO EN EL LISTVIEW A MI NUEVO ACTIVITY DETALLE
                Intent e = new Intent(getApplicationContext(), ListaCanciones.class);
                e.putExtra("objeto", (Serializable) coche);
                startActivity(e);

            }
        });





    }
/*
    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        //tvNombre.setText(animales.get(position).getNombre());

        //ImageView foto=(ImageView) findViewById(R.id.ivFoto);

       // foto.setImageResource(discos.get(i).getPortada());
       Disco obj =discos.get(i);
        Intent paso = new Intent(getApplicationContext(), ListaCanciones.class);
        paso.putExtra("objeto", (Serializable)obj);
        startActivity(paso);
    }*/
}
