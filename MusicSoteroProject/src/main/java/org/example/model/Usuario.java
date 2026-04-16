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

    public Usuario() {
    }

    public Usuario(String id, String nombreUsuario, String email, String contrasena) {
        this.id = id;
        this.nombreUsuario = nombreUsuario;
        this.email = email;
        this.contrasena = contrasena;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public void registrarse() {
    }

    public void iniciarSesion() {
    }

    public void crearPlaylist(String nombre) {
    }

    public void darMeGusta(Cancion cancion) {
    }
}
