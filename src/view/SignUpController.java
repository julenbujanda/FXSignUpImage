package view;

import javafx.fxml.FXML;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

/**
 * Clase controlador para SignUp.fxml
 * @author Julen Bujanda
 */
public class SignUpController {

    @FXML
    private ImageView imgExit;

    /**
     * Es llamado al hacer click en el botón de cerrar
     */
    public void exit() {
        ((Stage) imgExit.getScene().getWindow()).close();
    }

}
