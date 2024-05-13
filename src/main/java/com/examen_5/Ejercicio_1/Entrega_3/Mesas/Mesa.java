package com.examen_5.Ejercicio_1.Entrega_3.Mesas;

public class Mesa {
    private int numero;
    private EstadoMesa estado;

    public Mesa(int numero) {
        this.numero = numero;
        this.estado = EstadoMesa.LIBRE;
    }

    public void cambiarEstado() {
        this.estado = EstadoMesa.siguienteEstado(this.estado);
        System.out.println("Mesa " + numero + " ahora está " + estado);
    }

    public int getNumero() {
        return numero;
    }

    public EstadoMesa getEstado() {
        return estado;
    }
}

