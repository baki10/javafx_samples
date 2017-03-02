package com.bakigoal.shapes2d;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.stage.Stage;

public class LineExample extends Application {

  @Override
  public void start(Stage primaryStage) throws Exception {
    //Creating a line object
    Line line = new Line();

    //Setting the properties to a line
    line.setStartX(0.0);
    line.setStartY(0.0);
    line.setEndX(500.0);
    line.setEndY(150.0);

    //Creating a Group
    Group root = new Group(line);
    Scene scene = new Scene(root, 600, 300);
    scene.setFill(Color.CYAN);

    primaryStage.setTitle("Sample application");
    primaryStage.setScene(scene);
    primaryStage.show();
  }

  public static void main(String[] args) {
    launch(args);
  }

}
