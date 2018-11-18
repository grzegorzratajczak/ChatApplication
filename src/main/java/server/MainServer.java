package server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class MainServer {

    public static void main(String[] args) throws IOException {

        ServerSocket serverSocket = new ServerSocket(6666);
        Socket clientSocket = serverSocket.accept();

        ConnectionHandler connectionHandler = new ConnectionHandler(clientSocket);
        connectionHandler.run();
//        PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);
//        BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
//
//        String inputLine;
//        while ((inputLine = in.readLine()) != null) {
//            out.println(inputLine);
    }
}

