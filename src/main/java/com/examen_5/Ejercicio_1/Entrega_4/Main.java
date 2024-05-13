package com.examen_5.Ejercicio_1.Entrega_4;

import com.examen_5.Ejercicio_1.Entrega_4.Restaurantes.Controlador.ControladorRestaurantes;
import com.examen_5.Ejercicio_1.Entrega_4.Restaurantes.Tipo.GrupoRestaurantes;
import com.examen_5.Ejercicio_1.Entrega_4.Restaurantes.Tipo.RestauranteIndividual;
import com.examen_5.Ejercicio_1.Entrega_4.Restaurantes.Vista.VistaRestaurante;

public class Main {
    public static void main(String[] args) {
        RestauranteIndividual r1 = new RestauranteIndividual("La buena mesa");
        RestauranteIndividual r2 = new RestauranteIndividual("El rincon del sabor");
        GrupoRestaurantes grupo = new GrupoRestaurantes();

        grupo.agregar(r1);
        grupo.agregar(r2);

        VistaRestaurante vista = new VistaRestaurante();
        ControladorRestaurantes controlador = new ControladorRestaurantes(grupo, vista);

        controlador.actualizarVista();
    }
}

