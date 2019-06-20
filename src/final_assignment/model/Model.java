package final_assignment.model;

import java.util.Random;

public class Model {//calculator
    private double number1;//first number
    private double number2;//second number
    private char operator;//operator
    private boolean operatorIsPressed = false;//boolean - check condition

    public Model(){
    }//constructor

    public void setNumber1(double number1) {
        this.number1 = number1;
    }//sets first number

    public void setNumber2(double number2) {
        this.number2 = number2;
    }//sets second number;

    public void setOperator(char operator) {
        this.operator = operator;;
    }//sets operator

    public void setOperatorIsPressed(boolean operatorIsPressed) {
        this.operatorIsPressed = operatorIsPressed;
    }//sets boolean - check condition

    public boolean getOperatorIsPressed(){
        return operatorIsPressed;
    }//getter for boolean - check condition

    public String calculate() {
        switch (operator){//switch dependent on operator
            case '+':
                Random rand = new Random();
                int randomNumber = rand.nextInt(100);
                if (randomNumber < 90) {
                    return String.valueOf(number1 + number2);//calculate plus
                } else {//EASTER EGG
                    return "Hubs " + String.valueOf(number1 + number2);
                }
            case '-':
                return String.valueOf(number1 - number2);//calculate minus
            case '*':
                return String.valueOf(number1 * number2);//calculate multiply
            case '/':
                if (number1 != 0 || number2 != 0) {//if one of the 2 numbers is 0;
                    return String.valueOf(number1 / number2);//return result
                } else {//if there is a 0 present then
                    return String.valueOf(0);//return 0
                        }
        }
        return String.valueOf(0);//terminator
    }//calculation method

    public void reset() {
        number1 = 0;
        number2 = 0;
        operator = Character.MIN_VALUE;
        setOperatorIsPressed(false);
    }//resets all properties to default

    public String calculateFactorial(){
        int fact = 1;
        for(int i = 1; i <= number1; i++){
            fact=fact*i;
        }
        return String.valueOf(fact);
    }//calculation of factorials

    public String calculateSquared(){
        return String.valueOf(number1 * number1);
    }//calculate square of number

    public String calculateSquareRoot(double number) {
        return String.valueOf(Math.sqrt(number));
    }//calculates square root of number
}
