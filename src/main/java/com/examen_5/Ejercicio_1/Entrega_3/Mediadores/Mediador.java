package com.examen_5.Ejercicio_1.Entrega_3.Mediadores;

import com.examen_5.Ejercicio_1.Entrega_3.Mediadores.Colaboradores.Colaborador;

public interface Mediador {
    void enviar(String mensaje, Colaborador colaborador);
}

