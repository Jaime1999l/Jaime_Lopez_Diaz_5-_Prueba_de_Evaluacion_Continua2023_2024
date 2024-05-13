package com.examen_5.Ejercicio_1.Entrega_1.Restaurante;

import com.examen_5.Ejercicio_1.Entrega_1.EstrategiasServicio.EstrategiaServicioRapido;

public class RestauranteRapido extends Restaurante {
    public RestauranteRapido(String nombre) {
        super(nombre);
        this.establecerEstrategiaServicio(new EstrategiaServicioRapido());
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Restaurante Rápido: " + nombre);
    }
}
