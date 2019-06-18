package version1_manager;

import version1_manager.Controller.Controller;

import javax.swing.*;
import java.awt.*;

public class Runner {
    public static void main(String[] args){
        JFrame frame = new JFrame();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300,300);
        frame.add(new Controller());
        frame.setLayout(new GridLayout());
    }
}