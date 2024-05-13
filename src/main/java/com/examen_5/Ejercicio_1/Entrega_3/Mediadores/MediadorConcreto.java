package com.examen_5.Ejercicio_1.Entrega_3.Mediadores;
import com.examen_5.Ejercicio_1.Entrega_3.Mediadores.Colaboradores.Colaborador;

import java.util.ArrayList;
import java.util.List;

public class MediadorConcreto implements Mediador {
    private List<Colaborador> colaboradores = new ArrayList<>();

    public void agregarColaborador(Colaborador colaborador) {
        colaboradores.add(colaborador);
    }

    @Override
    public void enviar(String mensaje, Colaborador emisor) {
        for (Colaborador colaborador : colaboradores) {
            if (colaborador != emisor) {
                colaborador.recibir(mensaje);
            }
        }
    }
}

