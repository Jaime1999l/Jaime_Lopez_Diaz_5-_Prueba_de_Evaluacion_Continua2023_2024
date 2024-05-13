package com.examen_5.Ejercicio_1.Entrega_2.Notificacion;

import com.examen_5.Ejercicio_1.Entrega_2.Notificacion.Usuarios.Observer;

import java.util.ArrayList;
import java.util.List;

public class SistemaNotificaciones implements Subject {
    private List<Observer> observers = new ArrayList<>();
    private String mensaje;

    public void cambiarEstado(String mensaje) {
        this.mensaje = mensaje;
        notificarObservadores();
    }

    @Override
    public void suscribir(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void desuscribir(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notificarObservadores() {
        for (Observer observer : observers) {
            observer.actualizar(mensaje);
        }
    }
}
