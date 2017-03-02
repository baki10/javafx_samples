package com.bakigoal.shapes2d;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class RectangleExample extends Application {

  @Override
  public void start(Stage stage) throws Exception {
    //Drawing a RectangleExample
    Rectangle rectangle = new Rectangle();

    //Setting the properties of the rectangle
    rectangle.setX(150.0f);
    rectangle.setY(75.0f);
    rectangle.setWidth(300.0f);
    rectangle.setHeight(150.0f);

    //Creating a Group object
    Group root = new Group(rectangle);

    //Creating a scene object
    Scene scene = new Scene(root, 600, 300);

    //Setting title to the Stage
    stage.setTitle("Drawing a Rectangle");

    //Adding scene to the stage
    stage.setScene(scene);

    //Displaying the contents of the stage
    stage.show();
  }

  public static void main(String[] args) {
    launch(args);
  }

}
