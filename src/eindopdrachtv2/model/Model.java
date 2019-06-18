package eindopdrachtv2.model;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

public class Model {
    //PROPERTIES
    private double number1 = 0;
    private double number2 = 0;
    private String operator = "";
    private double result = 0;
    private String keyPressed = "";
    private PropertyChangeSupport pcs = new PropertyChangeSupport("this");

    //CONSTRUCTOR
    public Model(){

    }

    //PROPERTY CHANGE LISTENER START
    public void addPropertyChangeListener(PropertyChangeListener listener) {
        this.pcs.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        this.pcs.removePropertyChangeListener(listener);
    }
    //PROPERTY CHANGE LISTENER END

    //GETTERS AND SETTERS START
    public void setKeyPressed(String keyPressed) {
        String oldValue = this.keyPressed;
        this.keyPressed = keyPressed;
        this.pcs.firePropertyChange("keyPressed",oldValue,keyPressed);
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public void setNumber1(double number1) {
        this.number1 = number1;
    }

    public void setNumber2(double number2) {
        this.number2 = number2;
    }
    //GETTERS AND SETTERS END

    //CALCULATION METHOD
    public double calculate() {
        switch (operator){
            case "+":
                result = number1 + number2;
                number1 = result;
                return result;
            case "-":
                result = number1 - number2;
                number1 = result;
                return result;
            case "*":
                result = number1 * number2;
                number1 = result;
                return result;
            case "/":
                if (number1 == 0 || number2 == 0){//IF ANY NUMBER  = 0 RETURN 0
                    number1 = result;
                    return 0;
                } else {
                    result = number1 / number2;
                    number1 = result;
                    return result;
                }
        }
        return 0;
    }

    //KEY PRESSED SETTERS & GETTERS END

}
