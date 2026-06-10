module com.example.acceso {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.acceso to javafx.fxml;
    exports com.example.acceso;
}