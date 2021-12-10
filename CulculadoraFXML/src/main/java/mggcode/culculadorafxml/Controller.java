package mggcode.culculadorafxml;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class Controller {

    public class PleaseProvideControllerClassName {

        Modelo md = new Modelo();

        @FXML
        private Button botonPunto;

        @FXML
        private Button dividir;

        @FXML
        private Button igual;

        @FXML
        private Button mas;

        @FXML
        private Button menos;

        @FXML
        private Button multiplicar;

        @FXML
        private Button n0;

        @FXML
        private Button n1;

        @FXML
        private Button n2;

        @FXML
        private Button n3;

        @FXML
        private Button n4;

        @FXML
        private Button n5;

        @FXML
        private Button n6;

        @FXML
        private Button n7;

        @FXML
        private Button n8;

        @FXML
        private Button n9;

        @FXML
        private Button reset;

        @FXML
        private Label pantalla;

        @FXML
        void limpiar(ActionEvent event) {
            pantalla.setText("");
        }

        @FXML
        void manejarBotonNumerico(ActionEvent event) {
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

}