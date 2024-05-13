package com.examen_5.Ejercicio_1.Entrega_3.Mediadores.Colaboradores;

import com.examen_5.Ejercicio_1.Entrega_3.Mediadores.Mediador;

public class ServicioCliente extends Colaborador {
    public ServicioCliente(Mediador mediador) {
        super(mediador);
    }

    @Override
    public void recibir(String mensaje) {
        System.out.println("Servicio al Cliente recibió: " + mensaje);
    }
}
