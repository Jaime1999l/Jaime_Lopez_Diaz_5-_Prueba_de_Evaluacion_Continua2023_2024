https://github.com/Jaime1999l/Jaime_Lopez_Diaz_5-_Prueba_de_Evaluacion_Continua2023_2024.git

## Entrega 1: Patrones de Construcción

### Descripción

En esta entrega se implementan patrones de construcción como Factory para crear diferentes tipos de restaurantes (rápido, temático, de lujo) y Singleton para la gestión centralizada de los restaurantes. Además, se utiliza el patrón de comportamiento Strategy para definir diferentes estrategias de servicio al cliente según el tipo de restaurante.

### Clases Importantes

* `Restaurante`: Clase abstracta que define las operaciones básicas de un restaurante.
* `RestauranteRapido`, `RestauranteTematico`, `RestauranteLujo`: Subclases de `Restaurante` que representan diferentes tipos de restaurantes.
* `RestaurantesFactory`: Clase que utiliza el patrón Factory para crear instancias de diferentes tipos de restaurantes según un tipo dado.
* `EstrategiaServicio`, `EstrategiaServicioRapido`, `EstrategiaServicioTematico`, `EstrategiaServicioLujo`: Clases que definen las diferentes estrategias de servicio al cliente.

### Patrones Utilizados

* **Factory**: Utilizado en `RestaurantesFactory` para crear instancias de diferentes tipos de restaurantes según un tipo dado.
* **Singleton**: Utilizado para gestionar centralizadamente la creación y acceso a los restaurantes en `GestorRestaurantes`.
* **Strategy**: Utilizado para definir diferentes estrategias de servicio al cliente en `EstrategiaServicioRapido`, `EstrategiaServicioTematico` y `EstrategiaServicioLujo`.

## Entrega 2: Patrones de Estructuración

### Descripción

En esta entrega se utiliza el patrón Composite para manejar tanto restaurantes individuales como grupos de restaurantes como una jerarquía. Además, se implementa el patrón Adapter para integrar sistemas externos de reserva o entrega de comida. Se añade un patrón de comportamiento adicional, Observer, para notificar cambios en el menú o promociones a los clientes suscritos.

### Clases Importantes

* `ComponenteRestaurante`: Interfaz que define las operaciones comunes a los componentes de restaurantes.
* `RestauranteIndividual`, `GrupoRestaurantes`: Implementaciones de `ComponenteRestaurante` que representan restaurantes individuales y grupos de restaurantes, respectivamente.
* `SistemaReservas`: Interfaz que define la operación de reserva de mesa.
* `AdapterReservas`: Clase que adapta un sistema externo de reservas para que se pueda usar con la interfaz definida por `SistemaReservas`.
* `SistemaNotificaciones`: Clase que gestiona las notificaciones a los clientes.
* `Cliente`: Clase que actúa como observador y recibe notificaciones del sistema de notificaciones.

### Patrones Utilizados

* **Composite**: Utilizado para tratar tanto los restaurantes individuales como los grupos de restaurantes de manera uniforme.
* **Adapter**: Utilizado en `AdapterReservas` para adaptar el sistema externo de reservas a la interfaz definida por `SistemaReservas`.
* **Observer**: Utilizado en la implementación del sistema de notificaciones para notificar a los clientes sobre eventos importantes.

## Entrega 3: Patrones de Comportamiento

### Descripción

En esta entrega se implementa el patrón Command para ejecutar diferentes acciones en el restaurante, como reservar, ordenar, cancelar. Además, se utiliza el patrón Mediator para facilitar la comunicación entre diferentes componentes del restaurante, como la cocina, el servicio al cliente y la entrega. Se introduce un patrón específico, State, para gestionar el estado de las mesas (libre, reservada, ocupada).

### Clases Importantes

* `Comando`: Interfaz que define las operaciones básicas de un comando en el restaurante.
* `ReservarMesa`, `CancelarReserva`, `OrdenarComida`: Implementaciones de `Comando` que representan diferentes acciones que se pueden ejecutar en el restaurante.
* `Mediador`, `MediadorConcreto`: Interfaces y clases concretas que implementan el patrón Mediator para facilitar la comunicación entre diferentes componentes del restaurante.
* `EstadoMesa`: Enumeración que define los posibles estados de una mesa en el restaurante.

### Patrones Utilizados

* **Command**: Utilizado para encapsular acciones como objetos y permitir la parametrización de operaciones.
* **Mediator**: Utilizado para reducir el acoplamiento entre los componentes del restaurante y centralizar la comunicación entre ellos.
* **State**: Utilizado para representar y gestionar los estados de las mesas en el restaurante.

## Entrega 4: Patrón Composite y MVC

### Descripción

En esta entrega se aplica el patrón Composite para gestionar la estructura de restaurantes y MVC para separar la lógica de la interfaz de usuario de la lógica de negocio en el sistema de gestión del restaurante.

### Clases Importantes

* `ComponenteRestaurante`: Interfaz que define las operaciones comunes a los componentes de restaurantes.
* `RestauranteIndividual`, `GrupoRestaurantes`: Implementaciones de `ComponenteRestaurante` que representan restaurantes individuales y grupos de restaurantes, respectivamente.
* `VistaRestaurante`: Clase que imprime los detalles de un componente restaurante.
* `ControladorRestaurantes`: Clase que controla las operaciones sobre los restaurantes, como agregar y eliminar restaurantes.

### Patrones Utilizados

* **Composite**: Utilizado para tratar tanto los restaurantes individuales como los grupos de restaurantes de manera uniforme.
* **MVC (Modelo-Vista-Controlador)**: Utilizado para separar la lógica de negocio (`ComponenteRestaurante`) de la interfaz de usuario (`VistaRestaurante`) y el controlador (`ControladorRestaurantes`).
