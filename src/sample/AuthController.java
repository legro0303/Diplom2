package sample;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class AuthController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private PasswordField passAuth;

    @FXML
    private TextField loginAuth;

    @FXML
    private Button buttonAuth;

    @FXML
    private Hyperlink linkAuth;

    @FXML
    void initialize() {

    }
}
