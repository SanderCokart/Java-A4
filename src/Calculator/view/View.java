package Calculator.view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

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
    private JCheckBox darkModeCheckBox;
    private JToolBar toolBar;
    private JButton squareRootButton;
    private JButton[] keyNumberpadArray;
    private JButton[] keyOperatorpadArray;
    private JButton[] otherButtonsArray;
    private boolean darkMode = true;
    //COMPONENTS END

    public View(){
        createFrame("Calculator");
        filterTextField();
        initNumberKeypadArray();
        initOperatorKeypadArray();
        initOtherButtonsArray();
        initColors();
        removeFocus();
        setupDarkModeCheckBoxActionListener();
    }//constructor

    private void setupDarkModeCheckBoxActionListener() {
        darkModeCheckBox.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {

            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {
                if (!darkModeCheckBox.isSelected()){
                    darkMode = false;
                    textField.setBackground(Color.gray);
                    textField.setForeground(Color.black);
                    calculatorPanel.setBackground(Color.gray);
                    toolBar.setBackground(Color.gray);
                    for (int i = 0; i < keyNumberpadArray.length; i++) {
                        if (keyNumberpadArray[i].getText().equals(".")){
                            keypadDot.setBackground(Color.lightGray);
                            keypadDot.setForeground(Color.black);
                        } else {
                            keyNumberpadArray[i].setBackground(Color.white);
                            keyNumberpadArray[i].setForeground(Color.black);
                        }
                    }

                    for (int i = 0; i < keyOperatorpadArray.length; i++) {
                        keyOperatorpadArray[i].setBackground(Color.lightGray);
                        keyOperatorpadArray[i].setForeground(Color.black);
                    }

                    for (int i = 0; i < otherButtonsArray.length; i++) {
                        otherButtonsArray[i].setBackground(Color.lightGray);
                        otherButtonsArray[i].setForeground(Color.black);
                    }

                } else {
                    darkMode = true;
                    textField.setBackground(new Color(31,31,31));
                    textField.setForeground(Color.white);
                    calculatorPanel.setBackground(new Color(31,31,31));
                    toolBar.setBackground(new Color(31,31,31));
                    for (int i = 0; i < keyNumberpadArray.length; i++) {
                        if (keyNumberpadArray[i].getText().equals(".")){
                            keypadDot.setBackground(new Color(19,19,19));
                            keypadDot.setForeground(Color.white);
                        } else {
                            keyNumberpadArray[i].setBackground(new Color(0,0,0));
                            keyNumberpadArray[i].setForeground(Color.white);
                        }

                    }
                    for (int i = 0; i < keyOperatorpadArray.length; i++) {
                        keyOperatorpadArray[i].setBackground(new Color(19,19,19));
                        keyOperatorpadArray[i].setForeground(Color.white);
                    }
                    for (int i = 0; i < otherButtonsArray.length; i++) {
                        otherButtonsArray[i].setBackground(new Color(19,19,19));
                        otherButtonsArray[i].setForeground(Color.white);
                    }
                }
            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });
    }//sets colors for hovering over buttons dependent on dark mode

    private void removeFocus() {
        for (int i = 0; i < getKeyNumberpadArray().length; i++) {
            getKeyNumberpadArray()[i].setFocusable(false);
        }
        for (int i = 0; i < getKeyOperatorpadArray().length; i++) {
            getKeyOperatorpadArray()[i].setFocusable(false);
        }
        for (int i = 0; i < otherButtonsArray.length; i++) {
            otherButtonsArray[i].setFocusable(false);
        }
    }//makes all elements except for the textField to be focusable

    private void initColors() {
        toolBar.setBackground(new Color(31,31,31));
        toolBar.setBorder(null);
        darkModeCheckBox.setBackground(new Color(31,31,31));
        darkModeCheckBox.setForeground(Color.white);
        darkModeCheckBox.setBorder(null);
        calculatorPanel.setBackground(new Color(31,31,31));
        textField.setBackground(new Color(31,31,31));
        textField.setForeground(Color.white);
        textField.setBorder(null);
        colorizeNumberButtons();
        colorizeOperatorButtons();
        colorizeOtherButtons();
    }//sets up default colors of items otherwise unreachable

    private void colorizeOtherButtons() {
        for (int i = 0; i < otherButtonsArray.length; i++) {
            otherButtonsArray[i].setBorder(null);
            int loopTracker = i;
            otherButtonsArray[i].addMouseListener(new MouseListener() {
                @Override
                public void mouseClicked(MouseEvent e) {

                }

                @Override
                public void mousePressed(MouseEvent e) {

                }

                @Override
                public void mouseReleased(MouseEvent e) {

                }

                @Override
                public void mouseEntered(MouseEvent e) {
                    if (darkMode) {
                        otherButtonsArray[loopTracker].setBackground(new Color(31,31,31));
                    } else {
                        otherButtonsArray[loopTracker].setBackground(Color.gray);
                    }
                }

                @Override
                public void mouseExited(MouseEvent e) {
                    if (darkMode) {
                        otherButtonsArray[loopTracker].setBackground(new Color(19,19,19));
                    } else {
                        otherButtonsArray[loopTracker].setBackground(Color.lightGray);
                    }
                }
            });
        }
    }//determines the colors of the other buttons it is dependent on dark mode

    private void colorizeOperatorButtons() {
        for (int i = 0; i < keyOperatorpadArray.length; i++) {
            keyOperatorpadArray[i].setBorder(null);
            int loopTracker = i;
            keyOperatorpadArray[i].addMouseListener(new MouseListener() {
                @Override
                public void mouseClicked(MouseEvent e) {

                }

                @Override
                public void mousePressed(MouseEvent e) {

                }

                @Override
                public void mouseReleased(MouseEvent e) {

                }

                @Override
                public void mouseEntered(MouseEvent e) {
                    keyOperatorpadArray[loopTracker].setBackground(new Color(221,0,0));
                }

                @Override
                public void mouseExited(MouseEvent e) {
                    if (darkMode) {
                        getKeyOperatorpadArray()[loopTracker].setBackground(new Color(19, 19, 19));
                    } else {
                        getKeyOperatorpadArray()[loopTracker].setBackground(Color.lightGray);
                    }
                }
            });
        }
    }//determines the colors of the operator buttons it is dependent on dark mode

    private void colorizeNumberButtons() {
        for (int i = 0; i < keyNumberpadArray.length; i++) {
            keyNumberpadArray[i].setBorder(null);
            int loopTracker = i;
            keyNumberpadArray[i].addMouseListener(new MouseListener() {
                @Override
                public void mouseClicked(MouseEvent e) {

                }

                @Override
                public void mousePressed(MouseEvent e) {

                }

                @Override
                public void mouseReleased(MouseEvent e) {

                }

                @Override
                public void mouseEntered(MouseEvent e) {
                    if (darkMode) {
                        keyNumberpadArray[loopTracker].setBackground(new Color(31, 31, 31));
                    } else {
                        keyNumberpadArray[loopTracker].setBackground(Color.gray);
                    }
                }

                @Override
                public void mouseExited(MouseEvent e) {
                    if (darkMode) {
                        if (keyNumberpadArray[loopTracker].getText().equals(".")){
                            keyNumberpadArray[loopTracker].setBackground(new Color(19,19,19));
                        } else {
                            keyNumberpadArray[loopTracker].setBackground(new Color(0,0,0));
                        }
                    } else {
                        if (keyNumberpadArray[loopTracker].getText().equals(".")) {
                            keypadDot.setBackground(Color.lightGray);
                        } else {
                            keyNumberpadArray[loopTracker].setBackground(Color.white);
                        }
                    }
                }
            });
        }
    }//determines the colors of the number buttons it is dependent on dark mode

    private void initOtherButtonsArray() {
        otherButtonsArray = new JButton[6];
        otherButtonsArray[0] = backspaceButton;
        otherButtonsArray[1] = factorialButton;
        otherButtonsArray[2] = cButton;
        otherButtonsArray[3] = caButton;
        otherButtonsArray[4] = squaredButton;
        otherButtonsArray[5] = squareRootButton;
    }//initializes an array containing all operator buttons

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

    private void filterTextField() {
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
        frame.setSize(400,500);
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
    }//returns ceButton object

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

    public JButton getSquareRootButton() {
        return squareRootButton;
    }
}
