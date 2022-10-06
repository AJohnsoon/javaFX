package src.java.main.application.gui;

import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class SampleController {

    @FXML
    private Button clickHere;

    @FXML
    public void onClickHereAction() {
        System.out.println("Clicked");
    }
}
