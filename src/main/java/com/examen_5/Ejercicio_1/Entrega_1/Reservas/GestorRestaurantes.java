package com.examen_5.Ejercicio_1.Entrega_1.Reservas;


import com.examen_5.Ejercicio_1.Entrega_1.Restaurante.Restaurante;

import java.util.ArrayList;
import java.util.List;

public class GestorRestaurantes {
    private static volatile GestorRestaurantes instancia;
    private List<Restaurante> restaurantes;

    private GestorRestaurantes() {
        restaurantes = new ArrayList<>();
    }

    public static GestorRestaurantes obtenerInstancia() {
        if (instancia == null) {
            synchronized (GestorRestaurantes.class) {
                if (instancia == null) {
                    instancia = new GestorRestaurantes();
                }
            }
        }
        return instancia;
    }

    public void agregarRestaurante(Restaurante restaurante) {
        restaurantes.add(restaurante);
    }

    public List<Restaurante> obtenerRestaurantes() {
        return restaurantes;
    }
}


