package version1_manager.Controller;

import version1_manager.Model.Model;
import version1_manager.View.MainMenu;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Timer;
import java.util.TimerTask;

public class Controller extends JPanel{
    JButton clickButton;
    JButton resetButton;
    JTextField inputField;
    JButton submitInputField;

    private MainMenu view;
    private Model model;

    public Controller(){
        model = new Model();
        view = new MainMenu();
        this.add(view);
        clickButton = new JButton("+1");
        clickButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                model.increase();
                view.setDisplay(String.valueOf(model.getCounter()));
            }
        });

        resetButton  = new JButton("Reset");
        resetButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                model.reset();
                view.setDisplay(String.valueOf(model.getCounter()));
            }
        });

        inputField = new JTextField();
        submitInputField = new JButton("Submit");
        submitInputField.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String input = inputField.getText();
                if (input.matches("[0-9]+")){
                    view.setDisplay(input);
                    model.setCounter(Integer.parseInt(input));
                    inputField.setText("");
                } else {
                    String value = Integer.toString(model.getCounter());
                    view.setDisplay("You need to enter a number");
                    Timer timer = new Timer();
                    TimerTask timerTask = new TimerTask() {
                        @Override
                        public void run() {
                            view.setDisplay(Integer.toString(model.getCounter()));
                        }
                    };
                    timer.schedule(timerTask, 1000);
                }
            }
        });

        this.add(clickButton);
        this.add(resetButton);
        this.add(inputField);
        inputField.setPreferredSize(new Dimension(200,50));
        this.add(submitInputField);


        view.revalidate();
        view.repaint();
    }
}