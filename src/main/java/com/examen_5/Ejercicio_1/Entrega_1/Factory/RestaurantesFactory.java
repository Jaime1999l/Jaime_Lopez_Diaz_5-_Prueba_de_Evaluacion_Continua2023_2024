package com.examen_5.Ejercicio_1.Entrega_1.Factory;

import com.examen_5.Ejercicio_1.Entrega_1.Restaurante.Restaurante;
import com.examen_5.Ejercicio_1.Entrega_1.Restaurante.RestauranteLujo;
import com.examen_5.Ejercicio_1.Entrega_1.Restaurante.RestauranteRapido;
import com.examen_5.Ejercicio_1.Entrega_1.Restaurante.RestauranteTematico;

public class RestaurantesFactory {
    public static Restaurante obtenerRestaurante(String tipo, String nombre) throws IllegalArgumentException {
        switch (tipo.toLowerCase()) {
            case "rapido":
                return new RestauranteRapido(nombre);
            case "tematico":
                return new RestauranteTematico(nombre);
            case "lujo":
                return new RestauranteLujo(nombre);
            default:
                throw new IllegalArgumentException("Tipo de restaurante desconocido: " + tipo);
        }
    }
}
