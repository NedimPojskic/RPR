package com.example.lv6z1;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class CalcController {
    String display = null;
    @FXML
    private Label number_display;

    @FXML
    protected void onHelloButtonClick() {
        number_display.setText(display);
    }
}