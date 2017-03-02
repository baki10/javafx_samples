package com.bakigoal.shapes2d;

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class TextExample extends Application {

  @Override
  public void start(Stage primaryStage) throws Exception {
    //Creating a TextExample object
    Text text = new Text("Hello world!");
    //Setting font to the text
    text.setFont(new Font(45));
    //setting the position of the text
    text.setX(50);
    text.setY(150);

    //Creating a Group
    Group root = new Group();
    //Retrieving the observable list object
    ObservableList<Node> list = root.getChildren();
    //Setting the text object as a node to the group object
    list.add(text);

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
