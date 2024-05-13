package com.examen_5.Ejercicio_1.Entrega_3.Mediadores.Colaboradores;

import com.examen_5.Ejercicio_1.Entrega_3.Mediadores.Mediador;

public abstract class Colaborador {
    protected Mediador mediador;

    public Colaborador(Mediador mediador) {
        this.mediador = mediador;
    }

    public abstract void recibir(String mensaje);
}

