package org.example.usuario;

public class ValidacionUsuario {

    public boolean validarEmail(String email) {
        if (email == null || email.trim().isEmpty()) {
            return false;
        }
        return email.contains("@") && email.contains(".");
    }

    public boolean validarContrasena(String contrasena) {
        if (contrasena == null) {
            return false;
        }
        return contrasena.length() >= 6;
    }

    public boolean validarNombreUsuario(String nombreUsuario) {
        if (nombreUsuario == null) {
            return false;
        }
        return nombreUsuario.length() >= 3;
    }
}
