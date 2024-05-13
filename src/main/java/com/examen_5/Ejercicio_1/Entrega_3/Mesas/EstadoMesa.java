package com.examen_5.Ejercicio_1.Entrega_3.Mesas;

public enum EstadoMesa {
    LIBRE,
    RESERVADA,
    OCUPADA;

    public static EstadoMesa siguienteEstado(EstadoMesa estadoActual) {
        switch (estadoActual) {
            case LIBRE:
                return RESERVADA;
            case RESERVADA:
                return OCUPADA;
            case OCUPADA:
                return LIBRE;
            default:
                return LIBRE;
        }
    }
}
