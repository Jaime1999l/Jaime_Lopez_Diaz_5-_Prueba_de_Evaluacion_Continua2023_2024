package com.examen_5.Ejercicio_1.Entrega_2.Reservas;

public class AdapterReservas implements SistemaReservas {
    private SistemaReservasExterno sistemaExterno;

    public AdapterReservas(SistemaReservasExterno sistemaExterno) {
        this.sistemaExterno = sistemaExterno;
    }

    @Override
    public void reservarMesa() {
        sistemaExterno.realizarReserva();
    }
}
