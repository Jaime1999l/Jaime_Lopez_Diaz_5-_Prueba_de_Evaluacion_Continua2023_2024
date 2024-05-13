package com.examen_5.Ejercicio_1.Entrega_1.Restaurante;

import com.examen_5.Ejercicio_1.Entrega_1.EstrategiasServicio.EstrategiaServicioLujo;

public class RestauranteLujo extends Restaurante {
    public RestauranteLujo(String nombre) {
        super(nombre);
        this.establecerEstrategiaServicio(new EstrategiaServicioLujo());
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Restaurante de Lujo: " + nombre);
    }
}
