package org.example.tipcalculator;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;

public class TipCalcController {

    @FXML
    private TextField amountInputField;
    @FXML
    private TextField taxPercentInputField;
    @FXML
    private TextField tipPercentInputField;
    @FXML
    private TextField taxPercentField;
    @FXML
    private TextField tipPercentField;
    @FXML
    private TextField totalField;



    //FROM THIS POINT WE HAVE BUTTONS
    @FXML
    private void calculateButton() {
        try {
            double amount = Double.parseDouble(amountInputField.getText());
            String tipPercentString = tipPercentInputField.getText();
            double tipPercent = Double.parseDouble(tipPercentInputField.getText());
            Tip tip = new Tip(amount, tipPercent);

            if (!taxPercentInputField.getText().isEmpty()) {
                double taxPercent = Double.parseDouble(taxPercentInputField.getText());
                tip.setTaxRate(taxPercent);
            }

            taxPercentField.setText(String.format("$ %.2f", tip.calculateTax()));
            tipPercentField.setText(String.format("$ %.2f", tip.calculateTip()));
            totalField.setText(String.format("$ %.2f", tip.calculateTotal()));
        }
        catch (NumberFormatException e) {


            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setHeaderText("Invalid Input");
            alert.setContentText("Please enter a valid amount.");

            alert.showAndWait();

        }

    }


    @FXML
    private void clearButton() {
        amountInputField.setText("");
        taxPercentInputField.setText("");
        tipPercentInputField.setText("");
        taxPercentField.setText("");
        tipPercentField.setText("");
        totalField.setText("");
    }


}







