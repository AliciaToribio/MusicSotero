package org.example.model;

import java.util.Date;
import java.util.List;

public class Playlist {
    private String id;
    private String nombre;
    private String descripcion;
    private String portada;
    private Usuario creador;
    private boolean esPublica;
    private List<Cancion> canciones;
    private Date fechaCreacion;

    public void agregarCancion(Cancion cancion) {}
    public void eliminarCancion(Cancion cancion) {}
    public void cambiarPrivacidad() {}
    public void compartir() {}
}
