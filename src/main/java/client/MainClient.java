package client;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

/**
 * main for client application - chat app on tcp/ip with javafx
 */
public class MainClient extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {

//        login window Start
        FXMLLoader loaderLogin = new FXMLLoader(getClass().getResource("/client/LoginGuiMain.fxml"));
        Parent rootLogin = loaderLogin.load();
        Scene sceneLogin = new Scene(rootLogin, 235, 218);
        Stage stageLogin = new Stage();
        stageLogin.setTitle("Login");
        stageLogin.setScene(sceneLogin);
        stageLogin.showAndWait();
//        login window wait for nick and accept

        Socket clientSocket = new Socket("127.0.0.1", 6666);

        PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);
        BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));

        //start for main window
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/client/GuiMain.fxml"));
        Parent root = loader.load();
        Scene scene = new Scene(root, 734, 573);
        Stage stage = new Stage();
        stage.setTitle("Chat Application");
        stage.setScene(scene);
        stage.show();


//        Platform.exit();
    }
}
