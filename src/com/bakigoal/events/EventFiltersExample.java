package com.bakigoal.events;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class EventFiltersExample extends Application {
  @Override
  public void start(Stage stage) {
    //Drawing a Circle
    Circle circle = new Circle();

    //Setting the position of the circle
    circle.setCenterX(300.0f);
    circle.setCenterY(135.0f);

    //Setting the radius of the circle
    circle.setRadius(25.0f);

    //Setting the color of the circle
    circle.setFill(Color.BROWN);

    //Setting the stroke width of the circle
    circle.setStrokeWidth(20);

    //Setting the text
    Text text = new Text("Click on the circle to change its color");

    //Setting the font of the text
    text.setFont(Font.font(null, FontWeight.BOLD, 15));

    //Setting the color of the text
    text.setFill(Color.CRIMSON);

    //setting the position of the text
    text.setX(150);
    text.setY(50);

    //Registering the event filter
    circle.addEventFilter(MouseEvent.MOUSE_CLICKED, event -> {
      System.out.println("Mouse Clicked. event: " + event);
      circle.setFill(Color.DARKSLATEBLUE);
    });

    //Creating a Group object
    Group root = new Group(circle, text);

    //Creating a scene object
    Scene scene = new Scene(root, 600, 300);

    //Setting the fill color to the scene
    scene.setFill(Color.LAVENDER);

    //Setting title to the Stage
    stage.setTitle("Event Filters Example");

    //Adding scene to the stage
    stage.setScene(scene);

    //Displaying the contents of the stage
    stage.show();
  }

  public static void main(String args[]) {
    launch(args);
  }
}