package org.example.model;

import java.util.List;
import java.util.ArrayList;

public class Artista {
    private String id;
    private String nombre;
    private String biografia;
    private List<Album> discografia = new ArrayList<>();
    private int oyentesMensuales;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void publicarAlbum(Album album) {
        // TODO: Implementar lógica
    }

    public void obtenerCancionesMasEscuchadas() {
        // TODO: Implementar lógica
    }
}
