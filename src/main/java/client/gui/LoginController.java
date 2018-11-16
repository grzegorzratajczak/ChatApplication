package client.gui;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * Controller class for login window
 */
public class LoginController {

//    @Getter
//    public UserDetails userDetails = new UserDetails();

    @FXML
    private TextField loginText;

    @FXML
    private Button loginButton;


    @FXML
    void loginAction(ActionEvent actionEvent) {
//        userDetails.setNick(logintext.getText());
        Stage stage = (Stage) loginButton.getScene().getWindow();
        stage.close();
//        Settings.userDetails = userDetails;
    }
}
