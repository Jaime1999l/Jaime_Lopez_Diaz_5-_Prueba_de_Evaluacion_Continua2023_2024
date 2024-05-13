package com.examen_5.Ejercicio_1.Entrega_3;

import com.examen_5.Ejercicio_1.Entrega_3.Command.Comando;
import com.examen_5.Ejercicio_1.Entrega_3.Command.Ordenar.OrdenarComida;
import com.examen_5.Ejercicio_1.Entrega_3.Command.Reservas.CancelarReserva;
import com.examen_5.Ejercicio_1.Entrega_3.Command.Reservas.ReservarMesa;
import com.examen_5.Ejercicio_1.Entrega_3.Mediadores.Colaboradores.Cocina;
import com.examen_5.Ejercicio_1.Entrega_3.Mediadores.Colaboradores.Entrega;
import com.examen_5.Ejercicio_1.Entrega_3.Mediadores.Colaboradores.ServicioCliente;
import com.examen_5.Ejercicio_1.Entrega_3.Mediadores.Mediador;
import com.examen_5.Ejercicio_1.Entrega_3.Mediadores.MediadorConcreto;
import com.examen_5.Ejercicio_1.Entrega_3.Mesas.Mesa;

public class Main {
    public static void main(String[] args) {
        Mesa mesa1 = new Mesa(1);
        Comando reservar = new ReservarMesa(mesa1);
        Comando ordenar = new OrdenarComida(mesa1);
        Comando cancelar = new CancelarReserva(mesa1);

        reservar.ejecutar();
        ordenar.ejecutar();
        cancelar.ejecutar();

        Mediador mediador = new MediadorConcreto();
        Cocina cocina = new Cocina(mediador);
        ServicioCliente servicioCliente = new ServicioCliente(mediador);
        Entrega entrega = new Entrega(mediador);

        ((MediadorConcreto) mediador).agregarColaborador(cocina);
        ((MediadorConcreto) mediador).agregarColaborador(servicioCliente);
        ((MediadorConcreto) mediador).agregarColaborador(entrega);

        cocina.recibir("Pedido listo para entrega");
        servicioCliente.recibir("Consulta de cliente sobre el menu");
        entrega.recibir("Pedido entregado");
    }
}

