package ru.bashmakova.bashmakova_task6;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class SumController {

    @FXML
    private Button btnButton;

    @FXML
    private TextField nTextField;

    @FXML
    private Label resultLabel;

    @FXML
    void btnButtonOnAction(ActionEvent event) {
        int N = Integer.parseInt(nTextField.getText().toString());
        int Num = 0;
        while (N > 0) {
            int d = N % 10;
            Num = Num * 10 + d;
            N = N / 10;
        }
        resultLabel.setText(" " + Num);
    }
}