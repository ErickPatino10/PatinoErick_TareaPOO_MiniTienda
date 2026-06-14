package com.example.patino_erick_debermnitienda_poo;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;

public class LoginController {

    @FXML
    private TextField txtUsuario;

    @FXML
    private PasswordField txtContrasena;

    @FXML
    private ComboBox<String> cmbRol;

    @FXML
    private Label lblError;

    @FXML
    public void initialize() {
        cmbRol.getItems().addAll("Administrador", "Vendedor", "Cajero");
    }

    @FXML
    private void handleIngresar() {

        String usuario = txtUsuario.getText();
        String contrasena = txtContrasena.getText();

        if (usuario.isEmpty() || contrasena.isEmpty() || cmbRol.getValue() == null) {

            lblError.setText("Complete todos los campos");
            return;
        }

        if (usuario.equals("admin") && contrasena.equals("1234")) {

            abrirDashboard(usuario, cmbRol.getValue());

        } else {
            lblError.setText("Usuario o contraseña incorrectos");
        }
    }

    private void abrirDashboard(String usuario, String rol) {

        try {

            FXMLLoader loader = new FXMLLoader(getClass().getResource("Dashboard.fxml"));

            Parent root = loader.load();

            DashboardController controller = loader.getController();

            controller.setUsuario(usuario, rol);

            Scene scene = new Scene(root);

            scene.getStylesheets().add(getClass().getResource("estilos.css").toExternalForm());

            Stage stage = (Stage) txtUsuario.getScene().getWindow();

            stage.setScene(scene);
            stage.setTitle("MiTienda");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}