package org.example.model;

import java.util.List;
import java.util.ArrayList;

public class Usuario {
    private String id;
    private String nombreUsuario;
    private String email;
    private String contrasena;
    private List<Playlist> playlists = new ArrayList<>();
    private List<Cancion> cancionesFavoritas = new ArrayList<>();

    public void registrarse() {
    }

    public void iniciarSesion() {
    }

    public void crearPlaylist(String nombre) {
    }

    public void darMeGusta(Cancion cancion) {
    }
}
