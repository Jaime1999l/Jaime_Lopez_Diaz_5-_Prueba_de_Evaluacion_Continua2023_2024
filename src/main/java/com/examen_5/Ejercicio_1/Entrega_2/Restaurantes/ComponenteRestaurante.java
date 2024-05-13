package com.examen_5.Ejercicio_1.Entrega_2.Restaurantes;

import java.util.List;

public interface ComponenteRestaurante {
    void mostrarDetalles();
    void agregar(ComponenteRestaurante componente);
    void remover(ComponenteRestaurante componente);
    List<ComponenteRestaurante> obtenerHijos();
}

