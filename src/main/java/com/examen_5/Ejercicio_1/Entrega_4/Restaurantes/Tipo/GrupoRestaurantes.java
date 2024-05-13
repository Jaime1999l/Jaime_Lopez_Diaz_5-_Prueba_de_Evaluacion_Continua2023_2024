package com.examen_5.Ejercicio_1.Entrega_4.Restaurantes.Tipo;

import com.examen_5.Ejercicio_1.Entrega_4.Restaurantes.ComponenteRestaurante;

import java.util.ArrayList;
import java.util.List;

public class GrupoRestaurantes implements ComponenteRestaurante {
    private List<ComponenteRestaurante> restaurantes = new ArrayList<>();

    @Override
    public void mostrarDetalles() {
        for (ComponenteRestaurante restaurante : restaurantes) {
            restaurante.mostrarDetalles();
        }
    }

    @Override
    public void agregar(ComponenteRestaurante componente) {
        restaurantes.add(componente);
    }

    @Override
    public void remover(ComponenteRestaurante componente) {
        restaurantes.remove(componente);
    }

    @Override
    public List<ComponenteRestaurante> obtenerHijos() {
        return restaurantes;
    }
}

