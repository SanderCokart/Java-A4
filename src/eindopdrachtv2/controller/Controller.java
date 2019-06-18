package eindopdrachtv2.controller;

import eindopdrachtv2.model.Model;
import eindopdrachtv2.view.View;

import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class Controller implements PropertyChangeListener {
    private Model model;//LOCAL MODEL
    private View view;//LOCAL VIEW

    //LOCAL BUTTONS
    private JButton[] numberKeypads;//LOCAL NUMBER KEYPADS
    private JButton[] operatorKeypads;//LOCAL OPERATOR KEYPADS

    //CONSTRUCTOR
    public Controller(View view, Model model) {
        this.model = model;//SETS LOCAL MODEL
        this.view = view;//SETS LOCAL VIEW
        model.addPropertyChangeListener(this);//ADD CONTROLLER TO PROPERTY CHANGE LISTENER

        this.numberKeypads = view.getNumberKeypads();//SETS LOCAL NUMBER KEYPADS
        this.operatorKeypads = view.getOperatorKeypads();//SETS LOCAL OPERATOR KEYPADS

        for (int i = 0; i < numberKeypads.length; i++) {//LOOP NUMBER KEYPADS
            int loopTracker = i;//LOOP TRACKER

            //WHEN A NUMBER KEYPAD IS CLICKED
            numberKeypads[i].addMouseListener(new MouseListener() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    //NOT USED
                }

                @Override
                public void mousePressed(MouseEvent e) {
                    model.setKeyPressed(numberKeypads[loopTracker].getText());

                }

                @Override
                public void mouseReleased(MouseEvent e) {
                    model.setKeyPressed("");
                }

                @Override
                public void mouseEntered(MouseEvent e) {
                    //NOT USED
                }

                @Override
                public void mouseExited(MouseEvent e) {
                    //NOT USED
                }
            });//END OF MOUSE LISTENER
        }//END OF LOOP

        for (int i = 0; i < operatorKeypads.length; i++) {//START OF OPERATOR KEYPADS LOOP
            int loopTracker = i;//LOOP TRACKER

            //WHEN YOU CLICK ON AN OPERATOR
            operatorKeypads[loopTracker].addMouseListener(new MouseListener() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    //NOT USED
                }

                @Override
                public void mousePressed(MouseEvent e) {//WHEN MOUSE IS CLICKED ON AN OPERATOR
                    if (view.getInputText() != ""){//IF THE LABEL IS NOT EMPTY
                        if (operatorKeypads[loopTracker].getText() == "="){//IF YOU CLICK ON EQUALS
                            model.setNumber2(Double.parseDouble(view.getInputText()));//SET NUMBER 2
                            view.setInputText(String.valueOf(model.calculate()));//SETS LABEL TO CALCULATION
                            model.setOperator("");//REMOVES OPERATOR PROPERTY
                            model.setNumber2(0);//RESET NUMBER2
                        } else {//IF YOU DO NOT PRESS THE EQUALS BUTTON
                            model.setNumber1(Double.parseDouble(view.getInputText()));//SET NUMBER 1 TO LABEL TEXT
                            model.setOperator(operatorKeypads[loopTracker].getText());//SET OPERATOR TO OPERATOR PRESSED
                            view.setInputText("");//REMOVES THE LABEL TEXT
                        }
                    }
                }

                @Override
                public void mouseReleased(MouseEvent e) {
                    //NOT USED
                }

                @Override
                public void mouseEntered(MouseEvent e) {
                    //NOT USED
                }

                @Override
                public void mouseExited(MouseEvent e) {
                    //NOT USED
                }
            });//END OF MOUSE LISTENER

        }//END OF LOOP

        //WHEN YOU CLICK ON CANCEL
        view.getCancelButton().addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                //NOT USED
            }

            @Override
            public void mousePressed(MouseEvent e) {
                if (view.getInputText() != "") {
                    view.setInputText(view.getInputText().substring(0, view.getInputText().length() - 1));
                }
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                //NOT USED
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                //NOT USED
            }

            @Override
            public void mouseExited(MouseEvent e) {
                //NOT USED
            }
        });

        //WHEN YOU CLICK ON CANCEL ALL BUTTON
        view.getCancelAllButton().addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                //NOT USED
            }

            @Override
            public void mousePressed(MouseEvent e) {
                view.setInputText("");
                model.setNumber1(0);
                model.setNumber2(0);
                model.setOperator("");
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                //NOT USED
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                //NOT USED
            }

            @Override
            public void mouseExited(MouseEvent e) {
                //NOT USED
            }
        });

    }

    @Override
    public void propertyChange(PropertyChangeEvent evt) {//PROPERTY CHANGE
        if (evt.getPropertyName().equals("keyPressed")) {//IF KEY PRESSED CHANGES
            view.setInputText(view.getInputText() + evt.getNewValue().toString());//SET THE LABEL TEXT TO OLD VALUE + INPUT
        }
    }
}
