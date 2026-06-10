package com.example.moreira_lluglla_encuesta;


import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;

public class EncuestaController {

    @FXML private RadioButton p1a, p1b, p1c;
    @FXML private RadioButton p2a, p2b, p2c;
    @FXML private RadioButton p3a, p3b, p3c;
    @FXML private RadioButton p4a, p4b, p4c;

    @FXML private Label lblResultado;

    @FXML
    private void calcular() {

        int correctas = 0;

        if ((!p1a.isSelected() && !p1b.isSelected() && !p1c.isSelected()) ||
                (!p2a.isSelected() && !p2b.isSelected() && !p2c.isSelected()) ||
                (!p3a.isSelected() && !p3b.isSelected() && !p3c.isSelected()) ||
                (!p4a.isSelected() && !p4b.isSelected() && !p4c.isSelected())) {
        }

        if (p1a.isSelected()) correctas++;
        if (p2b.isSelected()) correctas++;
        if (p3a.isSelected()) correctas++;
        if (p4a.isSelected()) correctas++;

        int incorrectas = 4 - correctas;
        int puntaje = correctas * 5;

        lblResultado.setText(
                "Correctas: " + correctas + " | Incorrectas: " + incorrectas + " | Puntaje: " + puntaje
        );
    }
}
