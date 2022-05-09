package com.example.javafx;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Buttons  {

    public void buttons(Stage stage){
        Button addition = new Button("+");
        Button subtraction = new Button("-");
        Button multiplication = new Button("*");
        Button division = new Button("/");
        Button equals = new Button("=");



        addition.setStyle("-fx-padding: 25;");
        subtraction.setStyle("-fx-padding: 25;");
        multiplication.setStyle("-fx-padding: 25;");
        division.setStyle("-fx-padding: 25;");
        equals.setPrefHeight(138);
        equals.setPrefWidth(50);

        addition.setTranslateY(100);addition.setTranslateX(60);
        subtraction.setTranslateY(170);subtraction.setTranslateX(60);
        multiplication.setTranslateY(170);
        division.setTranslateY(100);
        equals.setTranslateY(100);equals.setTranslateX(130);
        TextField textField = new TextField();

        HBox hbox = new HBox();
        hbox.getChildren().add(textField);
        hbox.setTranslateX(20);hbox.setTranslateY(50);

        addition.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                if(addition.isPressed()){
                    textField.setText("hi");
                    textField.getText();
                }
            }
        });

        Group root = new Group(addition,subtraction,multiplication,division,equals,hbox);
        Scene scene = new Scene(root, 185,240);
        stage.setScene(scene);

    }
}
