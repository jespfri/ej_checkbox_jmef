module com.example.ej_checkbox_jmef {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.ej_checkbox_jmef to javafx.fxml;
    exports com.example.ej_checkbox_jmef;
}