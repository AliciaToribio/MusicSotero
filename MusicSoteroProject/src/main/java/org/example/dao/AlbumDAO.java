package org.example.dao;

import org.example.model.Album;
import java.util.ArrayList;
import java.util.List;

public class AlbumDAO {

    private List<Album> albumes = new ArrayList<>();

    public void guardar(Album album) {
        if (album != null) {
            albumes.add(album);
        }
    }

    public void eliminar(String id) {
        albumes.removeIf(a -> a.getId() != null && a.getId().equals(id));
    }

    public Album buscarPorId(String id) {
        for (Album a : albumes) {
            if (a.getId() != null && a.getId().equals(id)) {
                return a;
            }
        }
        return null;
    }

    public List<Album> listarTodos() {
        return new ArrayList<>(albumes);
    }

    public void actualizar(Album album) {
        if (album != null && album.getId() != null) {
            for (int i = 0; i < albumes.size(); i++) {
                if (albumes.get(i).getId() != null && albumes.get(i).getId().equals(album.getId())) {
                    albumes.set(i, album);
                    return;
                }
            }
        }
    }
}
