package com.example.acceso;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class LoginController {

    @FXML private TextField txtUsuario;
    @FXML private PasswordField txtPassword;
    @FXML private ComboBox<String> comboRol;

    @FXML
    private void ingresar() {

        String usuario = txtUsuario.getText();
        String pass = txtPassword.getText();
        String rol = comboRol.getValue();

        try {
            FXMLLoader loader = null;

            if (usuario.equals("admin") && pass.equals("1234") && rol.equals("Administrador")) {
                loader = new FXMLLoader(getClass().getResource("/com/example/acceso/Administrador.fxml"));

            } else if (usuario.equals("cajero") && pass.equals("1234") && rol.equals("Cajero")) {
                loader = new FXMLLoader(getClass().getResource("/com/example/acceso/Cajero.fxml"));

            }
            Stage stage = (Stage) txtUsuario.getScene().getWindow();
            stage.setScene(new Scene(loader.load()));

        } catch (Exception e) {
        }
    }
}
