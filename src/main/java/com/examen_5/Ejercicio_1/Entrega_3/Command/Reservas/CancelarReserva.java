package com.examen_5.Ejercicio_1.Entrega_3.Command.Reservas;

import com.examen_5.Ejercicio_1.Entrega_3.Command.Comando;
import com.examen_5.Ejercicio_1.Entrega_3.Mesas.EstadoMesa;
import com.examen_5.Ejercicio_1.Entrega_3.Mesas.Mesa;

public class CancelarReserva implements Comando {
    private Mesa mesa;

    public CancelarReserva(Mesa mesa) {
        this.mesa = mesa;
    }

    @Override
    public void ejecutar() {
        if (mesa.getEstado() != EstadoMesa.LIBRE) {
            mesa.cambiarEstado();
            System.out.println("Reserva cancelada.");
        } else {
            System.out.println("No hay reserva que cancelar.");
        }
    }
}
