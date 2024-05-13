package com.examen_5.Ejercicio_1.Entrega_2.Notificacion.Usuarios;

public class Cliente implements Observer {
    private String nombre;

    public Cliente(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void actualizar(String mensaje) {
        System.out.println("Cliente " + nombre + " ha sido notificado: " + mensaje);
    }
}

