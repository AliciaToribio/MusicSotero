package org.example.dao;

import org.example.model.Usuario;
import java.util.ArrayList;
import java.util.List;

public class UsuarioDAO {

    private List<Usuario> usuarios = new ArrayList<>();

    public void guardar(Usuario usuario) {
        if (usuario != null) {
            usuarios.add(usuario);
        }
    }

    public void eliminar(String id) {
        usuarios.removeIf(u -> u.getId() != null && u.getId().equals(id));
    }

    public Usuario buscarPorId(String id) {
        for (Usuario u : usuarios) {
            if (u.getId() != null && u.getId().equals(id)) {
                return u;
            }
        }
        return null;
    }

    public Usuario buscarPorEmail(String email) {
        for (Usuario u : usuarios) {
            if (u.getEmail() != null && u.getEmail().equals(email)) {
                return u;
            }
        }
        return null;
    }

    public List<Usuario> listarTodos() {
        return new ArrayList<>(usuarios);
    }

    public void actualizar(Usuario usuario) {
        if (usuario != null && usuario.getId() != null) {
            for (int i = 0; i < usuarios.size(); i++) {
                if (usuarios.get(i).getId() != null && usuarios.get(i).getId().equals(usuario.getId())) {
                    usuarios.set(i, usuario);
                    return;
                }
            }
        }
    }
}
