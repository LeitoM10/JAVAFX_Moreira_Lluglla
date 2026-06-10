module com.example.moreira_lluglla_encuesta {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.moreira_lluglla_encuesta to javafx.fxml;
    exports com.example.moreira_lluglla_encuesta;
}