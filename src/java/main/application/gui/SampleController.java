package src.java.main.application.gui;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import src.java.main.application.gui.util.Alerts;

import java.util.Random;

public class SampleController {

    @FXML
    private Button clickHere;

    @FXML
    public void onClickHereAction() {
        Random random = new Random();
        int rd1 = random.nextInt(10);
        int rd2 = random.nextInt(10);

        int value = rd1 - rd2;

        if(value > 0){
            Alerts.showAlert("Congratulation", "Gzz", "congratulations the number has been accepted", Alert.AlertType.INFORMATION);
            System.out.println(value);
        }
        else if (value < 0){
            Alerts.showAlert("Error", "Ops!", "Ops ! Number is not included in the criteria", Alert.AlertType.ERROR);
            System.out.println(value);
        }
        else {
            Alerts.showAlert("UUUh", "Almost", "Number was in the middle\n", Alert.AlertType.WARNING);
            System.out.println(value);
        }

    }
}
