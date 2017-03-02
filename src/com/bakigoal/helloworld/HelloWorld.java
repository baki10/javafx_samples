package com.bakigoal.helloworld;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class HelloWorld extends Application {
  @Override
  public void start(Stage primaryStage) throws Exception {
    Group group = new Group();
    Scene scene = new Scene(group, 600, 300);
    scene.setFill(Color.CYAN);

    primaryStage.setTitle("Hello world");
    primaryStage.setScene(scene);
    primaryStage.show();
  }

  public static void main(String[] args) {
    launch(args);
  }

}
