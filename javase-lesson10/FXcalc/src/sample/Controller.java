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
        ArrayList<String> operands = new ArrayList<>();
        ArrayList<Double> numbers = new ArrayList<>();
        String text = textField.getText();
        int numbStart = 0;
        int numbEnd;

        //Reading operands and numbers
        String temp;
        for (int i = 0; i < text.length(); i++) {
            switch (text.charAt(i)) {
                case '+':
                    numbEnd = i - 1;
                    operands.add("+");
                    temp = "";
                    for (int j = numbStart; j <= numbEnd; j++) {
                        temp += text.charAt(j);
                    }
                    numbers.add(Double.parseDouble(temp));
                    numbStart = i + 1;
                    break;
                case '-':
                    numbEnd = i - 1;
                    operands.add("-");
                    temp = "";
                    for (int j = numbStart; j <= numbEnd; j++) {
                        temp += text.charAt(j);
                    }
                    numbers.add(Double.parseDouble(temp));
                    numbStart = i + 1;
                    break;
                case 'x':
                    numbEnd = i - 1;
                    operands.add("x");
                    temp = "";
                    for (int j = numbStart; j <= numbEnd; j++) {
                        temp += text.charAt(j);
                    }
                    numbers.add(Double.parseDouble(temp));
                    numbStart = i + 1;
                    break;
                case '/':
                    numbEnd = i - 1;
                    operands.add("/");
                    temp = "";
                    for (int j = numbStart; j <= numbEnd; j++) {
                        temp += text.charAt(j);
                    }
                    numbers.add(Double.parseDouble(temp));
                    numbStart = i + 1;
                    break;
            }
        }
        temp = "";
        numbEnd = text.length() - 1;
        for (int j = numbStart; j <= numbEnd; j++) {
            temp += text.charAt(j);
        }
        numbers.add(Double.parseDouble(temp));

        while (operands.size() != 0) {
            for (int i = 0; i < operands.size(); i++) {
                if (operands.size() != 0) {
                    if (operands.get(i) == "x") {
                        Double temp1 = numbers.get(i) * numbers.get(i + 1);
                        numbers.remove(i);
                        numbers.remove(i);
                        numbers.add(i, temp1);
                        operands.remove(i);
                        if (i != 0) {
                            i--;
                        }
                    }
                }
                if (operands.size() != 0) {
                    if (operands.get(i) == "/") {
                        Double temp1 = numbers.get(i) / numbers.get(i + 1);
                        numbers.remove(i);
                        numbers.remove(i);
                        numbers.add(i, temp1);
                        operands.remove(i);
                        if (i != 0) {
                            i--;
                        }
                    }
                }
            }
            for (int i = 0; i < operands.size(); i++) {
                if (operands.size() != 0) {
                    if (operands.get(i) == "+") {
                        Double temp1 = numbers.get(i) + numbers.get(i + 1);
                        numbers.remove(i);
                        numbers.remove(i);
                        numbers.add(i, temp1);
                        operands.remove(i);
                        if (i != 0) {
                            i--;
                        }
                    }
                }
                if (operands.size() != 0) {
                    if (operands.get(i) == "-") {
                        Double temp1 = numbers.get(i) - numbers.get(i + 1);
                        numbers.remove(i);
                        numbers.remove(i);
                        numbers.add(i, temp1);
                        numbers.add(i, temp1);
                        operands.remove(i);
                        if (i != 0) {
                            i--;
                        }
                    }
                }
            }
        }


        textField.setText(numbers.get(0).toString());
    }

}
