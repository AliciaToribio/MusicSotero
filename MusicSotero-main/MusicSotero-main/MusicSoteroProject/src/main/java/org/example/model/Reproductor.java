package org.example.model;

import java.util.List;

public class Reproductor {
    private Cancion cancionActual;
    private List<Cancion> colaDeReproduccion;
    private String estadoPlayback;
    private int volumenActual;
    private int progresoActualSegundos;

    public void play() {}
    public void pausa() {}
    public void siguienteCancion() {}
    public void cancionAnterior() {}
    public void buscarTiempo(int minuto, int segundo) {}
    public void cambiarVolumen(int volumen) {}
}
