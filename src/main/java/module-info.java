module com.example.patino_erick_debermnitienda_poo {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.patino_erick_debermnitienda_poo to javafx.fxml;
    exports com.example.patino_erick_debermnitienda_poo;
}