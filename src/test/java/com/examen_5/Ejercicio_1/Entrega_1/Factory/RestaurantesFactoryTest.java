package com.examen_5.Ejercicio_1.Entrega_1.Factory;

import com.examen_5.Ejercicio_1.Entrega_1.Restaurante.Restaurante;
import com.examen_5.Ejercicio_1.Entrega_1.Restaurante.RestauranteLujo;
import com.examen_5.Ejercicio_1.Entrega_1.Restaurante.RestauranteRapido;
import com.examen_5.Ejercicio_1.Entrega_1.Restaurante.RestauranteTematico;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RestaurantesFactoryTest {

    @Test
    void obtenerRestaurante() {
        Restaurante rapido = RestaurantesFactory.obtenerRestaurante("rapido", "Rapido");
        assertTrue(rapido instanceof RestauranteRapido);

        Restaurante tematico = RestaurantesFactory.obtenerRestaurante("tematico", "Tematico");
        assertTrue(tematico instanceof RestauranteTematico);

        Restaurante lujo = RestaurantesFactory.obtenerRestaurante("lujo", "Lujo");
        assertTrue(lujo instanceof RestauranteLujo);

        assertThrows(IllegalArgumentException.class, () -> {
            RestaurantesFactory.obtenerRestaurante("desconocido", "Desconocido");
        });
    }
}