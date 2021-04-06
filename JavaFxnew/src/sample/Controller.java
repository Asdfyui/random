package sample;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Controller {

    public TextField textGetName;
    public Button btnGetName;
    public TextField textAdd;
    public TextField textSubtract;
    public Label lblTotal;
    public Button btnSubtract;
    public Button btnAdd;
    public double total = 0;

    public void printName(ActionEvent actionEvent) {
        String name = textGetName.getText();
        System.out.println(name);
    }

    public void subtract(ActionEvent actionEvent) {
        double num = Double.parseDouble(textSubtract.getText());
        total -= num;
        lblTotal.setText(Double.toString(total));
        textSubtract.clear();
    }

    public void add(ActionEvent actionEvent) {
        double num = Double.parseDouble(textAdd.getText());
        total += num;
        lblTotal.setText(Double.toString(total));
        textAdd.clear();
    }
}
