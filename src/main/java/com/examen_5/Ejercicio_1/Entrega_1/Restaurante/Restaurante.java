package com.examen_5.Ejercicio_1.Entrega_1.Restaurante;

import com.examen_5.Ejercicio_1.Entrega_1.EstrategiasServicio.EstrategiaServicio;

public abstract class Restaurante {
    protected String nombre;
    protected EstrategiaServicio estrategiaServicio;

    public Restaurante(String nombre) {
        this.nombre = nombre;
    }

    public void servir() {
        estrategiaServicio.servir();
    }

    public void establecerEstrategiaServicio(EstrategiaServicio estrategia) {
        this.estrategiaServicio = estrategia;
    }

    public abstract void mostrarDetalles();
}

