package com.example.pedro.charlesbradleytribute;

import java.io.Serializable;

/**
 * Created by Pedro on 01/11/2017.
 */

public class Disco implements Serializable {
    private int  id;
    private String nombreDisco;
    private String Año;
    private int portada;
    private String [] listaCanciones;
    private String []  listaCancionesURL;


    public Disco(int id,String nombreDisco, String año, int portada, String[] listaCanciones, String[] listaCancionesURL) {
        this.id=id;
        this.nombreDisco = nombreDisco;
        Año = año;
        this.portada = portada;
        this.listaCanciones = listaCanciones;
        this.listaCancionesURL = listaCancionesURL;
    }

    public String getNombreDisco() {
        return nombreDisco;
    }

    public String getAño() {
        return Año;
    }

    public int getPortada() {
        return portada;
    }

    public String[] getListaCanciones() {
        return listaCanciones;
    }

    public String[] getListaCancionesURL() {
        return listaCancionesURL;
    }

    public int getId() {
        return id;
    }
}
