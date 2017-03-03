package com.bakigoal.oracle.stage2;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class LoginPageWithCss extends Application {
  @Override
  public void start(Stage primaryStage) throws Exception {
    GridPane root = new GridPane();
    root.setAlignment(Pos.CENTER);
    root.setHgap(10);
    root.setVgap(10);
    root.setPadding(new Insets(25, 25, 25, 25));

    // title
    Text sceneTitle = new Text("Welcome");
    sceneTitle.setId("welcome-text");
    root.add(sceneTitle, 0, 0, 2, 1);

    // username
    Label usernameLabel = new Label("User Name:");
    root.add(usernameLabel, 0, 1);
    TextField usernameTextField = new TextField();
    root.add(usernameTextField, 1, 1);

    // password
    Label passwordLabel = new Label("Password:");
    root.add(passwordLabel, 0, 2);
    PasswordField passwordField = new PasswordField();
    root.add(passwordField, 1, 2);

    // button
    Button btn = new Button("Sign in");
    HBox hbBtn = new HBox(10);
    hbBtn.setAlignment(Pos.BOTTOM_RIGHT);
    hbBtn.getChildren().add(btn);
    root.add(hbBtn, 1, 4);

    // log
    final Text actionTarget = new Text();
    actionTarget.setId("actionTarget");
    root.add(actionTarget, 1, 6);

    // button listener
    btn.setOnAction(e -> {
      actionTarget.setText("Sign in button pressed");
    });

    // add root pane to scene
    Scene scene = new Scene(root, 500, 400);
    scene.setFill(Color.CYAN);
    scene.getStylesheets().add(LoginPageWithCss.class.getResource("Login.style").toExternalForm());

    primaryStage.setScene(scene);
    primaryStage.setTitle("Hello world");
    primaryStage.show();
  }

  public static void main(String[] args) {
    launch(args);
  }

}
