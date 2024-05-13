package com.examen_5.Ejercicio_1.Entrega_4.Restaurantes.Controlador;

import com.examen_5.Ejercicio_1.Entrega_4.Restaurantes.ComponenteRestaurante;
import com.examen_5.Ejercicio_1.Entrega_4.Restaurantes.Vista.VistaRestaurante;

public class ControladorRestaurantes {
    private ComponenteRestaurante modelo;
    private VistaRestaurante vista;

    public ControladorRestaurantes(ComponenteRestaurante modelo, VistaRestaurante vista) {
        this.modelo = modelo;
        this.vista = vista;
    }

    public void actualizarVista() {
        vista.imprimirDetalles(modelo);
    }

    public void agregarRestaurante(ComponenteRestaurante restaurante) {
        modelo.agregar(restaurante);
    }

    public void removerRestaurante(ComponenteRestaurante restaurante) {
        modelo.remover(restaurante);
    }
}
