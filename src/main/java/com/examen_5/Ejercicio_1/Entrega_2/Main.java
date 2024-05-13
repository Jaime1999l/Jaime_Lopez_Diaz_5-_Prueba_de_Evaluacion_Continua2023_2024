package com.examen_5.Ejercicio_1.Entrega_2;

import com.examen_5.Ejercicio_1.Entrega_2.Notificacion.SistemaNotificaciones;
import com.examen_5.Ejercicio_1.Entrega_2.Notificacion.Usuarios.Cliente;
import com.examen_5.Ejercicio_1.Entrega_2.Reservas.AdapterReservas;
import com.examen_5.Ejercicio_1.Entrega_2.Reservas.SistemaReservas;
import com.examen_5.Ejercicio_1.Entrega_2.Reservas.SistemaReservasExterno;
import com.examen_5.Ejercicio_1.Entrega_2.Restaurantes.ComponenteRestaurante;
import com.examen_5.Ejercicio_1.Entrega_2.Restaurantes.GrupoRestaurantes;
import com.examen_5.Ejercicio_1.Entrega_2.Restaurantes.RestauranteIndividual;

public class Main {
    public static void main(String[] args) {
        // Crear componentes de restaurantes
        ComponenteRestaurante miRestaurante = new RestauranteIndividual("La buena mesa");
        ComponenteRestaurante grupoRestaurantes = new GrupoRestaurantes();
        grupoRestaurantes.agregar(miRestaurante);

        // Mostrar detalles
        grupoRestaurantes.mostrarDetalles();

        // Sistema de reservas con Adapter
        SistemaReservasExterno sistemaExterno = new SistemaReservasExterno();
        SistemaReservas sistemaReservas = new AdapterReservas(sistemaExterno);
        sistemaReservas.reservarMesa();

        // Sistema de notificaciones con Observer
        SistemaNotificaciones sistemaNotificaciones = new SistemaNotificaciones();
        Cliente cliente = new Cliente("Juan Pérez");
        sistemaNotificaciones.suscribir(cliente);
        sistemaNotificaciones.cambiarEstado("Nueva promoción: 2x1 en cenas.");
    }
}

