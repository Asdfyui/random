package sample;

import javafx.scene.control.Label;
import java.util.ArrayList;

public class Controller {

    public ArrayList<String> numbers = new ArrayList<>();
    public ArrayList<Integer> addArray = new ArrayList<>();
    public ArrayList<Integer> multiplyArray = new ArrayList<>();
    public ArrayList<Integer> subtractArray = new ArrayList<>();


    public Label Total;


    public void Zero() {
        addNumber("0");
    }

    public void One() {
        addNumber("1");
    }

    public void Two() {
        addNumber("2");

    }

    public void Three() {
        addNumber("3");
    }

    public void Four() {
        addNumber("4");
    }

    public void Five() {
        addNumber("5");
    }

    public void Six() {
        addNumber("6");
    }

    public void Seven() {
        addNumber("7");

    }

    public void Eight() {
        addNumber("8");

    }

    public void Nine() {
        addNumber("9");
    }

    public void Add() {
        clickOperator();
        numbers.add("+");
    }

    public void Subtract() {
        clickOperator();
        numbers.add("-");
    }

    public void Multiply() {
        clickOperator();
        numbers.add("*");
    }

    public void Equals() {
        clickOperator();
        int count2 = 1;
        int count = 0;
        int addedCount = 0;
        int subtractedCount = 0;
        int multipliedCount = 0;
        int added = 0;
        int subtracted = 0;
        int multiplied = 0;
        int addedA = 0;
        int subtractedA = 0;
        int multipliedA = 0;
        for (int i = 1; i <= numbers.size(); ++i) {
            if (count2 < numbers.size()) {
                if (numbers.get(count2).equals("+"))
                {

                    if (count + 2 <= numbers.size()) {
                        if (addedCount == 0) {
                            addArray.add(Integer.parseInt(numbers.get(count)) + Integer.parseInt(numbers.get(count + 2)));
                            added = addArray.get(addedA);
                            addedCount++;
                        }
                        if (addedCount != 0) {
                            addArray.add(addArray.get(addedA) + Integer.parseInt(numbers.get(count + 2)));
                            addedA++;
                            added = addArray.get(addedA);


                        }
                    }
                }
                if (numbers.get(count2).equals("-"))
                {
                    if (count + 2 <= numbers.size()) {
                        if (subtractedCount == 0) {
                            subtractArray.add(Integer.parseInt(numbers.get(count)) - Integer.parseInt(numbers.get(count + 2)));
                            subtracted = subtractArray.get(subtractedA);
                            subtractedCount++;
                        }
                        if (subtractedCount != 0) {
                            subtractArray.add(addArray.get(subtractedA) - Integer.parseInt(numbers.get(count + 2)));
                            subtractedA++;
                            subtracted = subtractArray.get(addedA);


                        }
                    }
                }
                if (numbers.get(count2).equals("*"))
                {
                    if (count == 0) {
                        multiplied = Integer.parseInt(numbers.get(count)) * Integer.parseInt(numbers.get(count + 2));
                    }
                    if (count != 0) {
                        multiplied = multiplied * Integer.parseInt(numbers.get(count)) * Integer.parseInt(numbers.get(count + 2));
                    }
                }
            }

        count2++;
        count2++;
        count++;
        count++;


    }
        Total.setText(String.valueOf(added + subtracted + multiplied));


    }


    public void Clear() {
        numbers.clear();
        addArray.clear();
        subtractArray.clear();
        Total.setText("0");
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
