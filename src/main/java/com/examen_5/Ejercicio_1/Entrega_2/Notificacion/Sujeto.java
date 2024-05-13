package com.examen_5.Ejercicio_1.Entrega_2.Notificacion;

import com.examen_5.Ejercicio_1.Entrega_2.Notificacion.Usuarios.Observer;

public interface Sujeto {
    void suscribir(Observer observer);
    void desuscribir(Observer observer);
    void notificarObservadores();
}
