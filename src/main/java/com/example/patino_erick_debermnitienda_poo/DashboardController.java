package com.example.patino_erick_debermnitienda_poo;


import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class DashboardController {

    @FXML
    private Label lblUsuario;
    @FXML
    private Label lblRol;
    @FXML
    private Label lblHeaderTitle;
    @FXML
    private StackPane contentArea;

    // Menú items
    @FXML
    private VBox menuInicio;
    @FXML
    private VBox menuProductos;
    @FXML
    private VBox menuCategorias;
    @FXML
    private VBox menuClientes;
    @FXML
    private VBox menuVentas;
    @FXML
    private VBox menuReportes;
    @FXML
    private VBox menuUsuarios;

    private String usuarioActual;
    private String rolActual;

    public void setUsuario(String usuario, String rol) {
        this.usuarioActual = usuario;
        this.rolActual = rol;
        lblUsuario.setText(usuario);
        lblRol.setText(rol);
        // Cargar productos por defecto
        cargarProductos();
        marcarActivo(menuProductos);
    }

    @FXML
    private void handleInicio() {
        lblHeaderTitle.setText("Inicio");
        marcarActivo(menuInicio);
        mostrarPlaceholder("🏠  Bienvenido al sistema MiTienda");
    }

    @FXML
    private void handleProductos() {
        lblHeaderTitle.setText("Productos");
        marcarActivo(menuProductos);
        cargarProductos();
    }

    @FXML
    private void handleCategorias() {
        lblHeaderTitle.setText("Categorías");
        marcarActivo(menuCategorias);
        mostrarPlaceholder("🏷️  Módulo Categorías — próximamente");
    }

    @FXML
    private void handleClientes() {
        lblHeaderTitle.setText("Clientes");
        marcarActivo(menuClientes);
        mostrarPlaceholder("👥  Módulo Clientes — próximamente");
    }

    @FXML
    private void handleVentas() {
        lblHeaderTitle.setText("Ventas");
        marcarActivo(menuVentas);
        mostrarPlaceholder("🛒  Módulo Ventas — próximamente");
    }

    @FXML
    private void handleReportes() {
        lblHeaderTitle.setText("Reportes");
        marcarActivo(menuReportes);
        mostrarPlaceholder("📊  Módulo Reportes — próximamente");
    }

    @FXML
    private void handleUsuarios() {
        lblHeaderTitle.setText("Usuarios");
        marcarActivo(menuUsuarios);
        mostrarPlaceholder("👤  Módulo Usuarios — próximamente");
    }

    @FXML
    private void handleCerrarSesion() {

        try {

            Parent root = FXMLLoader.load(getClass().getResource("Login.fxml"));

            Scene scene = new Scene(root);

            scene.getStylesheets().add(getClass().getResource("estilos.css").toExternalForm());

            Stage stage = (Stage) lblUsuario.getScene().getWindow();

            stage.setScene(scene);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void cargarProductos() {

        try {

            Parent root = FXMLLoader.load(getClass().getResource("Productos.fxml"));

            contentArea.getChildren().clear();
            contentArea.getChildren().add(root);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void mostrarPlaceholder(String texto) {

        Label lbl = new Label(texto);

        contentArea.getChildren().clear();
        contentArea.getChildren().add(lbl);
    }

    private void marcarActivo(VBox item) {

        VBox[] menus = {menuInicio, menuProductos, menuCategorias, menuClientes, menuVentas, menuReportes, menuUsuarios};

        for (VBox menu : menus) {
            menu.getStyleClass().remove("menu-item-active");
        }

        item.getStyleClass().add("menu-item-active");
    }
}