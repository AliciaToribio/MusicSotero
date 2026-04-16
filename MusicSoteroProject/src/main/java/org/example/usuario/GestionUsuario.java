package org.example.usuario;

import org.example.model.Usuario;
import org.example.model.Cancion;
import org.example.dao.UsuarioDAO;

public class GestionUsuario {

    private Usuario usuarioActual;
    private UsuarioDAO usuarioDAO;
    private ValidacionUsuario validacionUsuario;

    public GestionUsuario() {
        this.usuarioDAO = new UsuarioDAO();
        this.validacionUsuario = new ValidacionUsuario();
    }

    public void registrar(String nombreUsuario, String email, String contrasena) {
        if (validacionUsuario.validarNombreUsuario(nombreUsuario) &&
            validacionUsuario.validarEmail(email) &&
            validacionUsuario.validarContrasena(contrasena)) {
            
            String id = String.valueOf(System.currentTimeMillis());
            Usuario nuevoUsuario = new Usuario(id, nombreUsuario, email, contrasena);
            usuarioDAO.guardar(nuevoUsuario);
            System.out.println("Usuario registrado correctamente: " + nombreUsuario);
        } else {
            System.out.println("Error en la validación de los datos del usuario.");
        }
    }

    public boolean iniciarSesion(String email, String contrasena) {
        Usuario usuario = usuarioDAO.buscarPorEmail(email);
        if (usuario != null && usuario.getContrasena() != null && usuario.getContrasena().equals(contrasena)) {
            this.usuarioActual = usuario;
            System.out.println("Inicio de sesión exitoso.");
            return true;
        }
        System.out.println("Credenciales incorrectas.");
        return false;
    }

    public void cerrarSesion() {
        this.usuarioActual = null;
        System.out.println("Sesión cerrada.");
    }

    public void crearPlaylist(String nombre) {
        if (this.usuarioActual == null) {
            System.out.println("Debe iniciar sesión para crear una playlist.");
            return;
        }
        this.usuarioActual.crearPlaylist(nombre);
        System.out.println("Playlist creada: " + nombre);
    }

    public void darMeGusta(Cancion cancion) {
        if (this.usuarioActual == null) {
            System.out.println("Debe iniciar sesión para dar me gusta a una canción.");
            return;
        }
        this.usuarioActual.darMeGusta(cancion);
        System.out.println("Me gusta añadido a la canción.");
    }

    public Usuario getUsuarioActual() {
        return usuarioActual;
    }

    public void setUsuarioActual(Usuario usuarioActual) {
        this.usuarioActual = usuarioActual;
    }
}
