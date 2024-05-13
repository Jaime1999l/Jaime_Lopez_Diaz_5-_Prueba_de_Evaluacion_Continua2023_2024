package com.examen_5.Ejercicio_1.Entrega_3.Command.Ordenar;

import com.examen_5.Ejercicio_1.Entrega_3.Command.Comando;
import com.examen_5.Ejercicio_1.Entrega_3.Mesas.EstadoMesa;
import com.examen_5.Ejercicio_1.Entrega_3.Mesas.Mesa;

public class OrdenarComida implements Comando {
    private Mesa mesa;

    public OrdenarComida(Mesa mesa) {
        this.mesa = mesa;
    }

    @Override
    public void ejecutar() {
        if (mesa.getEstado() == EstadoMesa.RESERVADA) {
            mesa.cambiarEstado();
            System.out.println("Comida ordenada.");
        } else {
            System.out.println("Orden no disponible.");
        }
    }
}