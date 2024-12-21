package ru.bashmakova.bashmakova_task5;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class SumController {

    @FXML
    private TextField NTextField;

    @FXML
    private Button btnButton;

    @FXML
    private Label kLabel;

    @FXML
    private Label sumLabel;

    @FXML
    void btnButtonOnAction(ActionEvent event) {
        int n = Integer.parseInt(NTextField.getText().toString());
        int k = 0;
        int sum = 0;
        while (sum < n) {
            k++;
            sum = sum + k;
        }
        kLabel.setText(" "+k);
        sumLabel.setText(" " + sum);
    }
}