package Calculator.view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class View{
    //COMPONENTS START
    private JTextField textField;
    private JPanel calculatorPanel;
    private JButton cButton;
    private JButton caButton;
    private JButton keypad0;
    private JButton keypad1;
    private JButton keypad2;
    private JButton keypad3;
    private JButton keypad4;
    private JButton keypad5;
    private JButton keypad6;
    private JButton keypad7;
    private JButton keypad8;
    private JButton keypad9;
    private JButton keypadDot;
    private JButton keypadEquals;
    private JButton keypadPlus;
    private JButton keypadMinus;
    private JButton keypadMultiply;
    private JButton keypadDivide;
    private JButton backspaceButton;
    private JButton factorialButton;
    private JButton squaredButton;
    private JButton[] keyNumberpadArray;
    private JButton[] keyOperatorpadArray;
    private boolean darkmodeEnabled;
    //COMPONENTS END

    public View(){
        createFrame("Calculator");
        filterTextfield();
        initNumberKeypadArray();
        initOperatorKeypadArray();
        setDarkmodeEnabled(true);
        }//constructor

    private void initOperatorKeypadArray() {
        keyOperatorpadArray = new JButton[5];
        keyOperatorpadArray[0] = keypadEquals;
        keyOperatorpadArray[1] = keypadPlus;
        keyOperatorpadArray[2] = keypadMinus;
        keyOperatorpadArray[3] = keypadMultiply;
        keyOperatorpadArray[4] = keypadDivide;
    }//initializes an array containing all operator buttons

    private void initNumberKeypadArray() {
        keyNumberpadArray = new JButton[11];
        keyNumberpadArray[0] = keypad0;
        keyNumberpadArray[1] = keypad1;
        keyNumberpadArray[2] = keypad2;
        keyNumberpadArray[3] = keypad3;
        keyNumberpadArray[4] = keypad4;
        keyNumberpadArray[5] = keypad5;
        keyNumberpadArray[6] = keypad6;
        keyNumberpadArray[7] = keypad7;
        keyNumberpadArray[8] = keypad8;
        keyNumberpadArray[9] = keypad9;
        keyNumberpadArray[10] = keypadDot;
    }//initializes an array containing all numbered button

    private void filterTextfield() {
        textField.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
            }

            @Override
            public void keyPressed(KeyEvent e) {

            }

            @Override
            public void keyReleased(KeyEvent e) {
                if (!textField.getText().isEmpty()){
                    textField.setText(textField.getText().replaceAll(",","."));
                    textField.setText(textField.getText().replaceAll("[^0-9.]", ""));
                }
            }
        });
    }//removes any characters that are non-numeric from the textField

    private void createFrame(String name) {
        JFrame frame = new JFrame(name);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setContentPane(calculatorPanel);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        frame.setSize(300,400);
    }//initializes the frame

    public String getTextFieldText() {
        return textField.getText();
    }//returns textField text

    public void setTextFieldText(String input) {
        this.textField.setText(input);
    }//sets textField text

    public JTextField getTextField() {
        return textField;
    }//returns textField object

    public JButton getCaButton() {
        return caButton;
    }//returns caButton object

    public JButton getcButton() {
        return cButton;
    }//returns cButton object

    public JButton[] getKeyNumberpadArray() {
        return keyNumberpadArray;
    }//returns array of keyNumberpadArray

    public JButton[] getKeyOperatorpadArray() {
        return keyOperatorpadArray;
    }//returns keyOperatorpadArray

    public JButton getBackspaceButton() {
        return backspaceButton;
    }//returns backspaceButton object

    public JButton getFactorialButton() {
        return factorialButton;
    }//returns factorialButton object

    public JButton getSquaredButton() {
        return squaredButton;
    }//returns squareButton object

    public void setDarkmodeEnabled(boolean darkmodeEnabled) {
        this.darkmodeEnabled = darkmodeEnabled;
        if (darkmodeEnabled){
            for (int i = 0; i <getKeyOperatorpadArray().length ; i++) {
                getKeyOperatorpadArray()[i].setBackground(Color.BLACK);
            }
            for (int i = 0; i < getKeyNumberpadArray().length; i++) {
                getKeyNumberpadArray()[i].setBackground(Color.BLACK);
            }
            caButton.setBackground(Color.black);
            cButton.setBackground(Color.black);
            squaredButton.setBackground(Color.black);
            factorialButton.setBackground(Color.black);
            backspaceButton.setBackground(Color.black);

        }
    }
}
