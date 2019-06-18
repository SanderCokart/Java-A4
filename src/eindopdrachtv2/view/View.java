package eindopdrachtv2.view;

import javax.swing.*;
import java.awt.*;

public class View extends JFrame {
    private JPanel calculatorPanel;
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
    private JButton keypadEquals;
    private JButton keypadMinus;
    private JButton keypadPlus;
    private JButton keypadMultiply;
    private JButton keypadDivide;
    private JButton keypadDecimal;
    private JButton cancelButton;
    private JButton cancelAllButton;
    private JTextField input;

    private JButton[] numberKeypads;
    private JButton[] operatorKeypads;

    public View(){
        numberKeypads = new JButton[11];
        numberKeypads[0] = keypad0;
        numberKeypads[1] = keypad1;
        numberKeypads[2] = keypad2;
        numberKeypads[3] = keypad3;
        numberKeypads[4] = keypad4;
        numberKeypads[5] = keypad5;
        numberKeypads[6] = keypad6;
        numberKeypads[7] = keypad7;
        numberKeypads[8] = keypad8;
        numberKeypads[9] = keypad9;
        numberKeypads[10] = keypadDecimal;

        operatorKeypads = new JButton[5];
        operatorKeypads[0] = keypadEquals;
        operatorKeypads[1] = keypadMinus;
        operatorKeypads[2] = keypadPlus;
        operatorKeypads[3] = keypadMultiply;
        operatorKeypads[4] = keypadDivide;

        this.setContentPane(calculatorPanel);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setSize(500,500);
        this.setTitle("Calculator Java Swing");
        this.setVisible(true);
        this.setResizable(false);
        input.setPreferredSize(new Dimension(500,65));
    }

    public JButton[] getOperatorKeypads() {
        return operatorKeypads;
    }

    public JButton[] getNumberKeypads() {
        return numberKeypads;
    }

    public JButton getCancelButton() {
        return cancelButton;
    }

    public JButton getCancelAllButton() {
        return cancelAllButton;
    }

    public void setInputText(String input) {
        this.input.setText(input);
    }

    public String getInputText() {
        return input.getText();
    }
}
