package com.bakigoal.effects;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.effect.Blend;
import javafx.scene.effect.BlendMode;
import javafx.scene.effect.ColorInput;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class BlendEffectExample extends Application {
  @Override
  public void start(Stage stage) {
    //Drawing a Circle
    Circle circle = new Circle();

    //Setting the center of the Circle
    circle.setCenterX(75.0f);
    circle.setCenterY(75.0f);

    //Setting radius of the circle
    circle.setRadius(30.0f);

    //Setting the fill color of the circle
    circle.setFill(Color.BROWN);

    //Instantiating the blend class
    Blend blend = new Blend();

    //Preparing the to input object
    ColorInput topInput = new ColorInput(35, 30, 75, 40, Color.BLUEVIOLET);

    //setting the top input to the blend object
    blend.setTopInput(topInput);

    //setting the blend mode
    blend.setMode(BlendMode.DARKEN);

    //Applying the blend effect to circle
    circle.setEffect(blend);

    //Creating a Group object
    Group root = new Group(circle);

    Scene scene = new Scene(root, 600, 300);
    stage.setTitle("blend effect example");
    stage.setScene(scene);
    stage.show();
  }

  public static void main(String args[]) {
    launch(args);
  }
}