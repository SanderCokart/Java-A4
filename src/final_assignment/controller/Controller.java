package final_assignment.controller;

import final_assignment.model.Model;
import final_assignment.view.View;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Controller {
    private Model model;
    private View view;

    public Controller(Model model, View view){
        this.model = model;
        this.view = view;
        setupTextFieldKeyListener();
        setupCancelActionListener();
        setupCancelAllActionListener();
        setupNumberpadActionListener();
        setupOperatorpadActionListener();
        setupBackspaceButtonActionListener();
        setupFactorialButtonActionListener();
        setupSquaredButtonActionListener();
        setupSquaredRootButtonActionListener();
    }//constructor

    private void setupSquaredRootButtonActionListener() {
        view.getSquareRootButton().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (view.getTextFieldText().length() > 0){
                    model.setNumber1(Double.parseDouble(view.getTextFieldText()));
                    view.setTextFieldText(model.calculateSquareRoot());
                }
            }
        });
    }//setup of the squareRootButton actionListener

    private void setupSquaredButtonActionListener() {
        view.getSquaredButton().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (view.getTextFieldText().length() > 0){
                    model.setNumber1(Double.parseDouble(view.getTextFieldText()));
                    view.setTextFieldText(model.calculateSquared());
                }
            }
        });
    }//setup of the squareButton actionListener

    private void setupFactorialButtonActionListener() {
        view.getFactorialButton().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (view.getTextFieldText().length() > 0) {
                    model.setNumber1(Double.parseDouble(view.getTextFieldText()));
                    view.setTextFieldText(model.calculateFactorial());
                }
            }
        });
    }//setup of the factorialButton actionListener

    private void setupBackspaceButtonActionListener() {
        view.getBackspaceButton().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (view.getTextFieldText().length() > 0){
                    view.setTextFieldText(view.getTextFieldText().substring(0, view.getTextFieldText().length() - 1));
                }
            }
        });
    }//setup of the backspaceButton actionListener

    private void setupOperatorpadActionListener() {
        for (int i = 0; i < view.getKeyOperatorpadArray().length; i++) {
            int loopTracker = i;

            view.getKeyOperatorpadArray()[loopTracker].addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if (view.getTextFieldText().length() > 0){
                        switch (view.getKeyOperatorpadArray()[loopTracker].getText()) {
                            case "+":
                                model.setOperator('+');
                                model.setOperatorIsPressed(true);
                                model.setNumber1(Double.parseDouble(view.getTextFieldText()));
                                view.setTextFieldText("");
                                break;
                            case "-":
                                model.setOperator('-');
                                model.setOperatorIsPressed(true);
                                model.setNumber1(Double.parseDouble(view.getTextFieldText()));
                                view.setTextFieldText("");
                                break;
                            case "*":
                                model.setOperator('*');
                                model.setOperatorIsPressed(true);
                                model.setNumber1(Double.parseDouble(view.getTextFieldText()));
                                view.setTextFieldText("");
                                break;
                            case "/":
                                model.setOperator('/');
                                model.setOperatorIsPressed(true);
                                model.setNumber1(Double.parseDouble(view.getTextFieldText()));
                                view.setTextFieldText("");
                                break;
                            case "=":
                                model.setNumber2(Double.parseDouble(view.getTextFieldText()));
                                view.setTextFieldText(model.calculate());
                                model.reset();
                                break;
                        }
                    }
                }
            });
        }
    }//setup of operatorKeypads actionListener

    private void setupNumberpadActionListener() {
        for (int i = 0; i < view.getKeyNumberpadArray().length; i++) {
            int loopTracker = i;

            view.getKeyNumberpadArray()[loopTracker].addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    view.setTextFieldText(view.getTextFieldText() + view.getKeyNumberpadArray()[loopTracker].getText());
                }
            });
        }
    }//setup of numberedKeypads actionListener

    private void setupCancelAllActionListener() {
        view.getCaButton().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                view.setTextFieldText("");
                model.reset();
            }
        });
    }//setup of cancelEverythingButton actionListener

    private void setupCancelActionListener() {
        view.getcButton().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                view.setTextFieldText("");
            }
        });
    }//setup of cancelButton actionListener

    private void setupTextFieldKeyListener() {
        view.getTextField().addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {

            }

            @Override
            public void keyPressed(KeyEvent e) {

            }

            @Override
            public void keyReleased(KeyEvent e) {
                if (view.getTextFieldText().length() > 0){
                    if (!model.getOperatorIsPressed()){
                        switch (e.getKeyChar()){
                            case '+':
                                model.setOperator('+');
                                model.setOperatorIsPressed(true);
                                model.setNumber1(Double.parseDouble(view.getTextFieldText()));
                                view.setTextFieldText("");
                                break;

                            case '-':
                                model.setOperator('-');
                                model.setOperatorIsPressed(true);
                                model.setNumber1(Double.parseDouble(view.getTextFieldText()));
                                view.setTextFieldText("");
                                break;

                            case '*':
                                model.setOperator('*');
                                model.setOperatorIsPressed(true);
                                model.setNumber1(Double.parseDouble(view.getTextFieldText()));
                                view.setTextFieldText("");
                                break;

                            case '/':
                                model.setOperator('/');
                                model.setOperatorIsPressed(true);
                                model.setNumber1(Double.parseDouble(view.getTextFieldText()));
                                view.setTextFieldText("");
                                break;
                        }
                    }
                    if (e.getKeyChar() == '=' && model.getOperatorIsPressed() || e.getKeyCode() == 10 && model.getOperatorIsPressed()){
                        model.setNumber2(Double.parseDouble(view.getTextFieldText()));
                        view.setTextFieldText(model.calculate());
                        model.setOperatorIsPressed(false);
                    }
                }
            }
        });
    }//setup of textField actionListener
}
