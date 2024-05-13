package com.examen_5.Ejercicio_1.Entrega_4.Restaurantes.Tipo;

import com.examen_5.Ejercicio_1.Entrega_4.Restaurantes.ComponenteRestaurante;

import java.util.List;

public class RestauranteIndividual implements ComponenteRestaurante {
    private String nombre;

    public RestauranteIndividual(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Restaurante Individual: " + nombre);
    }

    @Override
    public void agregar(ComponenteRestaurante componente) {
        throw new UnsupportedOperationException("Operación no soportada");
    }

    @Override
    public void remover(ComponenteRestaurante componente) {
        throw new UnsupportedOperationException("Operación no soportada");
    }

    @Override
    public List<ComponenteRestaurante> obtenerHijos() {
        throw new UnsupportedOperationException("Operación no soportada");
    }
}

