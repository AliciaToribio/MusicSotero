package org.example.model;

import java.util.List;

public class Usuario {
    private String id;
    private String nombreDeUsuario;
    private String correoElectronico;
    private String contrasena;
    private List<Playlist> playlistsCreadas;
    private List<Cancion> cancionesFavoritas;
    private List<Artista> artistasSeguidos;

    public void iniciarSesion() {}
    public void cerrarSesion() {}
    public void crearPlaylist() {}
    public void darMeGustaCancion() {}
    public void seguirArtista() {}
}
