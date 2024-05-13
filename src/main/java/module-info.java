module com.examen_ {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.xml;

    // Abre los paquetes a javafx.fxml donde es necesario para la inyección de dependencias y reflexión
    opens com.examen_5 to javafx.fxml;

    // Exporta los paquetes para que sean visibles a otros módulos y al sistema de JavaFX
    exports com.examen_5;
}