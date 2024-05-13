module com.examen_ {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.xml;

    // Abre los paquetes a javafx.fxml donde es necesario para la inyección de dependencias y reflexión
    opens com.examen_5.Ejercicio_1.Entrega_1 to javafx.fxml;
    opens com.examen_5.Ejercicio_1.Entrega_2 to javafx.fxml;
    opens com.examen_5.Ejercicio_1.Entrega_3 to javafx.fxml;
    opens com.examen_5.Ejercicio_1.Entrega_4 to javafx.fxml;
    opens com.examen_5.Ejercicio_2.Entrega_1 to javafx.fxml;
    opens com.examen_5.Ejercicio_2.Entrega_2 to javafx.fxml;
    opens com.examen_5.Ejercicio_2.Entrega_3 to javafx.fxml;
    opens com.examen_5.Ejercicio_2.Entrega_4 to javafx.fxml;

    // Exporta los paquetes para que sean visibles a otros módulos y al sistema de JavaFX
    exports com.examen_5.Ejercicio_1.Entrega_1;
    exports com.examen_5.Ejercicio_1.Entrega_2;
    exports com.examen_5.Ejercicio_1.Entrega_3;
    exports com.examen_5.Ejercicio_1.Entrega_4;
    exports com.examen_5.Ejercicio_2.Entrega_1;
    exports com.examen_5.Ejercicio_2.Entrega_2;
    exports com.examen_5.Ejercicio_2.Entrega_3;
    exports com.examen_5.Ejercicio_2.Entrega_4;
}