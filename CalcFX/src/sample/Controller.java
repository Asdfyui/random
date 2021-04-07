package sample;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.util.ArrayList;

public class Controller {

    
    public ArrayList <String> numbers = new ArrayList<>();
    public Label Total;


    public void Zero(ActionEvent actionEvent) {
        addNumber("0");
    }

    public void One(ActionEvent actionEvent) {
        addNumber("1");
    }

    public void Two(ActionEvent actionEvent) {
        addNumber("2");

    }

    public void Three(ActionEvent actionEvent) {
        addNumber("3");
    }

    public void Four(ActionEvent actionEvent) {
        addNumber("4");
    }

    public void Five(ActionEvent actionEvent) {
        addNumber("5");
    }

    public void Six(ActionEvent actionEvent) {
        addNumber("6");
    }

    public void Seven(ActionEvent actionEvent) {
        addNumber("7");

    }

    public void Eight(ActionEvent actionEvent) {
        addNumber("8");

    }

    public void Nine(ActionEvent actionEvent) {
        addNumber("9");
    }

    public void Add(ActionEvent actionEvent) {
       clickOperator();
    }

    public void Subtract(ActionEvent actionEvent) {
        clickOperator();

    }

    public void Multiply(ActionEvent actionEvent) {
        clickOperator();
    }

    public void Equals(ActionEvent actionEvent) {
    }

    public void Clear(ActionEvent actionEvent) {
    }

    private void addNumber(String num){
        String number = Total.getText() + num;
        if (number.charAt(0) == '0'){
            number = num;
        }

        Total.setText(number);
    }
    public void clickOperator(){
        numbers.add(Total.getText());
            Total.setText("0");
    }


}
