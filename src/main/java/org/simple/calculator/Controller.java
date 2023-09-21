package org.simple.calculator;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class Controller {
    private float result = 0;
    private String action = "";

    @FXML
    private Label labelResult;

    @FXML
    private Pane btn_1;

    @FXML
    private void clickButton1(MouseEvent event) {
        String value = labelResult.getText();
        labelResult.setText(value + "1");
    }

    @FXML
    private Pane btn_2;

    @FXML
    private void clickButton2(MouseEvent event) {
        String value = labelResult.getText();
        labelResult.setText(value + "2");
    }

    @FXML
    private Pane btn_3;

    @FXML
    private void clickButton3(MouseEvent event) {
        String value = labelResult.getText();
        labelResult.setText(value + "3");
    }

    @FXML
    private Pane btn_4;

    @FXML
    private void clickButton4(MouseEvent event) {
        String value = labelResult.getText();
        labelResult.setText(value + 4);
    }

    @FXML
    private Pane btn_5;

    @FXML
    private void clickButton5(MouseEvent event) {
        String value = labelResult.getText();
        labelResult.setText(value + "5");
    }

    @FXML
    private Pane btn_6;

    @FXML
    private void clickButton6(MouseEvent event) {
        String value = labelResult.getText();
        labelResult.setText(value + "6");
    }

    @FXML
    private Pane btn_7;

    @FXML
    private void clickButton7(MouseEvent event) {
        String value = labelResult.getText();
        labelResult.setText(value + "7");
    }

    @FXML
    private Pane btn_8;

    @FXML
    private void clickButton8(MouseEvent event) {
        String value = labelResult.getText();
        labelResult.setText(value + "8");
    }

    @FXML
    private Pane btn_9;

    @FXML
    private void clickButton9(MouseEvent event) {
        String value = labelResult.getText();
        labelResult.setText(value + "9");
    }

    @FXML
    private Pane btn_0;

    @FXML
    private void clickButton0(MouseEvent event) {
        String value = labelResult.getText();
        labelResult.setText(value + "0");
    }

    @FXML
    private Pane btn_plus;

    @FXML
    private void clickButtonPlus(MouseEvent event) {
        this.result = Float.valueOf(labelResult.getText());
        this.action = "plus";
        labelResult.setText("");
    }

    @FXML
    private Pane btn_minus;

    @FXML
    private void clickButtonMinus(MouseEvent event) {
        this.result = Float.parseFloat(labelResult.getText());
        this.action = "minus";
        labelResult.setText("");
    }

    @FXML
    private Pane btn_multiplication;

    @FXML
    private void clickButtonMultiplication(MouseEvent event) {
        this.result = Float.valueOf(labelResult.getText());
        this.action = "multiplication";
        labelResult.setText("");
    }

    @FXML
    private Pane btn_division;

    @FXML
    private void clickButtonDivision(MouseEvent event) {
        this.result = Float.valueOf(labelResult.getText());
        this.action = "division";
        labelResult.setText("");
    }

    @FXML
    private Pane btn_equality;

    @FXML
    private void clickButtonEquality(MouseEvent event) {
        Float firstValue = this.result;
        Float secondValue = Float.valueOf(labelResult.getText());
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
        labelResult.setText(Float.toString(result));
    }

    @FXML
    private Pane btn_clear;

    @FXML
    private void clickButtonClear(MouseEvent event) {
        this.result = 0;
        this.action = "";
        labelResult.setText("");
    }

    @FXML private Pane titlePane;
    @FXML private ImageView btnMinimize, btnClose;

    private double x, y;


    public void init(Stage stage) {
        titlePane.setOnMousePressed(mouseEvent -> {
            x = mouseEvent.getSceneX();
            y = mouseEvent.getSceneY();
        });
        titlePane.setOnMouseDragged(mouseEvent -> {
            stage.setX(mouseEvent.getScreenX()-x);
            stage.setY(mouseEvent.getScreenY()-y);
        });

        btnClose.setOnMouseClicked(mouseEvent -> stage.close());
        btnMinimize.setOnMouseClicked(mouseEvent -> stage.setIconified(true));
    }

}
