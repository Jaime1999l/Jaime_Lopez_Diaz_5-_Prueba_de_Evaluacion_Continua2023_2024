package com.examen_5.Ejercicio_1.Entrega_1.EstrategiasServicio;

public class EstrategiaServicioRapido implements EstrategiaServicio {
    @Override
    public void servir() {
        System.out.println("Servicio rápido con mínima interacción.");
    }
}
