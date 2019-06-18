package assignment4.Controller;

import assignment4.Model.Model;
import assignment4.View.View;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class Controller extends JPanel{
    JButton clickButton;
    private View view;
    private Model model;

    public Controller(){
        model = new Model();
        view = new View();
        this.add(view);

        clickButton = new JButton("Generate Name");
        clickButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                view.setDisplayName(model.getNameArray());
            }
        });
        this.add(clickButton);
    }
}
