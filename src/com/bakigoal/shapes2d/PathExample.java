package com.bakigoal.shapes2d;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.LineTo;
import javafx.scene.shape.MoveTo;
import javafx.scene.shape.Path;
import javafx.scene.shape.StrokeType;
import javafx.stage.Stage;

public class PathExample extends Application {
  @Override
  public void start(Stage stage) {
    //Creating a Path
    Path path = new Path();

    //Moving to the starting point
    MoveTo moveTo = new MoveTo(100, 120);

    //Creating 1st line
    LineTo line1 = new LineTo(350, 120);

    //Creating 2nd line
    LineTo line2 = new LineTo(135, 250);

    //Creating 3rd line
    LineTo line3 = new LineTo(232, 50);

    //Creating 4th line
    LineTo line4 = new LineTo(315, 250);

    //Creating 4th line
    LineTo line5 = new LineTo(100, 120);

    //Adding all the elements to the path
    path.getElements().add(moveTo);
    path.getElements().addAll(line1, line2, line3, line4, line5);

    path.setStrokeType(StrokeType.OUTSIDE);
    path.setFill(Color.RED);
    path.setStroke(Color.CYAN);

    //Creating a Group object
    Group root = new Group(path);

    //Creating a scene object
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
