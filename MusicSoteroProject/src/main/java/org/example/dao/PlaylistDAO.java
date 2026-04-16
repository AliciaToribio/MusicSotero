package org.example.dao;

import org.example.model.Playlist;
import java.util.ArrayList;
import java.util.List;

public class PlaylistDAO {
    
    private List<Playlist> playlists = new ArrayList<>();

    public void guardar(Playlist playlist) {
        if (playlist != null) {
            playlists.add(playlist);
        }
    }

    public void eliminar(String id) {
        playlists.removeIf(p -> p.getId() != null && p.getId().equals(id));
    }

    public Playlist buscarPorId(String id) {
        for (Playlist p : playlists) {
            if (p.getId() != null && p.getId().equals(id)) {
                return p;
            }
        }
        return null;
    }

    public List<Playlist> listarTodas() {
        return new ArrayList<>(playlists);
    }

    public void actualizar(Playlist playlist) {
        if (playlist != null && playlist.getId() != null) {
            for (int i = 0; i < playlists.size(); i++) {
                if (playlists.get(i).getId() != null && playlists.get(i).getId().equals(playlist.getId())) {
                    playlists.set(i, playlist);
                    return;
                }
            }
        }
    }
}
