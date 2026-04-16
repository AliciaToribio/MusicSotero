package org.example.usuario;

public class ValidacionUsuario {

    public boolean validarEmail(String email) {
        return email != null && !email.trim().isEmpty() && email.contains("@") && email.contains(".");
    }

    public boolean validarContrasena(String contrasena) {
        return contrasena != null && contrasena.length() >= 6;
    }

    public boolean validarNombreUsuario(String nombreUsuario) {
        return nombreUsuario != null && nombreUsuario.length() >= 3;
    }
}
