package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import java.util.ArrayList;
import java.util.Vector;

public class Controller {
    @FXML
    private TextField textField;

    public void buttonClicked(ActionEvent actionEvent) {
        String t = textField.getText();
        String buttonName = ((Button) actionEvent.getTarget()).getText();
        textField.setText(t + buttonName);
    }

    public void clearTextField(ActionEvent actionEvent) {
        textField.setText("");
    }

    public void Calculate(ActionEvent actionEvent) {
        ArrayList<String> objects = new ArrayList<>();
        String text = textField.getText();
        int numbStart = 0;
        int numbEnd = 0;
        for (int i = 0; i < text.length(); i++) {
            switch (text.charAt(i)){
                case '+':
            }
        }
    }

}
