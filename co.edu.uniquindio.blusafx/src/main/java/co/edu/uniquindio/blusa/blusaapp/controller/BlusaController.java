package co.edu.uniquindio.blusa.blusaapp.controller;

import co.edu.uniquindio.blusa.blusaapp.model.Blusa;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;

import java.net.URL;
import java.util.ResourceBundle;

public class BlusaController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private ToggleGroup Tipo;

    @FXML
    private Button btnAgregarBlusa;

    @FXML
    private RadioButton rbtnAdornada;

    @FXML
    private RadioButton rbtnBasica;

    @FXML
    private RadioButton rbtnEstampada;

    @FXML
    private TextField txtAdorno;

    @FXML
    private TextField txtAltoDiseño;

    @FXML
    private TextField txtAnchoDiseño;

    @FXML
    private TextField txtCantidadAdornos;

    @FXML
    private TextField txtColor;

    @FXML
    private TextField txtDiseño;

    @FXML
    private TextField txtReferencia;

    @FXML
    private TextArea txtResultado;

    @FXML
    private TextField txtTalla;

    @FXML
    private TextField txtTipoBlusa;

    @FXML
    void onAdornada(ActionEvent event) {
        crearblusaAdornada();

    }


    @FXML
    void onBasica(ActionEvent event) {
        crearblusaBasica();
    }

    @FXML
    void onEstampada(ActionEvent event) {
        crearblusaEstampada();
    }

    @FXML
    void onAgregarBlusa(ActionEvent event) {
        agregarBlusa();
    }

    @FXML
    void initialize() {

    }

    private Blusa blusa;

    private void crearblusaAdornada() {
        blusa = Blusa.builder()
                .referencia(txtReferencia.getText())
                .talla(txtTalla.getText())
                .color(txtColor.getText())
                .tipoBlusa(txtTipoBlusa.getText())
                .tipoAdorno(txtAdorno.getText())
                .cantidadAdorno(Integer.parseInt(txtCantidadAdornos.getText()))
                .build();
    }

    private void crearblusaBasica() {
        blusa = Blusa.builder()
                .referencia(txtReferencia.getText())
                .talla(txtTalla.getText())
                .color(txtColor.getText())
                .tipoBlusa(txtTipoBlusa.getText())
                .build();
    }

    private void crearblusaEstampada() {
        blusa = Blusa.builder()
                .referencia(txtReferencia.getText())
                .talla(txtTalla.getText())
                .color(txtColor.getText())
                .tipoBlusa(txtTipoBlusa.getText())
                .diseno(txtDiseño.getText())
                .altoDiseno(Integer.parseInt(txtAltoDiseño.getText()))
                .anchoDiseno(Integer.parseInt(txtAnchoDiseño.getText()))
                .build();
    }

    private void agregarBlusa() {
        txtResultado.setText(blusa.toString());

    }


}
