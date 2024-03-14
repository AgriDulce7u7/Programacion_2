package co.edu.uniquindio.parcial1.parcial_1.Ejercicio4.Controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class EmpresaTransporteController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button btnActualizarPropietario;

    @FXML
    private Button btnCrearPropietario;

    @FXML
    private Button btnEliminarPropietario;

    @FXML
    private Button btnLeerPropietario;

    @FXML
    private TextArea txtResultado;

    @FXML
    private TextField txtcedula;

    @FXML
    private TextField txtcelular;

    @FXML
    private TextField txtemail;

    @FXML
    private TextField txtnombre;

    @FXML
    void btnActualizarPropietario(ActionEvent event) {

    }

    @FXML
    void onCrearPropietario(ActionEvent event) {

    }

    @FXML
    void onEliminarPropietario(ActionEvent event) {

    }

    @FXML
    void onLeerPropietario(ActionEvent event) {

    }

    @FXML
    void initialize() {
        assert btnActualizarPropietario != null : "fx:id=\"btnActualizarPropietario\" was not injected: check your FXML file 'EmpresaTransporteApp.fxml'.";
        assert btnCrearPropietario != null : "fx:id=\"btnCrearPropietario\" was not injected: check your FXML file 'EmpresaTransporteApp.fxml'.";
        assert btnEliminarPropietario != null : "fx:id=\"btnEliminarPropietario\" was not injected: check your FXML file 'EmpresaTransporteApp.fxml'.";
        assert btnLeerPropietario != null : "fx:id=\"btnLeerPropietario\" was not injected: check your FXML file 'EmpresaTransporteApp.fxml'.";
        assert txtResultado != null : "fx:id=\"txtResultado\" was not injected: check your FXML file 'EmpresaTransporteApp.fxml'.";
        assert txtcedula != null : "fx:id=\"txtcedula\" was not injected: check your FXML file 'EmpresaTransporteApp.fxml'.";
        assert txtcelular != null : "fx:id=\"txtcelular\" was not injected: check your FXML file 'EmpresaTransporteApp.fxml'.";
        assert txtemail != null : "fx:id=\"txtemail\" was not injected: check your FXML file 'EmpresaTransporteApp.fxml'.";
        assert txtnombre != null : "fx:id=\"txtnombre\" was not injected: check your FXML file 'EmpresaTransporteApp.fxml'.";

    }
}
