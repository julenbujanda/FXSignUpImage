package view;

import javafx.fxml.FXML;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

public class SignUpController {

    @FXML
    private ImageView imgExit;

    public void exit() {
        ((Stage) imgExit.getScene().getWindow()).close();
    }

}
