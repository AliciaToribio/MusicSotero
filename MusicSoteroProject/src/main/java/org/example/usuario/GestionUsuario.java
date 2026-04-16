package org.example.usuario;

import org.example.model.Usuario;
import org.example.model.Cancion;
import org.example.dao.UsuarioDAO;

public class GestionUsuario {

    private Usuario usuarioActual;

    public void registrar(String nombreUsuario, String email, String contrasena) {
        ValidacionUsuario validador = new ValidacionUsuario();
        if (validador.validarNombreUsuario(nombreUsuario) && validador.validarEmail(email) && validador.validarContrasena(contrasena)) {
            Usuario nuevoUsuario = new Usuario(String.valueOf(System.currentTimeMillis()), nombreUsuario, email, contrasena);
            UsuarioDAO dao = new UsuarioDAO();
            dao.guardar(nuevoUsuario);
            System.out.println("Usuario registrado correctamente con email: " + email);
        } else {
            System.out.println("Error: los datos de registro no son validos.");
        }
    }

    public boolean iniciarSesion(String email, String contrasena) {
        UsuarioDAO dao = new UsuarioDAO();
        Usuario usuario = dao.buscarPorEmail(email);
        if (usuario != null && usuario.getContrasena() != null && usuario.getContrasena().equals(contrasena)) {
            this.usuarioActual = usuario;
            return true;
        }
        return false;
    }

    public void cerrarSesion() {
        this.usuarioActual = null;
    }

    public void crearPlaylist(String nombre) {
        if (this.usuarioActual != null) {
            this.usuarioActual.crearPlaylist(nombre);
        } else {
            System.out.println("No hay un usuario logueado. Inicia sesion primero.");
        }
    }

    public void darMeGusta(Cancion cancion) {
        if (this.usuarioActual != null) {
            this.usuarioActual.darMeGusta(cancion);
        } else {
            System.out.println("No hay un usuario logueado. Inicia sesion primero.");
        }
    }

    public Usuario getUsuarioActual() {
        return usuarioActual;
    }

    public void setUsuarioActual(Usuario usuarioActual) {
        this.usuarioActual = usuarioActual;
    }
}
