package org.example.dao;

import org.example.model.Cancion;
import java.util.ArrayList;
import java.util.List;

public class CancionDAO {

    private List<Cancion> canciones = new ArrayList<>();

    public void guardar(Cancion cancion) {
        if (cancion != null) {
            canciones.add(cancion);
        }
    }

    public void eliminar(String id) {
        canciones.removeIf(c -> c.getId() != null && c.getId().equals(id));
    }

    public Cancion buscarPorId(String id) {
        for (Cancion c : canciones) {
            if (c.getId() != null && c.getId().equals(id)) {
                return c;
            }
        }
        return null;
    }

    public List<Cancion> listarTodas() {
        return new ArrayList<>(canciones);
    }

    public void actualizar(Cancion cancion) {
        if (cancion != null && cancion.getId() != null) {
            for (int i = 0; i < canciones.size(); i++) {
                if (canciones.get(i).getId() != null && canciones.get(i).getId().equals(cancion.getId())) {
                    canciones.set(i, cancion);
                    return;
                }
            }
        }
    }
}
