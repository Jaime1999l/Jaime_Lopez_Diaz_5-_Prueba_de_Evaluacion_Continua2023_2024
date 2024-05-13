package com.examen_5.Ejercicio_1.Entrega_1;

import com.examen_5.Ejercicio_1.Entrega_1.Factory.RestaurantesFactory;
import com.examen_5.Ejercicio_1.Entrega_1.Gestor.GestorRestaurantes;
import com.examen_5.Ejercicio_1.Entrega_1.Restaurante.Restaurante;

public class Main {
    public static void main(String[] args) {
        try {
            GestorRestaurantes gestor = GestorRestaurantes.obtenerInstancia();

            Restaurante rapido = RestaurantesFactory.obtenerRestaurante("rapido", "Burger Veloz");
            Restaurante tematico = RestaurantesFactory.obtenerRestaurante("tematico", "Cueva del Pirata");
            Restaurante lujo = RestaurantesFactory.obtenerRestaurante("lujo", "El Gourmet Elegante");

            gestor.agregarRestaurante(rapido);
            gestor.agregarRestaurante(tematico);
            gestor.agregarRestaurante(lujo);

            for (Restaurante restaurante : gestor.obtenerRestaurantes()) {
                restaurante.mostrarDetalles();
                restaurante.servir();
            }
        } catch (IllegalArgumentException e) {
            System.err.println("ERROR -> No se creo correctamente el restaurante: " + e.getMessage());
        }
    }
}
