package org.simple.calculator;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class Controller {
    private float result = 0;
    private String action = "";

    @FXML
    private TextField textField1;

    @FXML
    private Button btn_1;

    @FXML
    private void clickButton1(ActionEvent event) {
        String value = textField1.getText();
        textField1.setText(value + "1");
    }

    @FXML
    private Button btn_2;

    @FXML
    private void clickButton2(ActionEvent event) {
        String value = textField1.getText();
        textField1.setText(value + "2");
    }

    @FXML
    private Button btn_3;

    @FXML
    private void clickButton3(ActionEvent event) {
        String value = textField1.getText();
        textField1.setText(value + "3");
    }

    @FXML
    private Button btn_4;

    @FXML
    private void clickButton4(ActionEvent event) {
        String value = textField1.getText();
        textField1.setText(value + 4);
    }

    @FXML
    private Button btn_5;

    @FXML
    private void clickButton5(ActionEvent event) {
        String value = textField1.getText();
        textField1.setText(value + "5");
    }

    @FXML
    private Button btn_6;

    @FXML
    private void clickButton6(ActionEvent event) {
        String value = textField1.getText();
        textField1.setText(value + "6");
    }

    @FXML
    private Button btn_7;

    @FXML
    private void clickButton7(ActionEvent event) {
        String value = textField1.getText();
        textField1.setText(value + "7");
    }

    @FXML
    private Button btn_8;

    @FXML
    private void clickButton8(ActionEvent event) {
        String value = textField1.getText();
        textField1.setText(value + "8");
    }

    @FXML
    private Button btn_9;

    @FXML
    private void clickButton9(ActionEvent event) {
        String value = textField1.getText();
        textField1.setText(value + "9");
    }

    @FXML
    private Button btn_0;

    @FXML
    private void clickButton0(ActionEvent event) {
        String value = textField1.getText();
        textField1.setText(value + "0");
    }

    @FXML
    private Button btn_plus;

    @FXML
    private void clickButtonPlus(ActionEvent event) {
        this.result = Float.valueOf(textField1.getText());
        this.action = "plus";
        textField1.setText("");
    }

    @FXML
    private Button btn_minus;

    @FXML
    private void clickButtonMinus(ActionEvent event) {
        this.result = Float.valueOf(textField1.getText());
        this.action = "minus";
        textField1.setText("");
    }

    @FXML
    private Button btn_multiplication;

    @FXML
    private void clickButtonMultiplication(ActionEvent event) {
        this.result = Float.valueOf(textField1.getText());
        this.action = "multiplication";
        textField1.setText("");
    }

    @FXML
    private Button btn_division;

    @FXML
    private void clickButtonDivision(ActionEvent event) {
        this.result = Float.valueOf(textField1.getText());
        this.action = "division";
        textField1.setText("");
    }

    @FXML
    private Button btn_equality;

    @FXML
    private void clickButtonEquality(ActionEvent event) {
        Float firstValue = this.result;
        Float secondValue = Float.valueOf(textField1.getText());
        float result = 0F;
        switch (this.action) {
            case "plus":
                result = firstValue + secondValue;
                break;
             case "minus":
                 result = firstValue - secondValue;
                break;
             case "division":
                 result = firstValue / secondValue;
                break;
            case "multiplication":
                result = firstValue * secondValue;
                break;
        }
        textField1.setText(Float.toString(result));
    }

    @FXML
    private Button btn_clear;

    @FXML
    private void clickButtonClear(ActionEvent event) {
        this.result = 0;
        this.action = "";
        textField1.setText("");
    }
}
