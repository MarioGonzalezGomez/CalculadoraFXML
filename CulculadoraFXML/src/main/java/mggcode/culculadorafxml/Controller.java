package mggcode.culculadorafxml;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {
    private Modelo md;
    @FXML
    private Label pantalla;

    public Controller() {
        md = new Modelo();
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        pantalla.setText("0");
    }

    @FXML
    void limpiar(ActionEvent event) {
        pantalla.setText("");
    }


    @FXML
    void manejarBotonNumerico(ActionEvent event) {
        if (pantalla.getText().equals("0")) {
            pantalla.setText(((Button) event.getSource()).getText());
        } else
            pantalla.setText(pantalla.getText() + ((Button) event.getSource()).getText());
    }

    @FXML
    void manejarBotonOperacion(ActionEvent event) {
        md.setOperador1(Double.parseDouble(pantalla.getText()));
        md.setTipoOperator(((Button) event.getSource()).getText());
        pantalla.setText("");
    }

    @FXML
    void manejarBotonResultado(ActionEvent event) {
        md.setOperador2(Double.parseDouble(pantalla.getText()));
        pantalla.setText("" + md.getResultado());

    }

}

