package com.examen_5.Ejercicio_1.Entrega_1.Restaurante;

import com.examen_5.Ejercicio_1.Entrega_1.EstrategiasServicio.EstrategiaServicioTematico;

public class RestauranteTematico extends Restaurante {
    public RestauranteTematico(String nombre) {
        super(nombre);
        this.establecerEstrategiaServicio(new EstrategiaServicioTematico());
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Restaurante Temático: " + nombre);
    }
}
