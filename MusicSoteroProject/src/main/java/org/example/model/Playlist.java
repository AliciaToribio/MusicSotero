package org.example.model;

import java.util.List;
import java.util.ArrayList;

public class Playlist {
    private String id;
    private String nombre;
    private String descripcion;
    private Usuario creador;
    private List<Cancion> canciones = new ArrayList<>();
    private boolean esPublica;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void agregarCancion(Cancion cancion) {
    }

    public void eliminarCancion(Cancion cancion) {
    }

    public void cambiarPrivacidad(boolean publica) {
    }
}
