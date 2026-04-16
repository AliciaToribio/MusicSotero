package org.example.dao;

import org.example.model.Artista;
import java.util.ArrayList;
import java.util.List;

public class ArtistaDAO {
    
    private List<Artista> artistas = new ArrayList<>();

    public void guardar(Artista artista) {
        if (artista != null) {
            artistas.add(artista);
        }
    }

    public void eliminar(String id) {
        artistas.removeIf(a -> a.getId() != null && a.getId().equals(id));
    }

    public Artista buscarPorId(String id) {
        for (Artista a : artistas) {
            if (a.getId() != null && a.getId().equals(id)) {
                return a;
            }
        }
        return null;
    }

    public List<Artista> listarTodos() {
        return new ArrayList<>(artistas);
    }

    public void actualizar(Artista artista) {
        if (artista != null && artista.getId() != null) {
            for (int i = 0; i < artistas.size(); i++) {
                if (artistas.get(i).getId() != null && artistas.get(i).getId().equals(artista.getId())) {
                    artistas.set(i, artista);
                    return;
                }
            }
        }
    }
}
