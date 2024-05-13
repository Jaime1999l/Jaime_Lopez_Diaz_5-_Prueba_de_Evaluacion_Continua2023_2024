package com.examen_5.Ejercicio_1.Entrega_1.Reservas;


import com.examen_5.Ejercicio_1.Entrega_1.Restaurante.Restaurante;

import java.util.ArrayList;
import java.util.List;

public class GestorReservas {
    private static volatile GestorReservas instancia;
    private List<Restaurante> restaurantes;

    private GestorReservas() {
        restaurantes = new ArrayList<>();
    }

    public static GestorReservas obtenerInstancia() {
        if (instancia == null) {
            synchronized (GestorReservas.class) {
                if (instancia == null) {
                    instancia = new GestorReservas();
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


