module simpleJavaFXcalculator {
    requires javafx.controls;
    requires javafx.fxml;

    opens org.simple.calculator to javafx.fxml;

    exports org.simple.calculator;
}