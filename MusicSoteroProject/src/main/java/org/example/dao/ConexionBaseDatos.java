package org.example.dao;

public class ConexionBaseDatos {

    private String url;
    private String usuario;
    private String contrasena;
    
    public ConexionBaseDatos() {
    }

    public ConexionBaseDatos(String url, String usuario, String contrasena) {
        this.url = url;
        this.usuario = usuario;
        this.contrasena = contrasena;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public void conectar() {
        System.out.println("Conectando a la base de datos en " + url + "...");
    }

    public void desconectar() {
        System.out.println("Desconectando de la base de datos...");
    }
}
