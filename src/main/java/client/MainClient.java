package client;

import javafx.application.Application;
import javafx.application.Platform;
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

        Socket clientSocket = new Socket("10.0.133.134", 6666);

        PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);
        BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));

        Platform.exit();
    }
}
