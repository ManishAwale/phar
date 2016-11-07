package com.phar;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * Created by Sam on 11/6/2016.
 */

public class Main extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("main.fxml"));
        primaryStage.setTitle("Purchase Entry!!");
        primaryStage.setScene(new Scene(root, 600, 575));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
        System.out.println("Pushed from git...by manish");
    }
}





