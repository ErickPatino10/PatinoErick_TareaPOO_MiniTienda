package com.example.patino_erick_debermnitienda_poo;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

public class ProductoController {

    @FXML
    private TextField txtCodigo;

    @FXML
    private TextField txtNombre;

    @FXML
    private ComboBox<String> cmbCategoria;

    @FXML
    private TextField txtPrecio;

    @FXML
    private TextField txtStock;

    @FXML
    private ComboBox<String> cmbEstado;

    @FXML
    private TableView<Producto> tablaProductos;

    @FXML
    private TableColumn<Producto, String> colCodigo;

    @FXML
    private TableColumn<Producto, String> colNombre;

    @FXML
    private TableColumn<Producto, String> colCategoria;

    @FXML
    private TableColumn<Producto, Double> colPrecio;

    @FXML
    private TableColumn<Producto, Integer> colStock;

    @FXML
    private TableColumn<Producto, String> colEstado;

    @FXML
    private Label lblMensaje;

    private ObservableList<Producto> listaProductos = FXCollections.observableArrayList();

    @FXML
    public void initialize() {

        cmbCategoria.getItems().addAll("Calzado", "Ropa", "Accesorios", "Electrónica", "Hogar");

        cmbEstado.getItems().addAll("Activo", "Inactivo");

        cmbEstado.setValue("Activo");

        colCodigo.setCellValueFactory(new PropertyValueFactory<>("codigo"));

        colNombre.setCellValueFactory(new PropertyValueFactory<>("nombre"));

        colCategoria.setCellValueFactory(new PropertyValueFactory<>("categoria"));

        colPrecio.setCellValueFactory(new PropertyValueFactory<>("precio"));

        colStock.setCellValueFactory(new PropertyValueFactory<>("stock"));

        colEstado.setCellValueFactory(new PropertyValueFactory<>("estado"));

        listaProductos.add(new Producto("P001", "Zapato Deportivo", "Calzado", 35, 20, "Activo"));

        listaProductos.add(new Producto("P002", "Camisa", "Ropa", 25, 10, "Activo"));

        tablaProductos.setItems(listaProductos);

        tablaProductos.getSelectionModel().selectedItemProperty().addListener((obs, anterior, actual) -> {

            if (actual != null) {

                txtCodigo.setText(actual.getCodigo());
                txtNombre.setText(actual.getNombre());
                cmbCategoria.setValue(actual.getCategoria());
                txtPrecio.setText(String.valueOf(actual.getPrecio()));
                txtStock.setText(String.valueOf(actual.getStock()));
                cmbEstado.setValue(actual.getEstado());
            }
        });
    }

    @FXML
    private void handleNuevo() {
        limpiar();
    }

    @FXML
    private void handleGuardar() {

        if (!validar()) {
            return;
        }

        Producto producto = new Producto(txtCodigo.getText(), txtNombre.getText(), cmbCategoria.getValue(), Double.parseDouble(txtPrecio.getText()), Integer.parseInt(txtStock.getText()), cmbEstado.getValue());

        listaProductos.add(producto);

        lblMensaje.setText("Producto guardado");

        limpiar();
    }

    @FXML
    private void handleActualizar() {

        Producto producto = tablaProductos.getSelectionModel().getSelectedItem();

        if (producto == null) {
            lblMensaje.setText("Seleccione un producto");
            return;
        }

        producto.setCodigo(txtCodigo.getText());
        producto.setNombre(txtNombre.getText());
        producto.setCategoria(cmbCategoria.getValue());
        producto.setPrecio(Double.parseDouble(txtPrecio.getText()));
        producto.setStock(Integer.parseInt(txtStock.getText()));
        producto.setEstado(cmbEstado.getValue());

        tablaProductos.refresh();

        lblMensaje.setText("Producto actualizado");

        limpiar();
    }

    @FXML
    private void handleEliminar() {

        Producto producto = tablaProductos.getSelectionModel().getSelectedItem();

        if (producto == null) {
            lblMensaje.setText("Seleccione un producto");
            return;
        }

        listaProductos.remove(producto);

        lblMensaje.setText("Producto eliminado");

        limpiar();
    }

    @FXML
    private void handleLimpiar() {
        limpiar();
    }

    private boolean validar() {

        if (txtCodigo.getText().isEmpty() || txtNombre.getText().isEmpty() || txtPrecio.getText().isEmpty() || txtStock.getText().isEmpty() || cmbCategoria.getValue() == null) {

            lblMensaje.setText("Complete todos los campos");
            return false;
        }

        return true;
    }

    private void limpiar() {

        txtCodigo.clear();
        txtNombre.clear();
        txtPrecio.clear();
        txtStock.clear();

        cmbCategoria.setValue(null);
        cmbEstado.setValue("Activo");

        tablaProductos.getSelectionModel().clearSelection();
    }
}