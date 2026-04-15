package org.example.model;

import java.util.Date;
import java.util.List;

public class Album {
    private String id;
    private String titulo;
    private Date fechaLanzamiento;
    private String portada;
    private Artista artistaPrincipal;
    private List<Cancion> listaDeCanciones;
    private String selloDiscografico;

    public void obtenerDuracionTotal() {}
    public void obtenerListaDeCanciones() {}
}
