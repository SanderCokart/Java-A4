package Calculator.model;

public class Model {
    private double number1;
    private double number2;
    private char operator;
    private boolean operatorIsPressed = false;

    public Model(){
        System.out.println(operator);
    }

    public void setNumber1(double number1) {
        this.number1 = number1;
    }

    public void setNumber2(double number2) {
        this.number2 = number2;
    }

    public void setOperator(char operator) {
        this.operator = operator;
    }

    public void setOperatorIsPressed(boolean operatorIsPressed) {
        this.operatorIsPressed = operatorIsPressed;
    }

    public boolean getOperatorIsPressed(){
        return operatorIsPressed;
    }

    public String calculate() {
        switch (operator){
            case '+':
                return String.valueOf(number1 + number2);
            case '-':
                return String.valueOf(number1 - number2);
            case '*':
                return String.valueOf(number1 * number2);
            case '/':
                if (number1 != 0 || number2 != 0) {
                    return String.valueOf(number1 / number2);
                } else {
                    return String.valueOf(0);
                }
        }
        return String.valueOf(0);
    }

    public void reset() {
        number1 = 0;
        number2 = 0;
        operator = Character.MIN_VALUE;
        setOperatorIsPressed(false);
    }
}
