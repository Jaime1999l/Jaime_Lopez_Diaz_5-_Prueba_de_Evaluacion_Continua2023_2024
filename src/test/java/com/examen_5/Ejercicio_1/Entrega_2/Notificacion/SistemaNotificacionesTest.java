package com.examen_5.Ejercicio_1.Entrega_2.Notificacion;

import com.examen_5.Ejercicio_1.Entrega_2.Notificacion.Usuarios.Observer;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SistemaNotificacionesTest {
    private SistemaNotificaciones sistemaNotificaciones;
    private Observer observer;

    @BeforeEach
    void setUp() {
        sistemaNotificaciones = new SistemaNotificaciones();
        observer = new Observer() {
            @Override
            public void actualizar(String mensaje) {
                // This is a mock observer for testing
            }
        };
    }

    @Test
    void cambiarEstado() {
        sistemaNotificaciones.cambiarEstado("Nuevo estado");
    }

    @Test
    void suscribir() {
        sistemaNotificaciones.suscribir(observer);
    }

    @Test
    void desuscribir() {
        sistemaNotificaciones.suscribir(observer);
        sistemaNotificaciones.desuscribir(observer);
    }

    @Test
    void notificarObservadores() {
        sistemaNotificaciones.suscribir(observer);
        sistemaNotificaciones.cambiarEstado("Nuevo estado");
    }
}