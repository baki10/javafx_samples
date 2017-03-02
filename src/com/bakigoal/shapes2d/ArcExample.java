package com.bakigoal.shapes2d;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.shape.Arc;
import javafx.stage.Stage;

public class ArcExample extends Application {
  @Override
  public void start(Stage stage) {
    //Drawing an Arc
    Arc arc = new Arc();

    //Setting the properties of the arc
    double radius = 100.0f;
    arc.setCenterX(300.0f);
    arc.setCenterY(135.0f);
    arc.setRadiusX(radius);
    arc.setRadiusY(radius);
    arc.setStartAngle(0.0f);
    arc.setLength(270.0f);

    //Creating arc Group object
    Group root = new Group(arc);

    //Creating arc scene object
    Scene scene = new Scene(root, 600, 300);
    //Setting title to the Stage
    stage.setTitle("Drawing");

    //Adding scene to the stage
    stage.setScene(scene);

    //Displaying the contents of the stage
    stage.show();
  }

  public static void main(String[] args) {
    launch(args);
  }

}
