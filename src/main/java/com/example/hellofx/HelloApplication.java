package com.example.hellofx;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.input.KeyCombination;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class HelloApplication extends Application {


    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        // Stage stage = new Stage();
        Group root = new Group();
        Scene scene = new Scene(root, Color.LIGHTPINK);

        Image icon = new Image("tech.png");

        stage.getIcons().add(icon);
        stage.setTitle("Stage Demo Program!");
        stage.setWidth(420);
        stage.setHeight(420);
        stage.setResizable(false);
        //stage.setX(100);
        stage.setFullScreen(true);
        stage.setFullScreenExitHint("You can't Exit unless you press m");
        stage.setFullScreenExitKeyCombination(KeyCombination.valueOf("m"));

        stage.setScene(scene);
        stage.show();
    }
}