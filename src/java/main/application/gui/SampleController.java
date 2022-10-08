package src.java.main.application.gui;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import src.java.main.application.gui.util.Alerts;

import java.util.Random;

public class SampleController {

    @FXML
    private Label myMessage;


    @FXML
    public void onClickHereAction() {
        Random random = new Random();
        int rd1 = random.nextInt(10);
        int rd2 = random.nextInt(10);

        int value = rd1 - rd2;

        if(value > 0){
            Alerts.showAlert("Congratulation", "Positive Number", "Congratulations the number has been accepted", Alert.AlertType.INFORMATION);
        }
        else if (value < 0){
            Alerts.showAlert("Error", "Ops! Negative Number", "Ops ! Number is not included in the criteria", Alert.AlertType.ERROR);
        }
        else {
            Alerts.showAlert("UUUh", "Almost", "Number was in the middle\n", Alert.AlertType.WARNING);
        }
        myMessage.setText(String.valueOf(value));
    }
}
