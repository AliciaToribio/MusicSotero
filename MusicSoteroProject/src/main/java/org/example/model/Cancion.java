package org.example.model;

public class Cancion {
    private String id;
    private String titulo;
    private int duracionSegundos;
    private Artista artista;
    private Album album;
    private int reproducciones;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void reproducir() {
    }

    public void pausar() {
    }

    public void obtenerDetalles() {
    }
}
