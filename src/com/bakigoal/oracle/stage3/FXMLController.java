package com.bakigoal.oracle.stage3;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.text.Text;

public class FXMLController {
  @FXML
  private Text actionTarget;

  public void handleSubmitButtonAction(ActionEvent actionEvent) {
    actionTarget.setText("Sign in button pressed");
  }
}
