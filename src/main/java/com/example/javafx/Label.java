package com.example.javafx;
import javafx.application.Application;
import javafx.scene.*;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.stage.*;
import javafx.geometry.*;


public class Label extends Application {
Buttons buttons = new Buttons();
    Sum sum = new Sum();
    @Override
    public void start(Stage stage) throws Exception {

        stage.setTitle("Calculator");

        BorderPane borderPane = new BorderPane();
        borderPane.setPadding(new Insets(10,50,50,50));

        Scene scene = new Scene(borderPane, 200,200);



        stage.setScene(scene);
        sum.start(stage);
        buttons.buttons(stage);


        stage.setResizable(false);

        stage.show();


       ;
    }

    public static void main(String[] args) {
        launch(args);
    }


}
